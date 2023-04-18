package programmersLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PickTwoAndAdd {
    public static void main(String[] args) {
        PickTwoAndAddSolution sol = new PickTwoAndAddSolution();
        int[] numbers = {2,1,3,4,1};
        int[] result = sol.solution(numbers);
        System.out.println("result = " + Arrays.toString(result));

    }
}

/*
* 정수 배열 numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해 만들 수 있는 모든 수를 배열에 오름차순으로 return
* */
class PickTwoAndAddSolution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!arrList.contains(sum)) {
                    arrList.add(sum);
                }
            }
        }

        Collections.sort(arrList);
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}
