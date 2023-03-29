package programmersLevel1;

public class SumOfDivisor {
    public static void main(String[] args) {
        SumOfDivisorSolution sol = new SumOfDivisorSolution();
        int n = 12;
        System.out.println("result = " + sol.solution(n));
    }
}

/*
* 자연수 n의 약수의 합
* */
class SumOfDivisorSolution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n + 1; i++) {
             if (n % i == 0) {
                 answer += i;
             }
        }

        return answer;
    }
}
