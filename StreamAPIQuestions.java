// 1. Find all even numbers from a list using Stream API.

// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions {
//     public static void main(String[] args) {
//         List<Integer> Num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//         Num.stream()
//         .filter(n-> n%2==0)
//         .forEach(n-> System.out.println(n));
        
//     }
// }


// 2. Find all odd numbers from a list.
// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions {
//     public static void main(String[] args) {
//         List<Integer> Num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//         Num.stream()
//         .filter(n-> n%2!=0)
//         .forEach(n-> System.out.println(n));
        
//     }
// }

// 3. Find the maximum number from a list using Stream API.
// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions {
//     public static void main(String[] args) {
//         List<Integer> Num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//         int Max = Num.stream()
//         .max((a,b)-> a.compareTo(b))
//         .get();
//         System.out.println(Max);
        
//     }
// }


// 4. Find the minimum number from a list.

// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions {
//     public static void main(String[] args) {
//         List<Integer> Num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//         int Min = Num.stream()
//         .min((a,b)-> a.compareTo(b))
//         .get();
//         System.out.println(Min);
//     }
// }


// 5. Find the sum of all numbers in a list.

// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions{
//     public static void main(String[] args) {
//         List<Integer>  Num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//         int Sum = Num.stream()
//         .mapToInt(n-> n)
//         .sum();
//         System.out.println(Sum);
//     }
// }


// 6. Find the average of numbers in a list.
// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions{
//     public static void main(String[] args) {
//         List<Integer>  Num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//         double average = Num.stream()
//         .mapToInt(n-> n)
//         .average()
//         .getAsDouble();
//         System.out.println(average);
//     }
// }



// 7. Convert a list of strings into uppercase.

// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions{
//     public static void main(String[] args) {
//         List<String> Name = Arrays.asList("java", "python", "html", "css", "sql");
//         Name.stream()
//         .map(n-> n.toUpperCase())
//         .forEach(n-> System.out.println(n));
//     }
// }


// 8. Convert a list of strings into lowercase.

// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions{
//     public static void main(String[] args) {
//         List<String> Name = Arrays.asList("JAVA", "PYTHON", "HTML", "CSS", "SQL");
//         Name.stream()
//         .map(n-> n.toLowerCase())
//         .forEach(n-> System.out.println(n));
//     }
// }


// 9. Find strings whose length is greater than 5.

// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions{
//     public static void main(String[] args) {
//         List<String> Name = Arrays.asList("JAVA", "Python", "HTML", "SQL", "Spring");
//         Name.stream()
//         .filter(n-> n.length()>5)
//         .forEach(n-> System.out.println(n));
//     }
// }


// 10. Count the number of elements in a list.

// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions{
//     public static void main(String[] args) {
//         List<Integer> Num = Arrays.asList(50, 60, 70, 80, 90, 100);
//         Long Count = Num.stream()
//         .count();
//         System.out.println(Count);
//     }
// }

// 11. Remove duplicate elements from a list using distinct().

// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions{
//     public static void main(String[] args) {
//         List<Integer> Num = Arrays.asList(6, 4, 5, 1, 2, 3, 4, 5, 6);
//         Num.stream()
//         .sorted()
//         .distinct()
//         .forEach(n-> System.out.println(n));
//     }
// }


// 12. Sort numbers in ascending order using Stream API.
import java.util.Arrays;
import java.util.List;

public class StreamAPIQuestions{
    public static void main(String[] args) {
        List<Integer> Num = Arrays.asList(6, 4, 5, 1, 2, 3);
        Num.stream()
        .sorted()
        .forEach(n-> System.out.println(n));
    }
}


// 13. Sort numbers in descending order using Stream API.
// import java.util.Arrays;
// import java.util.List;

// public class StreamAPIQuestions{
//     public static void main(String[] args) {
//         List<Integer> Num = Arrays.asList(6, 4, 5, 1, 2, 3);
//         Num.stream()
//         .sorted((a,b)-> b.compareTo(a))
//         .forEach(n-> System.out.println(n));
//     }
// }