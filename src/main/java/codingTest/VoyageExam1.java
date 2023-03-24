package codingTest;

public class VoyageExam1 {
    //윷놀이 - 4개의 윷짝을 던짐
    //배 : 0 / 등 : 1
    //도 : 배 1개 / 등 3개
    //개 : 배 2개 / 등 2개
    //걸 : 배 3개 / 등 1개
    //윷 : 배 4개 / 등 0개
    //모 : 배 0개 / 등 4개
    //이중에 어떤 게 나올지 결정
    //[0,1,0,1] - 개 / [1,1,1,0] - 도 / [0,0,1,1] - 개
    public String solution(int[] arr1) {
        String answer;
        int zeroCount = 0;      // 배(0)의 총 개수

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                zeroCount++;
            }

        }

        if (zeroCount == 0) {
            answer = "모";
        } else if (zeroCount == 1) {
            answer = "도";
        } else if (zeroCount == 2) {
            answer = "개";
        } else if (zeroCount == 3) {
            answer = "걸";
        } else {
            answer = "윷";
        }
        return answer;
    }

    public static void main(String[] args) {
        VoyageExam1 method = new VoyageExam1();
        int[] arr1 = {0,1,0,0}; // 걸이 나와야함
        System.out.println(method.solution(arr1));
    }
}
