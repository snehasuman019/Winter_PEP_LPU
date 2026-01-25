public class modifier {
    private String name;
    public void setName(String name){
        this.name = name; //accessible within the class 
    }
    public String getName(){
        return this.name; //accessible within the class
    }
    public static void main(String[] args){
        modifier p = new modifier();
        p.setName("Sneha");
        // System.out.println(p.name); //ERRor : name has private access in Person
        System.out.println(p.getName()); //accessing via public method
    }
    
}
