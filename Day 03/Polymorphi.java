// class A{
//     void fun1(){
//         System.out.println("Hi");
//     }
// }
// class B extends A{
//     void fun1(){
//         System.out.println("Hello");
//         super.fun1();
//     }
// }

// public class Polymorphi {
//     public static void main(String[] args){
//         B b = new B();
//         b.fun1();
//     }
// }
// try considering an int and a float here.

class A {
    void fun1() {
        System.out.println("Hi (from Class A)");
    }
}

class B extends A {
    @Override // Good practice to include this annotation
    void fun1() {
        System.out.println("Hello (from Class B)");
        super.fun1(); // Calls the parent version of the method
    }
}

public class Polymorphi { 
    public static void main(String[] args) {
        // Create an instance of the subclass
        B b = new B();
        
        // This will trigger the overridden method in Class B
        b.fun1();
    }
}