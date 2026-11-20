
// Type 1: Reference to a Static Method - Used to refer to a static method of a class.

// import java.util.Arrays;
// import java.util.List;

// public class MethodReferenceEXP {
//     public static void display(String s){
//         System.out.println(s);
//     }
//     public static void main(String[] args) {
//         List<String> Name = Arrays.asList("Java", "Python", "SQL");
//         Name.forEach(MethodReferenceEXP::display);
//     }
// }


// Type 2: Reference to an Instance Method of a Particular Object - Used to refer to a non-static method using an existing object.

// import java.util.Arrays;
// import java.util.List;

// public class MethodReferenceEXP {
//     public void display(String s){
//         System.out.println(s);
//     }
//     public static void main(String[] args) {
//         List<String> Name = Arrays.asList("Java", "Python", "SQL");
//         MethodReferenceEXP M = new MethodReferenceEXP();
//         Name.forEach(M::display);
//     }
// }


// 3: Reference to an Instance Method of an Arbitrary Object - Used to refer to an instance method of an object whose type is specified by a class.

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEXP{ 
    public static void main(String[] args) {
        List<String> Name = Arrays.asList("java", "python", "sql");
        Name.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);
    }
}