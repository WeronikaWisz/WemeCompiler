//Source code compiled from Weme language
class Math {
	square(n){
		return n * n;
	}
	pi(){
		b = 5;
		return 22 / 7;
	}
}
function show(){
	console.log(("show"));
}
function show(){
	console.log(("show 2"));
}
console.log("Circle area with r = 3 is equal " + new Math().square(3, 7) * new Math().pi());
