// 1. Write a Java 8 program to sort a list of integers using a Lambda Expression.

// import java.util.Arrays;
// import java.util.List;

// public class LambdaExpressionsQuestion {
//     public static void main(String[] args) {
//         List<Integer> Num =Arrays.asList(5, 9, 4, 6, 2, 8, 1, 3, 10, 7 );
//         Num.sort((a,b)-> a.compareTo(b));
//         System.out.println(Num);
//     }
// }


// 2. Write a program to sort a list of strings alphabetically using Lambda.

// import java.util.Arrays;
// import java.util.List;

// public class LambdaExpressionsQuestion {
//     public static void main(String[] args) {
//        List<String> Name = Arrays.asList("Ram", "Sham", "Arjun", "Krish", "Jagan", "Karna");
//        Name.sort((a,b)-> a.compareTo(b));
//        System.out.println(Name); 
//     }
// }


// 3. Create a Lambda Expression to print a welcome message.
// @FunctionalInterface
//     interface Welcome{
//         void show();
//     }
// public class LambdaExpressionsQuestion {
//     public static void main(String[] args) {
//         Welcome W = ()-> {
//             System.out.println("Welcome Java 8");
//         };
//         W.show();
//     }
// }


// 4. Write a program to find even numbers from a list using Lambda.

// import java.util.Arrays;
// import java.util.List;

// public class LambdaExpressionsQuestion {
//     public static void main(String[] args) {
//         List<Integer> Num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//         Num.forEach(n->{if (n%2==0){
//             System.out.println(n);
//         }});
//     }
// }


// 5. Create a Lambda Expression to perform addition of two numbers.
// @FunctionalInterface 
// interface A{
//     int add(int a, int b);
// }
// public class LambdaExpressionsQuestion{
//     public static void main(String[] args) {
//         A Addition = (a,b)-> a+b;
//         System.out.println(Addition.add(10, 25));
//     }
// }


// 6. Write a program to iterate through a list using forEach() and Lambda.

// import java.util.Arrays;
// import java.util.List;

// public class LambdaExpressionsQuestion{
//     public static void main(String[] args) {
//         List<String> Name = Arrays.asList("Ram", "Sham", "Arjun", "Krish", "Jagan", "Karna");
//         Name.forEach(n-> System.out.println(n));
//     }
// }


// 7. Sort a list of employees by name using Lambda.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionsQuestion{
    public static void main(String[] args) {
        List<String> Employee = Arrays.asList("Ram", "Sham", "Arjun", "Krishna", "Jagannath", "Karna");
        Employee.sort((a,b)-> a.compareTo(b));
        System.out.println(Employee);

        List<String> Employees = new ArrayList<>();
        Employees.add("Ram");
        Employees.add("Sham");
        Employees.add("Arjun");
        Employees.add("Krishna");
        Employees.add("Jagannath");
        Employees.add("Karna");
        Employees.sort((j,k)-> j.compareTo(k));
        System.out.println(Employees);
    }
}
