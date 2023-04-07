package programmersLevel1;

import java.util.Arrays;

public class KthNumber {
    public static void main(String[] args) {
        KthNumberSolution sol = new KthNumberSolution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };
        int[] result = sol.solution(array, commands);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/*
* 배열의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수
* */
class KthNumberSolution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
