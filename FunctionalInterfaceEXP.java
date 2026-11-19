// 1. Simple Example Using Normal Method.
// interface MyInterface{
//     void show();
// }
// public class FunctionalInterfaceEXP implements MyInterface{
//     public void show(){
//         System.out.println("Hello Java");
//     }
//     public static void main(String[] args) {
//      FunctionalInterfaceEXP F = new FunctionalInterfaceEXP();
//      F.show();
//     }
// }



// 2. Example Using Lambda Expression (Java 8)
@FunctionalInterface    // indicates that this interface is intended to have one abstract method.
interface MyInterface{
    void show();   // is the only abstract method.
    // Lambda Expression implements the show() method.
}
public class FunctionalInterfaceEXP {
    public static void main(String[] args) {
        MyInterface Obj = ()->{
            System.out.println("This is Functional Interface");
        };
        Obj.show();   // obj.show() executes the method.
    }
    
}
