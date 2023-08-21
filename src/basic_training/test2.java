package basic_training;


import java.util.Scanner;

//큰 팩토리얼을 구하는 문제
//무턱대고 큰 자료형을 받는 bitCount를 사용했다간 runtime에 빠질 수 있으니,,
// 후에 최종적으로 mod값을 계산하는것이아닌 매 반복마다 mod값을 계산하여 푼다


public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(factorial(a));


    }

    private static long factorial(int a) {
        long x =1;
        for(int i=1;i<=a;i++){
            x = (x*i)%1000000007;

        }


        return x;
    }
}
