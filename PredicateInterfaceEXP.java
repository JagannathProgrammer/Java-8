import java.util.function.Predicate;

public class PredicateInterfaceEXP {
    public static void main(String[] args) {
        Predicate<Integer> P = (n)-> n>10;
        System.out.println("test() Method: "+P.test(15));
        System.out.println("test() Method: "+P.test(5));

        Predicate<String> S = (s)-> s.length()>5;
        
        System.out.println("test() Method: "+S.test("Bharat"));
        System.out.println("test() Method: "+S.test("India"));

        // Predicate Supports Methods and(), or(), negate(), isEqual(), not()
        Predicate<Integer> J = (j)-> j>10;
        Predicate<Integer> K = (k)-> k<50;
        System.out.println("and() Method: "+J.and(K).test(20));
        System.out.println("or() Method: "+J.or(K).test(20));
        System.out.println("negate() Method: "+J.negate().test(5));
        System.out.println("negate() Method: "+K.negate().test(20));
        
        Predicate<String> B = Predicate.isEqual("Java");
        System.out.println("isEqual() Method: "+B.test("Java"));
        System.out.println("isEqual() Method: "+B.test("Hello"));

        Predicate<String> D = Predicate.not(String::isEmpty);
        System.out.println(D.test("Java"));

    }
}
