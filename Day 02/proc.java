// protected access modifier
class Vehicle{
    protected int speed; //protected member variable
}
class Bike extends Vehicle{
    void setSpeed(int s){
        speed = s; //accessible within subclass
    }
    int getSpeed(){
        return speed; //accessible within subclass
    }
}
public class proc {
    public static void main(String[] args){
        Bike b = new Bike();
        b.setSpeed(100);
        System.out.println("Bike speed: " + b.getSpeed());
        Vehicle v = new Vehicle();
        System.out.println(v.speed);
    }
}
