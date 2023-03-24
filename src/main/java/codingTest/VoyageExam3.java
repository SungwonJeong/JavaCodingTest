package codingTest;

import java.util.Arrays;

public class VoyageExam3 {
    //상하좌우 큰 수 찾기
    //5x5 2차원 배열
    //어떤 원소가 상하좌우에 있는 원소보다 클 때 해당 위치를 *로 표시
    public void solution(int[][] arr1) {
        //arr1배열보다 길이가 2 긴 배열
        int[][] topNum = new int[arr1.length + 2][arr1[0].length + 2];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                topNum[i + 1][j + 1] = arr1[i][j];
            }
        }
//        System.out.println("topNum = " + Arrays.deepToString(topNum));

        //*을 찍어주기 위해 topNum배열을 String배열로 바꾸기
        String[][] strNum = new String[arr1.length + 2][arr1.length + 2];
        for (int i = 0; i < strNum.length; i++) {
            for (int j = 0; j < strNum[i].length; j++) {
                strNum[i][j] = String.valueOf(topNum[i][j]);
            }
        }

        // 상하좌우에서 가장 큰 수 * 찍기
        for (int i = 1; i < topNum.length - 1; i++) {
            for (int j = 1; j < topNum[i].length - 1; j++) {
                if (topNum[i][j] > topNum[i - 1][j] && topNum[i][j] > topNum[i + 1][j] && topNum[i][j] > topNum[i][j - 1] && topNum[i][j] > topNum[i][j + 1]) {
                    strNum[i][j] = "*";
                }
            }
        }
//        System.out.println("strNum  = " + Arrays.deepToString(strNum));

        //테두리 지우기
        String[][] removeEdge = new String[5][5];
        for (int i = 1; i < removeEdge.length+1; i++) {
            for (int j = 1; j < removeEdge.length+1; j++) {
                removeEdge[i-1][j-1] = strNum[i][j];
            }
        }
        System.out.println("removeEdge = " + Arrays.deepToString(removeEdge));
    }

    public static void main(String[] args) {
        VoyageExam3 method = new VoyageExam3();
        int[][] arr1 = {
                {7, 4, 6, 5, 9},
                {6, 1, 3, 4, 5},
                {4, 8, 5, 6, 9},
                {1, 3, 0, 6, 4},
                {6, 4, 8, 1, 7}
        };
        int[][] arr2 = {
                {3,4,1,4,9},
                {2,9,4,5,8},
                {9,0,8,2,1},
                {7,0,2,8,4},
                {2,7,2,1,4}
        };

        method.solution(arr2);
    }
}
