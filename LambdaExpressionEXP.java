interface Demo{    // creates an interface.
    void show();   // declares an abstract method.
}

public class LambdaExpressionEXP {
    public static void main(String[] args) {
        Demo D = ()-> {   // creates a reference variable.
            System.out.println("Hello java");   // prints the message.
        };
        D.show();   // executes the implemented method.
    }
}
