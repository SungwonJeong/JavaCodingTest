package programmersLevel1;

import java.util.Arrays;

public class Fruiterer {
    public static void main(String[] args) {
        FruitererSolution solution = new FruitererSolution();
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println("result = " + solution.solution(k,m,score));
    }
}

/* 사과의 상태에 따라 1점부터 k점까지 점수로 분류, k점이 최상품 / 1점이 최하품
 * 사과 한 상자의 가격은 m개씩를 담을때 가장 낮은 점수 p*m이다.
 * 사과는 상자단위로만 판매하고 남은 사과는 버린다.
 * 사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score
 * 최대이익을 return
 * */
class FruitererSolution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for (int i = score.length-1; i >= 0; i--) {
            if ((score.length-i)%m == 0) {
                answer += m*score[i];
            }
        }

        return answer;
    }
}
