import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

//Pair 클래스

class Pair implements Comparable<Pair> {

    int num;
    int bits;

    //생성자
    Pair(int num, int bits) {
        this.num = num;
        this.bits = bits;
    }


    @Override
    public int compareTo(Pair o) {

        if (o.bits == this.bits) { //비트가 같다면
            return o.num - this.num; //num을 비교
        } else {
            return o.bits - this.bits;
        }

    }



}
public class STEP5 {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt(); //10진수
            int bits = Integer.bitCount(num); //2진수 변환 후 1의 갯수

            pairs.add(new Pair(num,bits));//새로운 Pair객체를 만들어서, pairs 리스트에 하나씩 넣는다.
        }

        //Pair에서 Comparable로 비교한 값을, 이제 내림차순으로 정렬 완료
        Collections.sort(pairs);

        System.out.println(pairs.get(K-1).num); // K-1번째 객체의 num 값을 가져온다.

    }

}
