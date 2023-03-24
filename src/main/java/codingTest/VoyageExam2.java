package codingTest;

public class VoyageExam2 {
    //triangular Output
    //첫재 줄에 정수 n (0<= n <=100)
    //'*'로 삼각형 모양 만들기
    // 공백의 개수와 별의 개수를 잘 확인
    // 별의 개수 +2씩 증가
    public void solution(int star) {

        for (int i = 0; i < star; i++) {
            for (int j = 1; j < star - i; j++) {
                System.out.print(" "); //공백
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*"); //별
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        VoyageExam2 method = new VoyageExam2();
        int star = 9;
        method.solution(star);
    }
}
