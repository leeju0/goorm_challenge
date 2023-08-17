
import java.util.Scanner;

public class STEP4 {
    public static void sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int maxIndex = 0;


        //int[] 배열을 만들어서, nextInt로 하나씩 저장함
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean Ascending = true; //오름차순
        boolean Dscending = true; //내림차순
        boolean print_sum = true;


        //배열의 최대값 구하기
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }



        }


        //오름차순 판단
        for (int i = 1; i <= maxIndex; i++) {

            if (numbers[i] < numbers[i - 1]) {
                Ascending  = false;
                break;
            }

        }
        //내림차순 판단

        for (int i = numbers.length -1 ; i > maxIndex; i--) {
                if (numbers[i] > numbers[i - 1]) {
                    Dscending = false;
                    break;
                }

            }


        if (!Ascending || !Dscending) {
            print_sum = false; // 최댓값 기준으로 양쪽으로 오름차순이나 내림차순이 아닌경우
        }

        if (print_sum == false) {
            System.out.println("0");
        } else if (print_sum == true) {
            sum(numbers);
        }


    }
}
