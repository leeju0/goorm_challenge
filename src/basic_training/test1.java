package basic_training;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String K = sc.next();


        ArrayList<String> s = new ArrayList<>();
        for (int i = 0; i < N; i++) {
             s.add(sc.next());

        }

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).contains(K)) {
                s.remove(i);
                i--;

            }

        }
        System.out.println(s.size());

        
    } 
}
