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
