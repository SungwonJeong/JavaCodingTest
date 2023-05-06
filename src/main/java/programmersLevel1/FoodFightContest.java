package programmersLevel1;

public class FoodFightContest {
    public static void main(String[] args) {
        FoodFightContestSolution solution = new FoodFightContestSolution();
        int[] food = {1, 3, 4, 6};
        System.out.println("result = " + solution.solution(food));
    }
}

/* food[i]는 i번 음식의 수
 * food[0]은 물이며 항상 1
 * food 배열은 칼로리가 적은 순으로 이루워져 있으며
 * 홀수인 경우에는 하나를 빼고 공정하게 나눈다. 하나를 뺐을 때 0이면 대회 음식으로 쓸 수 없다.
 * 정답의 길이가 3인 경우만 입력으로 주어진다.
 * 음식의 배치를 나타내는 문자열을 return
 * */
class FoodFightContestSolution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                sb.append(i);
            }
        }
        answer = sb.toString() + "0" + sb.reverse().toString();

        return answer;
    }
}
