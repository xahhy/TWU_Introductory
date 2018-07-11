package Diamond;

public class DiamondWithName {
    public static void main(String[] args) {
        int N = 3;
        String name = "Bill";
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                if (j < N - 1 - i || N - j < 1 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println(name);
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                if (j < i || j > N - i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
