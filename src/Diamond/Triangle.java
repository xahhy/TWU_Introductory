package Diamond;

public class Triangle {
    public static void main(String[] args) {
        int N = 3;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                if (j < N - 1 - i || N - j < 1 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
