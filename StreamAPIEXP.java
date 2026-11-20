
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIEXP {
    public static void main(String[] args) {

        // Create a List
        List<Integer> Number = Arrays.asList(5,10,15,20,25,30,10,20);

        // 1. Example: Without Stream API
        System.out.println("Without Stream API: ");
        for(Integer n : Number){
            if (n>20) {
                System.out.println(n);
            }
        }

        // Example: With Stream API
        System.out.println("With Stream API: ");
        Number.stream()
        .filter(n-> n>20)
        // .forEach(System.out::println);
        .forEach(n-> System.out.println(n));


        // Stream API - All Intermediate Operations
        // 1. filter() - Filters elements based on a condition.
        System.out.println("1. Filter():");
        Number.stream()  // converts the list into a Stream.
        .filter((n)-> n>20) // selects numbers greater than 20.
        .forEach((n)-> System.out.println(n));

        // 2. map() - Converts each element into another value.
        System.out.println("2. Map():");
        Number.stream()
        .map((n)-> n*2)
        .forEach((n)-> System.out.println(n));

        // 3. sorted() - Used to sort elements in ascending order.
        System.out.println("3.sorted():");
        Number.stream()
        .sorted()
        .forEach((n)-> System.out.println(n));

        // 4. distinct() - Used to remove duplicate elements.
        System.out.println("4.distinct():");
        Number.stream()
        .distinct()
        .forEach((n)-> System.out.println(n));

        // 5. limit() - Used to get a limited number of elements.
        System.out.println("5.limit():");
        Number.stream()
        .limit(3)
        .forEach((n)-> System.out.println(n));

        // 6. skip() - Used to skip the specified number of elements.
        System.out.println("6.skip():");
        Number.stream()
        .skip(3)
        .forEach((n)-> System.out.println(n));

        // 7. count() - Used to count the number of elements.
        System.out.println("7.count():");
        long count = Number.stream().count();
        System.out.println(count);

        // 8. min() - Used to find the minimum value.
        System.out.println("8. Min():");
        System.out.println(Number.stream().min(Integer::compareTo).get());

        // 9. max() - Used to find the maximum value.
        System.out.println("9. Max():");
        System.out.println(Number.stream().max(Integer::compareTo).get());

        //10. forEach() - Used to print or perform an action on every element.
        System.out.println("10. forEach(): ");
        Number.stream()
        .forEach(n-> System.out.println(n));

        // 11. collect() - Used to collect stream elements into a collection.
        System.out.println("11. collect(): ");
        List<Integer> Result = Number.stream()
        .filter(n-> n>15)
        .collect(Collectors.toList());
        System.out.println(Result);

        // 12. anyMatch() - Checks whether at least one element satisfies the condition.
        System.out.println("12. anyMatch(): ");
        boolean B = Number.stream()
        .anyMatch(n-> n>20);
        System.out.println(B);

        // 13. allMatch() - Checks whether all elements satisfy the condition.
        System.out.println("13. allMatch(): ");
        boolean I = Number.stream()
        .allMatch(n-> n>2);
        System.out.println(I);

        // noneMatch() - Checks whether no elements satisfy the condition. 
        System.out.println("14. noneMatch(): ");
        boolean A = Number.stream()
        .noneMatch(n-> n<0);
        System.out.println(A);

        // 15. findFirst() - Returns the first element.
        System.out.println("15. findFirst: ");
        System.out.println(Number.stream().findFirst().get());

        // 16. findAny() - Returns any available element. With a sequential stream, it commonly returns the first element.
        System.out.println("16. findAny: ");
        System.out.println(Number.stream().findAny().get());

        // 17. reduce() - Used to combine all elements into a single result.
        System.out.println(" 17. reduce: ");
        int sum = Number.stream()
        .reduce(0, (a,b)-> a+b);
        System.out.println(sum);

        // 18. toArray() - Used to convert stream elements into an array.
        System.out.println("18. toArray: ");
        Object[] O = Number.stream()
        .toArray();
        System.out.println(Arrays.toString(O));


        // Stream API – All Terminal Operations

        // 1. forEachOrdered() - Processes elements in their original encounter order, especially useful with Parallel Stream.
        System.out.println("2. forEachOrdered: ");
        Number.stream()
        .forEachOrdered(n-> System.out.println(n));

    }
    
}
