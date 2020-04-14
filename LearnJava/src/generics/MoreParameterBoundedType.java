package generics;

interface Car{
	 void setSpeed(int speed);
	 int getSpeed();
	 
}

public class MoreParameterBoundedType<T extends Fuel&Car> {

	public static void main(String[] args) {
		MotorBike motorBike = new MotorBike();
		Fuel fuel = new Fuel();
		CarFactory<MotorBike> motorCar = new CarFactory<MotorBike>();
		motorCar.setFuelType("gasoline");
		motorCar.setSpeed(34);
		Track track = new Track();
		CarFactory<Track> trackFactory = new CarFactory<Track>();
		trackFactory.setFuelType("Disel");
		trackFactory.setSpeed(80);
		
		System.out.println(trackFactory.toString());
		System.out.println(motorCar.toString());	

	}
}
class Fuel{
	String fuelType;
	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}
class Steel{
	
}
class Honda{
	
}
class MotorBike {
	public void add(Steel model) {
		
	}
}
class Track{
	
}
class CarFactory<T> extends Fuel implements Car{
	int speed;

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
		
	}

	@Override
	public String toString() {
		return "CarFactory [speed=" + speed + "FuelType "+super.fuelType+"]";
	}
	
	
}