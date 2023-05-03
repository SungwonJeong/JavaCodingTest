package programmersLevel1;

public class FindRemainderOne {
    public static void main(String[] args) {
        FindRemainderOneSolution sol = new FindRemainderOneSolution();
        int n = 7;
        System.out.println("result = " + sol.solution(n));
    }
}

/*
 * 자연수 n을 자연수 x로 나눈 나머지가 1이 되도록하는 가장 작은 자연수 x를 return
 * */
class FindRemainderOneSolution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                if (i <= n - 1) {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }
}
