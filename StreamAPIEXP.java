import java.util.Arrays;
import java.util.List;

public class StreamAPIEXP {
    public static void main(String[] args) {

        // Create a List
        List<Integer> Number = Arrays.asList(10, 20, 30 ,40, 50, 20, 30);

        // Stream API
        // 1. filter() - Select numbers greater than 20
        System.out.println("1. Filter:");
        Number.stream()  // converts the list into a Stream.
        .filter((N)-> N>20) // selects numbers greater than 20.
        .forEach((N)-> System.out.println(N));

        // 2. map() - Multiply each number by 2
        System.out.println("\n2. Map:");
        Number.stream()
        .map((N)-> N*2)
        .forEach((N)-> System.out.println(N));

        // 3. sorted() - Sort numbers
        System.out.println("\n3.sorted:");
        Number.stream()
        .sorted()
        .forEach((N)-> System.out.println(N));

        // 4. distinct() - Remove duplicate numbers
        System.out.println("\n4.distinct:");
        Number.stream()
        .distinct()
        .forEach((N)-> System.out.println(N));

        // 5. limit() - Get first 3 numbers
        System.out.println("\n5.limit:");
        Number.stream()
        .limit(3)
        .forEach((N)-> System.out.println(N));

        // 6. skip() - Skip first 3 numbers
        System.out.println("\n6.skip:");
        Number.stream()
        .skip(3)
        .forEach((N)-> System.out.println(N));

        // 7. count() - Count total numbers
        System.out.println("\n7.count:");
        long count = Number.stream().count();
        System.out.println(count);

        // 8. min() - Find minimum number
        System.out.println("\n8. Min:");
        System.out.println(Number.stream().min(Integer::compareTo).get());

        // 9. max() - Find maximum number
        System.out.println("\n9. Max:");
        System.out.println(Number.stream().max(Integer::compareTo).get());

        // 10. reduce() - Calculate sum
        System.out.println("\n10. Reduce:");
        int sum = Number.stream()
        .reduce(0, (a,b)-> a+b);
        System.out.println(sum);


        List<Integer> Num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 8, 6, 3);
        // ParallelStream
        // 1. filter() Select elements
        System.out.println("ParallelStream:");
        System.out.println("1. Filter:");
        Num.parallelStream()
        .filter((n)-> n>20)
        .forEach((n)-> System.out.println(n));


    }
    
}
