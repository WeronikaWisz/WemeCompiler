# WemeCompiler

**1.  Tytuł programu**
 
  Kompilator własnego języka Weme do języka JavaScript
  
**2. Zaprojektowany przez**
  * Emilia Mączka 
  * Weronika Wisz 

**3. Założenia programu**
  * Główne cele i założenia projektu: zaprojektowanie własnego języka Weme, który będzie składał się z podstawowych typów danych, operacji arytmetycznych i logicznych, pętli, funkcji oraz klas
  * Rodzaj translatora: Kompilator
  * Planowany wynik działania programu: stworzenie kompilatora języka Weme do JavaScript
  * Planowany język implementacji: implementacja kompilatora w języku Java
  * Sposób realizacji skanera/parsera: zastosowanie generatora parserów ANTLR4.

----

**4. Opis tokenów**

```
STRING : '"' .*? '"';
NUMBER: ('-')? (Digits | Digits '.' Digits);
TRUE : 'true' ;
FALSE : 'false';
NULL : 'null';
AND:'and';
OR: 'or';
NOT: '!';
IF: 'if';
ELSE : 'else';
FOR: 'for';
WHILE: 'while';
FUNCTION: 'fun';
CLASS: 'class';
PRINT: 'print'
RETURN: 'return';
SUPER: 'super';
THIS: 'this';
VAR: 'var';
COLON : ':' ;
SEMICOLON: ';';
COMMA : ',' ;
DOT: '.';
MINUS: '-';
PLUS: '+';
DIV: '/';
MUL: '*';
EQUAL: '=';
DOUBLE_EQUAL: '==';
NOT_EQUAL: '!=';
GREATER: '>';
GREATER_EQUAL: '>=';
LESS: '<';
LESS_EQUAL: '<=';
LBRACKET : '(';
RBRACKET : ')';
LBRACE : '{' ;
RBRACE : '}' ;
INHERIT : 'inherit';
WS : [ \t\r\n]+ -> skip ;
IDENT: Letter LetterOrDigit*;

fragment Letter
	: [a-zA-Z$_]
        ;

fragment LetterOrDigit
       : Letter
       | [0-9]
       ;

fragment Digits
	: (0 | ([1-9] [0-9]*))
	;
```

**5. Gramatyka formatu**

```
program
	: declaration* EOF
	;

declaration
	: statement
    | varDeclaration
	| funDeclaration
    | classDeclaration
    ;

varDeclaration
	: VAR IDENT ( EQUAL expression )? SEMICOLON
	;

funDeclaration
        : FUNCTION function
        ;

classDeclaration
	: CLASS IDENT (INHERIT IDENT)? LBRACE function* RBRACE
	;

function
	: IDENT LBRACKET RBRACKET block
	| IDENT LBRACKET parameters RBRACKET block
	;

parameters
	: IDENT (COMMA IDENT)*
	;

statement
	: expression SEMICOLON
	| ifSt
	| ifElseSt
	| whileSt
	| forSt
	| printSt
	| returnSt
	| block
	;

ifSt
	: IF LBRACKET expression RBRACKET statement
	;

ifElseSt
	: IF LBRACKET expression RBRACKET statement ELSE statement
    ;

whileSt
	: WHILE LBRACKET expression RBRACKET statement
	;

forSt
	: FOR LBRACKET (varDeclaration | expression SEMICOLON | SEMICOLON) expression? SEMICOLON expression? RBRACKET statement
	;

printSt
	: PRINT expression SEMICOLON
	;

returnSt
	: RETURN expression? SEMICOLON
	;

block
	: LBRACE declaration* RBRACE
	;

expression
	:  assignment
	;

assignment
	: (call DOT) ? IDENT EQUAL assignment
	| orOperation
	;

call
	: primary ( group | DOT IDENT) *
	;

primary
	: TRUE
	| FALSE
	| NULL
	| THIS
	| NUMBER
	| STRING
	| IDENT
	| LBRACKET expression RBRACKET
	| SUPER DOT IDENT
	;

group
	: LBRACKET arguments? RBRACKET
	;

arguments
	: expression ( COMMA expression )*
	;

orOperation
	: andOperation ( OR andOperation)*
	;

andOperation
	: eqOperation ( AND eqOperation)*
	;

eqOperation
	: compOperation ( ( DOUBLE_EQUAL | NOT_EQUAL ) compOperation) *
	;
compOperation
	: sumOperation (LESS | LESS_EQUAL | GREATER | GREATER_EQUAL sumOperation)*
	;

sumOperation
	: mulOperation (( PLUS | MINUS) mulOperation)*
	;

mulOperation
	: unary (( MUL | DIV ) unary)*
	;

unary
	: (NOT | MINUS) unary | call
	;
```

**6. Opis struktury programu:**

  - Kod źródłowy w języku Weme zostaje wczytany z pliku,
  - Strumień danych wejściowych trafia do skanera, który wydziela tokeny i przekazuje je do parsera,
  - Parser na podstawie tokenów i znajomości gramatyki języka generuje drzewo składniowe, 
  - Zaimplementowany przez nas wemeListener "chodzi" po drzewie składniowym i generuje odpowiednie polecenia w języku JavaScript, które zapisywane są do pliku.

**7. Informacje o stosowanych generatorach skanerów/parserów, pakietach zewnętrznych**

ANTLR (ANother Tool for Language Recognition) to generator parserów do czytania, przetwarzania, wykonywania lub tłumaczenia plików tekstowych lub binarnych. Z jego pomocą mogłyśmy wygenerować skaner i parser dla stworzonej przez nas gramatyki. Wygenerował on także bazowy Listener - dziedzicząc po nim mogłyśmy zaimplementować jakie operacje będą wykonywane podczas chodzenia po drzewie składniowym.

**8. Informacje o zastosowaniu specyficznych metod rozwiązania problemu**

W stworzonym przez nas kompilatorze zaimplementowałyśmy obsługę błędów semantycznych, co ułatwia pracę z programem. Jeśli wykryty zostanie błąd semantyczny kompilator poinformuje o tym podając nazwę błędu oraz miejsce wystąpienia (numer linii). Obsługiwane błędy semantyczne:
  * ponowna deklaracja istniejącej zmiennej,
  * ponowna deklaracja istniejącej klasy,
  * ponowna deklaracja istniejącej funkcji (w jednej klasie),
  * przysłanianie parametru funkcji,
  * niewłaściwa liczba parametrów przekazana do funkcji,
  * dziedziczenie po klasie, która nie była wcześniej zadeklarowana,
  * odwołanie się do zmiennej, która nie była wcześniej zadeklarowana,
  * użycie słowa kluczowego this lub super poza klasą,
  * użycie konstrukcji this.nazwaFunkcji w klasie, która nie ma zadeklarowanej funkcji "nazwaFunkcij",
  * użycie konstrukcji super.nazwaFunkcji w klasie, która nie dziedziczy po innej klasie,
  * użycie konstrukcji super.nazwaFunkcji w klasie, której klasa nadrzędna nie ma zadeklarowanej funkcji "nazwaFunkcij",
  *  użycie operatora kropki w niedozwolonym miejscu.

**9. Krótka instrukcja obsługi**

Przed uruchomieniem programu należy najpierw zainstalować ANTLR4 zgodnie z instrukcją na stronie https://www.antlr.org.

  * Uruchamianie za pomocą terminala
  
Z poziomu katalogu src/main/java możemy wykonać polecenie:

```
java Main.java "ścieżka_do_pliku_z_kodem_Weme" "ścieżka_do_piku_na_wynik_w_JavaScript"
```

Podajemy ścieżki do plików - wejściowego z kodem w języku Weme i wyjściowego, w którym będzie umieszczony wynik kompilacji w JavaScript.

  * Korzystanie z interfejsu graficznego

Wymagane jest posiadanie środowiska node.js. Uruchamiamy za pomocą poleceń:

```
npm install
node server.js
```

Kompilator możemy teraz znaleźć pod adresem http://127.0.0.1:3000/weme/.
W dostępnym polu tekstowym wpisujemy kod w języku Weme i kompilujemy klikając przycisk poniżej. Skompilowany wynik kodu znajdziemy w polu poniżej. Dodatkowo możemy zobaczyć efekt kompilacji do języka JavaScript (Przycisk po prawej stronie).

**10. Testy, przykłady**

  * Kod w języku Weme przykład 1
```
fun addNumbers(a, b, c) {
  return a + b;
}

fun identity(a) {
  return a;
}

fun show(){
    print("show");
}

print identity(addNumbers(1,2,3));
```

  * Kod po kompilacji w języku JavaScript
```
//Source code compiled from Weme language
function addNumbers(a,b,c){
	return a + b;
}
function identity(a){
	return a;
}
function show(){
	console.log(("show"));
}
console.log(identity(addNumbers(1, 2, 3)));
```

* Kod w języku Weme przykład 2
```
var a = 5;
class Math{
    square(n){
        return n * n;
    }
    pi(){
        return 22/7;
    }
    factorial(n){
        if (n < 1){
            return 1;
        }
        else{
            return n * this.factorial(n - 1);
        }
    }
    fibonacci(n){
        var x1 = 1;
        var x2 = 1;
        var temp;
        for(var i=3; i<=n; i=i+1){
            temp = x1 + x2;
            x1 = x2;
            x2 = temp;
        }
        return x2;
    }
}

print "Circle area with r = 3 is equal " + Math().square(3) * Math().pi();
print "Factorial 3 equals " + Math().factorial(3);
print "Fibonacci 4 equals " + Math().fibonacci(4);
```

* Kod po kompilacji w języku JavaScript
```
//Source code compiled from Weme language
var a = 5; 
class Math {
	square(n){
		return n * n;
	}
	pi(){
		return 22 / 7;
	}
	factorial(n){
		if (n < 1){
			return 1;
		}else {
			return n * this.factorial(n - 1);
		}
	}
	fibonacci(n){
		var x1 = 1; 
		var x2 = 1; 
		var temp; 
		for (var i = 3; i <= n; i = i + 1) {
			temp = x1 + x2;
			x1 = x2;
			x2 = temp;
		}
		return x2;
	}
}
console.log("Circle area with r = 3 is equal " + new Math().square(3) * new Math().pi());
console.log("Factorial 3 equals " + new Math().factorial(3));
console.log("Fibonacci 4 equals " + new Math().fibonacci(4));
```

* Kod w języku Weme przykład 3
```
class Shape{
    sayName(){
        print "I'm Shape";
    }
}

class Circle inherit Shape{
    sayName(){
        super.sayName();
        print "And a Circle to be specific";
    }
    area(r){
        return r*r*22/7;
    }
    circuit(r){
        return 2*r*22/7;
    }
}

class Rectangle inherit Shape{
    sayName(){
        super.sayName();
        print "And a Rectangle to be specific";
    }
    area(a, b){
        return a*b;
    }
    circuit(a, b){
        return 2*a+2*b;
    }
}

class Square inherit Shape{
    sayName(){
        super.sayName();
        print "And a Square to be specific";
    }
    area(a){
        return a*a;
    }
    circuit(a){
        return 4*a;
    }
}

var c = Circle();
var r = Rectangle();
var s = Square();
c.sayName();
print "My area with r = 2" + c.area(2);
print "My circuit with r = 2" + c.circuit(2);
r.sayName();
print "My area with a = 2, b = 3" + r.area(2, 3);
print "My circuit with a = 2, b = 3" + r.circuit(2, 3);
s.sayName();
print "My area with a = 2" + s.area(2);
print "My circuit with a = 2" + s.circuit(2);
```

  * Kod po kompilacji w języku JavaScript
```
//Source code compiled from Weme language
class Shape {
	sayName(){
		console.log("I'm Shape");
	}
}
class Circle extends Shape {
	sayName(){
		super.sayName();
		console.log("And a Circle to be specific");
	}
	area(r){
		return r * r * 22 / 7;
	}
	circuit(r){
		return 2 * r * 22 / 7;
	}
}
class Rectangle extends Shape {
	sayName(){
		super.sayName();
		console.log("And a Rectangle to be specific");
	}
	area(a,b){
		return a * b;
	}
	circuit(a,b){
		return 2 * a + 2 * b;
	}
}
class Square extends Shape {
	sayName(){
		super.sayName();
		console.log("And a Square to be specific");
	}
	area(a){
		return a * a;
	}
	circuit(a){
		return 4 * a;
	}
}
var c = new Circle(); 
var r = new Rectangle(); 
var s = new Square(); 
c.sayName();
console.log("My area with r = 2" + c.area(2));
console.log("My circuit with r = 2" + c.circuit(2));
r.sayName();
console.log("My area with a = 2, b = 3" + r.area(2, 3));
console.log("My circuit with a = 2, b = 3" + r.circuit(2, 3));
s.sayName();
console.log("My area with a = 2" + s.area(2));
console.log("My circuit with a = 2" + s.circuit(2));
```

**11. Możliwe rozszerzenia programu**

  * funkcja lambda
  * tablice asocjacyjne
  * rozbudowanie możliwości obsługi matematycznych operacji
  * obsługa plików

**12. Ograniczenia programu**

  * obsługa tylko podstawowych operacji matematycznych
  * brak obsługi funkcji lambda
  * brak tablic asocjacyjnych
  * brak możliwości obsługi wielu plików, importu ich
