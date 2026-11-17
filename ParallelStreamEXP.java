import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ParallelStreamEXP {
    public static void main(String[] args) {

        List<Integer> Num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 8, 6, 3);
        // ParallelStream
        System.out.println("ParallelStream:");

        // 1. forEach() – Perform an action on each element.
        System.out.println("1. ForEach:");
        Num.parallelStream()
        .forEach((n)-> System.out.println("Numbers: "+ n));

        // 2. forEachOrdered() – Perform an action in encounter order.
        System.out.println("\n2. ForEachOrdered:");
        Num.parallelStream()
        .forEachOrdered((n)-> System.out.println("Numbers: "+n));


        // 3. filter() – Select elements based on a condition.
        System.out.println("3. Filter:");
        Num.parallelStream()
        .filter((n)-> n>5)
        .forEach((n)-> System.out.println(n));

        // 4. map() – Modify each element.
        System.out.println("\n4. Map:");
        Num.parallelStream()
        .map((n)-> n*2)
        .forEach((n)-> System.out.println(n));

        // 5. sorted() – Sort elements in ascending order.
        System.out.println("\n5.sorted():");
        Num.parallelStream()
        .sorted()
        .forEachOrdered((n)-> System.out.println(n));

        // 6. distinct() – Remove duplicate elements.
        System.out.println("\n6.Distinct:");
        Num.parallelStream()
        .distinct()
        .forEachOrdered((n)-> System.out.println(n));

        // 7. limit() – Get the first specified number of elements.
        System.err.println("\n7.limit:");
        Num.parallelStream()
        .limit(3)
        .forEachOrdered((n)->System.out.println(n));  

        // 8. skip() – Skip the specified number of elements.
        System.out.println("\n8.Skip:");
        Num.parallelStream()
        .skip(2)
        .forEachOrdered((n)-> System.out.println(n));

        // 9. count() – Count the total number of elements.
        long count = Num.parallelStream().count();
        System.out.println("9.Count: "+ count);

        // 10. anyMatch() – Check whether at least one element matches the condition.
        boolean result = Num.parallelStream()
        .anyMatch((n)-> n>5);
        System.out.println(result);

        // Second Largest – Find the second largest distinct number.
        int SL = Num.parallelStream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .get();
        System.out.println("SL is: "+ SL);

        // Second Smallest – Find the second smallest distinct number.
        int SS = Num.parallelStream()
        .distinct()
        .sorted()
        .skip(1)
        .findFirst()
        .get();
        System.out.println("SS is: " +SS);
    }
}
