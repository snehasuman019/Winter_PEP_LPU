abstract class TVFun {
    abstract void turnOn();
    abstract void turnOff();
    
}
class TVRemote extends TVFun{
    @Override
    void turnOn(){
        System.out.println("TV is turned ON");

    }
    @Override
    void turnOff(){
        System.out.println("TV is turned OFF");
    }
}
public class TV{
    public static void main(String[] args){
        TVFun tc = new TVRemote();
        tc.turnOn();
        tc.turnOff();
    }

}