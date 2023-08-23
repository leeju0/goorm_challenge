import java.util.*;

public class STEP6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //입력값 4 , abcd 받음
        int N = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();


        List<String[]> wordList = new ArrayList<>();


        Set<String> Score = new HashSet<>();

        //모든 조합 구하기
        for (int i = 1; i < N; i++) {
            for (int j = i + 1; j < N; j++) {      //i=1 j=2  i=1 j=3 . . .
                String first = S.substring(0, i);  //a        a
                String second = S.substring(i, j); //b        b,c
                String third = S.substring(j);     //c,d      d

                wordList.add(new String[]{first, second, third});
                Score.add(first);
                Score.add(second);
                Score.add(third);
            }

        }

        //temp - 점수판을 만들기위해서, Score를 리스트로 변환하고 ,순서대로 정렬하였다.
        List<String> P = new ArrayList<>(Score);
        Collections.sort(P);


        //순서대로 정렬한 temp 값은 ex) [a,ab,b,bc,c,cd,d]와 같은 형태일 것이다.
        //각 값에 1부터 번호를 매칭시켜준다. 이때 key-value형태로 사용하기위해 MAP자료형을 사용하였다.
        //resultScore - 번호가 매핑된 점수판
        Map<String, Integer> resultScore = new HashMap<>();
        for (int i = 0; i < P.size(); i++) {
            resultScore.put(P.get(i),i+1); //i+1 : 1부터 시작
        }

        int maxScore =0;
        for (String[] words : wordList) { // {"a","b","cd"} {"a","bc","d"} . . .중에 하나씩 꺼냄
            int tempScore = 0;
            for (String word : words) { //"a" , "b" , "cd" 중에 하나씩 꺼냄
                tempScore += resultScore.get(word); //"a"에 매칭된 key값은 1이다!
            }
            maxScore = Math.max(maxScore, tempScore);
            //Math.max(a,b) a,b를 비교해 큰 값을 =왼쪽 변수에 저장.
        }
        System.out.println(maxScore);


    }

}