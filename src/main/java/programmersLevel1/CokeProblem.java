package programmersLevel1;

public class CokeProblem {
    public static void main(String[] args) {
        CokeProblemSolution solution = new CokeProblemSolution();
        int a = 2;
        int b = 1;
        int n = 20;

        System.out.println("result = " + solution.solution(a,b,n));
    }
}

/* 빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다 주면 몇병을 받을 수 있는지 계산하는 문제
 * 보유 중인 빈 병이 a개 미만이면, 추가적으로 빈 병을 받을 순 없음
 * 받을 수 있는 콜라의 병 수를 return
 * */
class CokeProblemSolution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        int exchangedCoke = 0;
        while (true) {
            if (n < a) {
                break;
            }

            exchangedCoke += (n/a)*b;
            int remainCoke = n%a;
            n = (n/a)*b + remainCoke;
        }

        answer = exchangedCoke;
        return answer;
    }
}
