package codingTest;

import java.util.Arrays;

public class DivisorArrayTest {
    //    arr의 원소중 divisor로 나누어 떨어지는 원소
//    그것을 오름차순으로 정렬
//    나누어 떨어디는 원소가 없으면 -1 return
    public int[] solution(int[] arr, int divisor) {
        int count = 0; //0으로 나누어 떨어지는 arr의 개수
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }
        if (count == 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[num] = arr[i];
                num++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        DivisorArrayTest div = new DivisorArrayTest();
        int[] arrTest = new int[]{2,36, 1, 3};
        System.out.println(div.solution(arrTest, 1));
    }
}
