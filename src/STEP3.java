import java.util.Scanner;

public class STEP3 {

    public static int calculate(int a, String b, int c) {
        int sum =0;
        if(b.equals("+")){
             sum = a+c;
        } else if(b.equals("-")){
             sum =a-c;
        } else if(b.equals("/")){
            sum =a/c;
        }else {
             sum =a*c;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int sum = 0;


        for(int i=0;i<T;i++){
            int a = sc.nextInt();
            String b = sc.next();
            int c = sc.nextInt();

            sum += calculate(a,b,c);
        }

        System.out.println(sum);




    }

}
