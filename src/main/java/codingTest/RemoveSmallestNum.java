package codingTest;

import java.util.Arrays;

public class RemoveSmallestNum {
    /*
     * 정수를 저장한 배열 arr에서 가장 작은 수를 제거한 배열을 리턴
     * 조건 : 리턴하려는 배열이 빈 배열인 경우는 배열에 -1을 채우고 리턴
     * [4,3,2,1] - [4,3,2] / [10] - [-1] -> arr.length == 1
     * index i != j 면 arr[i] != arr[j]
     * */
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        //가장 작은 수 구하기
        for (int i = 0; i < arr.length; i++) {
            min =(int) (Math.min(min,arr[i]));
        }

//        Arrays.sort(arr); // 오름차순으로 정렬한 뒤 맨 마지막에 있는 값을 제외한 나머지만 넣기
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(min == arr[i]){
                continue; // 배열에 넣지 않고 넘어감
            }
            answer[index++] = arr[i];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        RemoveSmallestNum rsn = new RemoveSmallestNum();
        int[] test = {2, 4, 1, 3};
        rsn.solution(test);
    }
}
