package session12_oop_polymorphism.practice.object_vs_referance;

public class TestPolymorphism {

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myTruck = new Truck();

        Car myCar2 = (Car) myCar;


        System.out.println(myCar.fuelType());
        System.out.println(myTruck.fuelType());

        Car ford = new Car();
        Object carAsObject = ford;
        //carAsObject.fuelType is not possible;
        Car backToCar = (Car) carAsObject;
        backToCar.fuelType();

        String name = getName(ford);
    }

    public static String getName(Object object) {
        return "Some name.";
    }
}
