package codingTest;

public class test10 {
    public static void main(String[] args) {
        test10 sol = new test10();
        int[][] test1 = new int[][] {{1,2},{2,3}};
        int[][] test2 = new int[][] {{3,4},{5,6}};
    }
    //행렬의 덧셈
    //행과 열의 크기가 같은 두 행렬의 같은 행, 다른 열의 값을 서로 더한 결과
    //2개의 행렬 arr1, arr2의 덧셈
    //arr1, arr2의 행과 열의 길이는 500을 넘지 않음
    //arr1[i][j] + arr2[i][j]
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length] ;
//        int[][] sum = new int[arr1.length][arr2.length]; // 필요없는부분
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
//                sum[i][j] = arr1[i][j] + arr2[i][j];
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
