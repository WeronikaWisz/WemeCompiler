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
