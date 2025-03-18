abstract class Vehicles {
	abstract void getType();
	abstract void getColor();
	abstract void getBrandName();
}
class Cars extends Vehicles{
	void getType(){
		System.out.println("Type: Car");
	}
	void getColor(){
		System.out.println("Color: Red");
	}
	void getBrandName(){
		System.out.println("Brand: BMW");
	}
}
class Bicycles extends Vehicles{
	void getType(){
		System.out.println("Type: Bicycle");
	}
	void getColor(){
		System.out.println("Color: Green");
	}
	void getBrandName() {
		System.out.println("Brand: Giant");
	}
}
class Motorbytes extends Vehicles{
	void getType(){
		System.out.println("Type: Motorbyte");
	}
	void getColor(){
		System.out.println("Color: Blue");
	}
	void getBrandName() {
		System.out.println("Brand: Ducati");
	}
}