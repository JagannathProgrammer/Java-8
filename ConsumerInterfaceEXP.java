import java.util.function.Consumer;

public class ConsumerInterfaceEXP {
    public static void main(String[] args) {
        Consumer<Integer> C = (n)-> System.out.println(n);
        C.accept(100);
        Consumer<String> S =(n)-> System.out.println(n);
        S.accept("Hello");

        // Consumer Supports Methods andThen()
        Consumer<Integer> I = (n)-> System.out.println(n);
        Consumer<Integer> J = (n)-> System.out.println(n*n);
        I.andThen(J).accept(5);
    }
}
