// 1. Create a custom functional interface and implement it using Lambda.
// @FunctionalInterface 
// interface A{
//     void show();
// }
// public class FunctionalInterfacesQuestions {
//     public static void main(String[] args) {
//         A Lam = ()->{
//             System.out.println("Hello Java 8");
//         };
//         Lam.show();
//     }
// }

// 2. Use the Predicate functional interface to check whether a number is even.
// import java.util.function.Predicate;

// public class FunctionalInterfacesQuestions {
//     public static void main(String[] args) {
//         Predicate<Integer> p = (n) -> n % 2 == 0;

//         System.out.println(p.test(5));
//         System.out.println(p.test(10));
//         System.out.println(p.test(15));
//         System.out.println(p.test(20));
//     }
// }


// 3. Use the Function interface to convert a string into uppercase.

// import java.util.function.Function;

// public class FunctionalInterfacesQuestions {
//     public static void main(String[] args) {
//         Function<String,String> f = (n)-> n.toUpperCase();
//         System.out.println(f.apply("java programing"));
//     }
// }


// 4. Use the Consumer interface to print employee names.

// import java.util.function.Consumer;

// public class FunctionalInterfacesQuestions {
//     public static void main(String[] args) {
//         Consumer<String> C = (Name)->{
//             System.out.println(Name);
//         };
//         C.accept("Ram");
//         C.accept("Sham");
//         C.accept("Karna");
//     }
// }


// 25. Use the Supplier interface to generate a random number.

// import java.util.Random;
// import java.util.function.Supplier;

// public class FunctionalInterfacesQuestions {
//     public static void main(String[] args) {
//         Supplier<Integer> S = ()-> new Random().nextInt(100);
//         System.out.println(S.get());
//     }
// }


// 6. Use Predicate to check whether a string starts with “A”.

// import java.util.function.Predicate;
// public class FunctionalInterfacesQuestions{
//     public static void main(String[] args) {
//         Predicate<String> P = S -> S.startsWith("A");
//         System.out.println(P.test("Arjun"));
//         System.out.println(P.test("Bheem"));
//         System.out.println(P.test("Agni"));
//         System.out.println(P.test("Kana"));
//     }
// }


// 27. Combine two predicates using and() and or().

import java.util.function.Predicate;

public class FunctionalInterfacesQuestions{
    public static void main(String[] args) {
        Predicate<String> P = n -> n.length() > 5;
        Predicate<String> P1 = n -> n.startsWith("A");

        Predicate<String> P2 = P.and(P1);
        Predicate<String> P3 = P.or(P1);

        System.out.println(P2.test("Arjun"));
        System.out.println(P3.test("Karna"));
    }
}