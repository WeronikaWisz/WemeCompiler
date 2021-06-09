grammar wemeGrammar;

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
PRINT: 'print';
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
//WHITESPACE : (' ' | '\t') ;
//NEWLINE : ('\r'? '\n' | '\r')+ ;
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
	: ([0] | ([1-9] [0-9]*))
	;

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
	: sumOperation ((LESS | LESS_EQUAL | GREATER | GREATER_EQUAL) sumOperation)*
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