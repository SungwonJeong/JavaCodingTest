package programmersLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HallOfFame {
    public static void main(String[] args) {
        HallOfFameSolution solution = new HallOfFameSolution();
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] result = solution.solution(k,score);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/* 매일 1명의 가수가 노래를 부르고 점수를 부여함
 * 초기 k일 까지는 모든 출연 가수의 점수가 명예의 전당에 오르고, k일 다음부터는 출연 가수의 점수가 기존의 명예의 전당 목록의 k번 째 순위의 가수 점수 보다 더 높으면 오른다.
 * 그리고 k 번째 순위의 점수는 명예의 전당에서 내려오게 된다.
 * 1일 부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때, 매일 발표된 명예의 전당의 최하위 점수를 return
 * */
class HallOfFameSolution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            arrList.add(score[i]);
            if (i >= k) {
                arrList.remove(Collections.min(arrList));
            }
            answer[i] = Collections.min(arrList);
        }

        return answer;
    }
}
