package programmersLevel1;

import java.util.ArrayList;

public class TernaryFlip {
    public static void main(String[] args) {
        TernaryFlipSolution sol = new TernaryFlipSolution();
        int n = 45;
        System.out.println("result = " + sol.solution(n));
    }
}

/*
 * 자연수 n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return
 * 45 -> 3진법 : 1200 -> 뒤집기 : 0021 -> 10진법 : 7
 * */
class TernaryFlipSolution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arrList = new ArrayList<>();
        while (n != 0) {
            arrList.add(n % 3);
            n /= 3;
        }

        int tmp = 1;
        for (int i = arrList.size() - 1; i >= 0; i--) {
            answer += arrList.get(i) * tmp;
            tmp *= 3;
        }
        return answer;
    }
}
