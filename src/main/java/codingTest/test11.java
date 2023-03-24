package codingTest;

import java.util.Arrays;

public class test11 {
    public static void main(String[] args) {
        test11 sol = new test11();
        int a = 2;
        int b = 5;
        System.out.println(Arrays.toString(sol.solution(a, b)));
    }

    //x만큼 간격이 있는 n개의 숫자
    //x는 정수, n은 자연수
    //x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴 -> +=x
    // -10000000 <= x <= 10000000
    // n<=1000 //n !=0
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long y = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = y;
            y += x;
        }
        return answer;
    }
}
