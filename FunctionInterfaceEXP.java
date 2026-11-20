import java.util.function.Function;

public class FunctionInterfaceEXP {
    public static void main(String[] args) {
        Function<Integer,Integer> F = (n)-> n*n;
        Function<String,Integer> F1= (n)-> n.length();
        // apply()  -- Used to perform an operation and return the result.
        System.out.println("apply Method: "+F.apply(5));
        System.out.println("apply Method: "+F1.apply("Hello Java"));

        // Function Supports Methods andThen(), compose(), identity()
        // andThen() -- Used to execute two functions in sequence. First function executes, then the second function.
        Function<Integer,Integer> J = (n)-> n+10;
        Function<Integer,Integer> J1 = (n)-> n*2;
        System.out.println("andThen Method: "+J.andThen(J1).apply(5));
        // compose()  -- Used to execute two functions in reverse order. The second function executes first.
        System.out.println("compose() Method: "+J.compose(J1).apply(5));
        // identity() -- Used to return the same input value without changing it.
        Function<Integer,Integer> K = Function.identity();
        System.out.println("identity() Method: "+K.apply(100));
    }
}
