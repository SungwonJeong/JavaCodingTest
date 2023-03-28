package programmersLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateSameNumber {
    public static void main(String[] args) {
        HateSameNumberSolution sol = new HateSameNumberSolution();
        int[] test = {1,1,3,3,0,1,1};
        int[] result = sol.solution(test);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/*
 * 반복되는 숫자는 하나만 남기고 모두 제거
 * 반환값은 원소의 순서를 유지
 * */
class HateSameNumberSolution {
    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> arrayList = new ArrayList<>();

        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                arrayList.add(arr[i]);
                num = arr[i];
            }
        }
        answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
