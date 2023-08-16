import java.util.Scanner;

public class STEP2_solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine()); //문자열을 정수로 변환

        //sc.nextLine(); Enter키를 누를때까지 전체 입력 줄을 읽는다. 즉 한 줄 읽기
        //sc.nextInt(); 정수를 읽는다. 다음 공백 문자(공백, 탭, 줄바꿈) 까지 읽는다.

        String[] time = sc.nextLine().split(" ");
        // 문자열을 공백을 두고 한줄 읽어들여서 time 배열에 저장,

        int T = Integer.parseInt(time[0]);// 문자열을 정수로 변환하여 저장
        int M = Integer.parseInt(time[1]);

        for (int i = 0; i < N; i++) {
            //T - 현재시간 , N-현재 분, X-추가 분
            int X = Integer.parseInt(sc.nextLine());
            int Y = M + X; // Y - 현재분 + 추가 분

            int currentMinute = Y % 60;//현재 분
            int currentHour=  (T + Y/60) % 24; //현재 시간
            T = currentHour;
            M = currentMinute;

        }
        System.out.println(T+" "+M);









    }
}
