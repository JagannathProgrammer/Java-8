@FunctionalInterface 
interface MyInterface{
    void show();
}

public class FunctionalInterfaceEXP {
    public static void main(String[] args) {
        MyInterface Obj = ()->{
            System.out.println("This is Functional Interface");
        };
        Obj.show();
    }
    
}
