//Source code compiled from Weme language
class Car extends Vehicle {
	refuel(){
		super.refuel();
		console.log("I'll have a little drink");
	}
}
class Bike {
	speed(){
		super.speed();
	}
	ride(){
		this.speed();
		this.slow();
	}
}
class SportBike extends Bike {
	speed(){
		super.speed();
		super.sp();
	}
}
