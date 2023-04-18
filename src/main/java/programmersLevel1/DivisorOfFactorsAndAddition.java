package programmersLevel1;

public class DivisorOfFactorsAndAddition {
    public static void main(String[] args) {
        DivisorOfFactorsAndAdditionSolution sol = new DivisorOfFactorsAndAdditionSolution();
        int left = 13;
        int right = 17;
        System.out.println("result = " + sol.solution(left,right));
    }
}

/* 두 정수 left부터 right까지의 모든 수들 중에서 약수의 개수가 짝수인 수는 더하고, 홀수인 수는 뺀 수를 return
 *
 * */
class DivisorOfFactorsAndAdditionSolution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) {
                    count++;
                }
            }
            answer = (count%2 == 0) ? answer+i : answer-i;
        }

        return answer;
    }
}
