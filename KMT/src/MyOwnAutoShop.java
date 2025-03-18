public class MyOwnAutoShop {
    public static void main(String[] args) {
      
        Sedan sedan = new Sedan(120, 25000, "Red", 22);
        System.out.println("Sedan Sale Price: " + sedan.getSalePrice());
       
        Ford ford1 = new Ford(150, 30000, "Blue", 2023, 2000);
        Ford ford2 = new Ford(130, 28000, "Black", 2022, 1500);
        System.out.println("Ford 1 Sale Price: " + ford1.getSalePrice());
        System.out.println("Ford 2 Sale Price: " + ford2.getSalePrice());
     
        Car car = new Car(100, 22000, "White");
        System.out.println("Car Sale Price: " + car.getSalePrice());
      
        Truck truck = new Truck(80, 35000, "Green", 2500);
        System.out.println("Truck Sale Price: " + truck.getSalePrice());
    }
}