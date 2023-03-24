package codingTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class DescendingInt {
    /*
     * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴
     * n= 118372 -> 873211
     * n은 1이상 8000000000이하 자연수
     *
     * */
    public long solution(long n) {
        long answer = 0;
        String des = String.valueOf(n);
        String[] str = new String[des.length()];
        int[] arrInt = new int[des.length()];

        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(des.charAt(i));
            arrInt[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < str.length-1; i++) {
            for (int j = 0; j < str.length-1; j++) {
                if (arrInt[j] < arrInt[j + 1]) {
                    int tmp = arrInt[j];
                    arrInt[j] = arrInt[j + 1];
                    arrInt[j + 1] = tmp;
                }
            }
        }
        System.out.println("arrInt : "+Arrays.toString(arrInt));
        String plus = "";
        for (int i = 0; i < arrInt.length; i++) {
//            plus = String.valueOf(arrInt[i]).concat(String.valueOf(arrInt[i+1]));
            plus += arrInt[i];
        }
        System.out.println("plus = "+plus);
        answer = Long.parseLong(plus);
        return answer;
    }

    public long solution2(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }

    public int reverseInt(int n){

        String str = Integer.toString(n);
        char[] c = str.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder(new String(c,0,c.length));
        return Integer.parseInt(((sb.reverse()).toString()));
    }



    public static void main(String[] args) {
        DescendingInt di = new DescendingInt();
        System.out.println(di.solution(118372));
//        long n = 118372;
//        String des = String.valueOf(n);
//        String[] str = new String[des.length()];
//        int[] arrInt = new int[des.length()];
//        System.out.println(Arrays.toString(str));
//
//        for (int i = 0; i < str.length; i++) {
//            str[i] = String.valueOf(des.charAt(i));
//            arrInt[i] = Integer.parseInt(str[i]);
//        }
//        System.out.println(Arrays.toString(str));
//        System.out.println(Arrays.toString(arrInt));
//        for (int i = 0; i < str.length-1; i++) {
//            for (int j = 0; j < str.length-1; j++) {
//                if (arrInt[j] < arrInt[j + 1]) {
//                    int tmp = arrInt[j];
//                    arrInt[j] = arrInt[j + 1];
//                    arrInt[j + 1] = tmp;
//                }
//            }
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arrInt));
    }
}
