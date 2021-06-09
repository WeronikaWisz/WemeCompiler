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
