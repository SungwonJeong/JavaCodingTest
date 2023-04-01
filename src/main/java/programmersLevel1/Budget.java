package programmersLevel1;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        BudgetSolution sol = new BudgetSolution();
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println("result = " + sol.solution(d, budget));
    }
}

/*
* 각 부서가 신청한 금액만큼 모두 지원해줘야 함
* 부서별로 신청한 금액의 배열 d / 예산 budget
* 최대 몇 개의 부서에 물품을 지원할 수 있는지?
* */
class BudgetSolution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {
                answer = i;
                break;
            }
        }
        if (sum <= budget) {
            answer = d.length;
        }

        return answer;
    }
}
