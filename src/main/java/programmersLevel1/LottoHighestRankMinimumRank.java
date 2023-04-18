package programmersLevel1;

import java.util.Arrays;

public class LottoHighestRankMinimumRank {
    public static void main(String[] args) {
        LottoHighestRankMinimumRankSolution sol = new LottoHighestRankMinimumRankSolution();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] result = sol.solution(lottos, win_nums);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/* 순위 1 = 6개 번호 일치, 2 = 5개, 3 = 4개, 4 = 3개, 5 = 2개, 6 = 그 외
 * 알아볼 수 없는 번호는 0으로 표기
 * 민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호의 배열 win_nums
 * 최고 순위와 최저 순위를 return
 * */
class LottoHighestRankMinimumRankSolution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int maxCount = 0;
        int minCount = 0;

        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                maxCount++;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    minCount++;
                }
            }
        }

        answer[0] = rank(maxCount + minCount);
        answer[1] = rank(minCount);

        return answer;
    }

    public int rank(int n) {
        switch (n) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }
}
