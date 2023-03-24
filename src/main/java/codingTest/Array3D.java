package codingTest;

public class Array3D {
    public static void main(String[] args) {
        // 2의 제곱 값, 3의 제곱 값, 4의 제곱 값, 5의 제곱값 각각 8묶음의 형태
        int[][][] thrArr = new int[4][2][4];

        //내가 한 풀이
//        for (int i = 0; i < thrArr.length; i++) {
//            for (int j = 0; j < thrArr[i].length; j++) {
//                for (int k = 0; k < thrArr[i][j].length; k++) {
//                    int two = 2;
//                    int three = 3;
//                    int four = 4;
//                    int five = 5;
//                    if (i == 0) {
//                        two = (int) (Math.pow(2, (k + 1) * (j + 1)));
//                        System.out.print(two + "\t");
//                    } else if (i == 1) {
//                        three = (int) (Math.pow(3, (k + 1) * (j + 1)));
//                        System.out.print(three + "\t");
//                    } else if (i == 2) {
//                        four = (int) (Math.pow(4, (k + 1) * (j + 1)));
//                        System.out.print(four + "\t");
//                    } else {
//                        five = (int) (Math.pow(5, (k + 1) * (j + 1)));
//                        System.out.print(five + "\t");
//                    }
//
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        //매니저님 풀이
        //int two를 각각 for문 밑에다 찍어보고 결과 확인하기 어떻게 다른지??
        //two++도 마찬가지
        for (int i = 0; i < thrArr.length; i++) {
            int two = 2;
            for (int j = 0; j < thrArr[i].length; j++) {
                for (int k = 0; k < thrArr[i][j].length; k++) {
                    thrArr[i][j][k] = (int) (Math.pow(i + 2,two));
                    two++;

                }

            }

        }
        for (int[][] ints : thrArr) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
