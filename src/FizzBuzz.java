public class FizzBuzz {
    void FizzBuzz() {
        int Min = 1;
        int Max = 100;
        for (int i = Min; i < Max; i++) {
            boolean bDividedByThree = dividedByThree(i);
            boolean bDividedByFive = dividedByFive(i);
            if (bDividedByThree && bDividedByFive) {
                System.out.println("FizzBuzz");
                continue;
            }
            if(bDividedByThree){
                System.out.println("Fizz");
                continue;
            }
            if (bDividedByFive) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }

    private boolean dividedByFive(int number) {
        return number%5 == 0;
    }

    private boolean dividedByThree(int number) {
        return number%3 == 0;
    }

    public static void main(String[] args) {
        FizzBuzz game = new FizzBuzz();
        game.FizzBuzz();
    }
}
