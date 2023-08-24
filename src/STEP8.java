import java.util.Scanner;

public class STEP8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int bandage = 0;
        int medicine = 0;
        int painkiller = 0;

        while (N > 0) {
            if(N >= 14){
                painkiller++;
                N -=14;
            } else if (N >= 7 && N < 14) {
                medicine++;
                N -= 7;
            } else {
                bandage++;
                N -=1;
            }
        }

        System.out.println(bandage + medicine + painkiller);
    }
}
