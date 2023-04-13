package programmersLevel1;

import java.util.ArrayList;
import java.util.Arrays;

public class FailureRate {
    public static void main(String[] args) {
        FailureRateSolution sol = new FailureRateSolution();
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = sol.solution(N,stages);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/*
 * 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
 * N = 전체 스테이지 개수 , stages = 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열
 * 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return
 * stages 배열에서 N+1 원소는 마지막스테이지까지 클리어한 사용자
 * 실패율이 같은 스테이지가 있으면 작은 번호의 스테이지가 먼저 오도록함
 * 스테이지에 도달한 유저가 없는 경우의 실패율은 0
 * */
class FailureRateSolution {
    static class failRate {
        int idx;
        double rate;

        public failRate(int idx, double rate) {
            this.idx = idx;
            this.rate = rate;
        }
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] notClearCount = new int[N + 2];
        int[] clearCount = new int[N + 1];

        for (int stage : stages) {
            notClearCount[stage]++;
        }

        clearCount[N] = notClearCount[N] + notClearCount[N + 1];
        for (int i = N-1; i >= 1; i--) {
            clearCount[i] = notClearCount[i] + clearCount[i + 1];
        }

        ArrayList<failRate> arrList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {

            if(clearCount[i]==0){
                arrList.add(new failRate(i, 0));
                continue;
            }

            double rate = (double) notClearCount[i] / clearCount[i];
            arrList.add(new failRate(i, rate));
        }

        arrList.sort(((o1, o2) -> Double.compare(o2.rate, o1.rate)));

        for (int i=0; i<arrList.size(); i++) {
            answer[i] = arrList.get(i).idx;
        }

        return answer;
    }
}
