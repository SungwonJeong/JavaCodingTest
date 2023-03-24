package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberFlip {
    /*
    * 자연수 n을 뒤집는다 12345 -> 54321
    * 각 자리 숫자를 원소로 가지는 배열 형태로 리턴 [5,4,3,2,1]
    * n은 10,000,000,000이하인 자연수
    * */
    public int[] solution(long n) {
        String flip = String.valueOf(n);
        int[] answer = new int[flip.length()];
        String[] str = new String[flip.length()];
        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(flip.charAt(i));
            answer[i] = Integer.parseInt(str[i]);
        }
        for (int j = 0; j < answer.length/2; j++) {
            int num = answer.length-j-1;
            int tmp = answer[j];
            answer[j] = answer[num];
            answer[num] = tmp;
        }
        return answer;
    }
    // StringBuilder 활용
    public int[] solution2(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] answer = new int[ss.length];
        for (int i=0; i<ss.length; i++) {
            answer[i] = Integer.parseInt(ss[i]);
        }
        return answer;
    }
    //List 활용
    public List<Integer> solution3(long n) {
        String str = String.valueOf(n);
        char[] chArr = str.toCharArray();

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            answer.add((int) str.charAt(i)- '0');
        }

        Collections.reverse(answer);

        return answer;
    }

    public static void main(String[] args) {
        NumberFlip nf = new NumberFlip();
        long test = 12345;
        System.out.println(Arrays.toString(nf.solution(test)));
//        long n = 12345;
//        String flip = String.valueOf(n);
//        int[] answer = new int[flip.length()];
//        String[] str = new String[flip.length()];
//        for (int i = 0; i<flip.length(); i++) {
//            str[i] = String.valueOf(flip.charAt(i));
//            System.out.println(Arrays.toString(str));
//            answer[i] = Integer.parseInt(str[i]);
//        }
//        System.out.println(Arrays.toString(str));
//        System.out.println(Arrays.toString(answer));
//        for (int j = 0; j < answer.length/2 ; j++) {
//            int num = answer.length-j-1;
//            int tmp = answer[j];
//            answer[j] = answer[num];
//            answer[num] = tmp;
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(answer));
    }
}
