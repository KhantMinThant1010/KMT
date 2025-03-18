public class MyVehicles {
	public static void main(String args[]){
		Vehicles obj;
		obj= new Cars();
		obj.getType();
		obj.getColor();
		obj.getBrandName();
		obj = new Bicycles();
		obj.getType();
		obj.getColor();
		obj.getBrandName();
		obj = new Motorbytes();
		obj.getType();
		obj.getColor();
		obj.getBrandName();
	}
}