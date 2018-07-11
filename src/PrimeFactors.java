import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println("Primefactors of 30");
        for (Integer integer : generate(30)) {
            System.out.println(integer);
        }
    }
}
