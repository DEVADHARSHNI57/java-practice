class Car {
    public void honk() {
        System.out.println("Honk");
    }
}

public class ObjectCreationDemo {
    public static void main(String[] args) {
        System.out.println("C1 is created");
        Car c1 = new Car();
        c1.honk();

        System.out.println("C2 is created");
        Car c2 = new Car();
        c2.honk();
    }
}