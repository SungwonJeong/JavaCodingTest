package codingTest;

public class MockTest2 {
    /*
    공부 기록 남기기
    * 체크인, 체크아웃은 항상 정시에 진행
    * 체크아웃을 할 때 익일 시간은 24+a // 새벽 2시는 24+2
    * 체크인 페이지는 체크아웃이 새벽 5시정각 or 5시넘어가면 체크아웃을 깜빡한것으로 간주 - 자동으로 체크아웃 오후9시(21시)
    * arr1 = 체크인 / arr2 = 체크아웃
    * 각 배열에는 월요일~일요일까지 체크인 / 체크아웃 한 시간이 담겨 있음 - length =7
    *
    * */
    public int solution(int[] arr1, int[] arr2) {
        int[] studyTime = new int[arr1.length]; // 각 날의 공부시간 (체크아웃 시간 - 체크인 시간)
        int sum = 0; // (체크아웃 시간 - 체크인 시간) 들의 총합
        //일주일동안 공부하는 시간을 계산하기 때문에 for문 사용
        for (int i = 0; i < arr1.length; i++) {
            if(arr2[i]>=29){
                arr2[i] = 21;      //새벽 5시 : 24+5시 = 29시가 넘어가면 21시로 바꿈
            }
            studyTime[i] = arr2[i] - arr1[i];
            sum += studyTime[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        MockTest2 method = new MockTest2();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr1, arr2));
    }
}
