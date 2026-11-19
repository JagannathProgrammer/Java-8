import java.util.function.Supplier;

public class SupplierInterfaceEXP {
    public static void main(String[] args) {
        Supplier<Integer> S = ()-> 100;
        Supplier<String> S1 = ()-> "Hello java";
        System.out.println(S.get());
        System.out.println(S1.get());
    }
}
