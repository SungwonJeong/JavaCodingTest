package programmersLevel1;

import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args) {
        SecretMapSolution sol = new SecretMapSolution();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] result = sol.solution(n, arr1, arr2);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/*
 * 지도는 한 변의 길이가 n인 정사각형 배열
 * 각 칸은 공백(" ") or 벽("#") 으로 이루어져 있음
 * 전체 지도는 지도1, 지도2를 겹쳐야함.
 * 지도1 or 지도2에서 공백이거나 벽인 부분은 전체 지도에서도 똑같음
 * 암호화된 배열은 벽 1 공백 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열
 * 지도를 해독해 " ", "#"으로 구성된 문자열 배열로 출력해야함
 * */
class SecretMapSolution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String str = "";
            String binary1 = createBinary(n, arr1[i]);
            String binary2 = createBinary(n, arr2[i]);
            for (int j = 0; j < n; j++) {
                if (binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
                    str += "#";
                } else {
                    str += " ";
                }
            }
            answer[i] = str;
        }
        return answer;
    }

    private String createBinary(int n, int arr) {
        String binaryString = Integer.toBinaryString(arr);
        int len = binaryString.length();
        for (int j = 0; j < n - len; j++) {
            binaryString = "0" + binaryString;
        }
        return binaryString;
    }
}
