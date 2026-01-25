// default access modifier
class Car {
    String model; // default access modifier
}
public class def{
    public static void main(String[] args){
        Car c = new Car();
        c.model = "Mustang"; // accessible within the same package
        System.out.println("Car model: " + c.model);
    }
}
