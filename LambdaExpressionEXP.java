// Example 1: Without Lambda Expression
// interface demo{
//     void show();
// }
// public class LambdaExpressionEXP {
//     public static void main(String[] args) {
//         demo D = new demo() {
//             public void show(){
//             System.out.println("Helo Java 8");
//             }
//         };
//         D.show();
//     }
// }


// Example 2: With Lambda Expression
interface Demo{    // creates an interface.
    void show();   // declares an abstract method.
}
public class LambdaExpressionEXP {
    public static void main(String[] args) {
        Demo D = ()-> {   // creates a reference variable.
            System.out.println("Hello java 8");   // prints the message.
        };
        D.show();   // executes the implemented method.
    }
}
