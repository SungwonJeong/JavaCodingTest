package codingTest;

public class InternalTest {
    /*
     길이가 같은 1차원 정수 배열 a,b가 매개 변수
     a,b의 내적을 return = a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
     n = a,b의 길이
     */
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        InternalTest sol = new InternalTest();
        int[] test1 = new int[]{1,2,3,4};
        int[] test2 = new int[]{-3,-1,0,2};
        System.out.println(sol.solution(test1,test2));
    }
}
