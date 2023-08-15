import java.util.Scanner;

public class STEP1 {

    public static void calculate(int W, int R){
        double oneRM =0;
        if(W>=1 && W<=1000000) {
            if (R >= 1 && R <= 100) {
                oneRM = W * (1 + (double) R / 30);
            } else {
                System.out.println("유효하지 않은 R값입니다.");
            }
        }
        else{
                System.out.println("유효하지 않은 W값입니다.");
            }

        int intValue = (int)oneRM;
        System.out.println(intValue);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int W = scanner.nextInt();
        int R = scanner.nextInt();

        calculate(W,R);
    }
}