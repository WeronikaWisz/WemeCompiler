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
addNumbers(1, 2, 3);
