package Triangle;

public class RightTriangle {
    public static void main(String[] args) {
        int N = 3;
        while (N-- != 0) {
            for (int i = 0; i < 3 - N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
