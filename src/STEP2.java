import java.util.ArrayList;
import java.util.Scanner;


public class STEP2 {


    static void print(int T, int M, ArrayList<Integer> L){

        for (int i = 0; i < L.size(); i++) {
            M += L.get(i);
            while(M>=60) {
               T++;
               M -= 60;

               if(T==24)
                   T =0;

            }

        }

        System.out.println(T+" "+M);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int M = scanner.nextInt();

        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            int X = scanner.nextInt();
            L.add(X);
        }
        print(T,M,L);




    }


}
