package programmersLevel1;

import java.util.Arrays;

public class GreatestCommonDivisorAndLeastCommonMultiple {
    public static void main(String[] args) {
        GreatestCommonDivisorAndLeastCommonMultipleSolution sol = new GreatestCommonDivisorAndLeastCommonMultipleSolution();
        int n = 2;
        int m = 5;
        System.out.println("result = " + Arrays.toString(sol.solution(n, m)));
    }
}

/*
* 두수의 최대공약수와 최소공배수
* */
class GreatestCommonDivisorAndLeastCommonMultipleSolution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n, m);

        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }
        answer[1] = n*m/answer[0];

        return answer;
    }
}
