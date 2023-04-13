package programmersLevel1;

import java.util.Collections;
import java.util.LinkedList;

public class GymSuit {
    public static void main(String[] args) {
        GymSuitSolution sol = new GymSuitSolution();
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println("result = " + sol.solution(n,lost,reserve));
    }
}

/*
* 학생들의 번호는 체격 순 -> 바로 앞번호의 학생이나 뒷번호의 학생에가만 빌려 줄 수 있음
* 최대한 많은 학생들이 수업을 들어야함
* 전체 학생 수 n, 체육복을 도난 당한 학생의 번호의 배열 lost, 여벌의 체육복을 가져온 학생들의 번호의 배열 reserve
* */
class GymSuitSolution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        LinkedList<Integer> losStu = new LinkedList<>();
        LinkedList<Integer> resStu = new LinkedList<>();

        for (int i = 0; i < lost.length; i++) {
            losStu.add(lost[i]);
        }
        for (int i = 0; i < reserve.length; i++) {
            resStu.add(reserve[i]);
        }
        Collections.sort(losStu);
        Collections.sort(resStu);

        for (int i = 0; i < losStu.size(); i++) {
            for (int j = 0; j < resStu.size(); j++) {
                if (losStu.get(i) == resStu.get(j)) {
                    losStu.remove(i);
                    resStu.remove(j);
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < resStu.size(); i++) {
            for (int j = 0; j < losStu.size(); j++) {
                if (resStu.get(i)-1 == losStu.get(j) || resStu.get(i)+1 == losStu.get(j)) {
                    losStu.remove(j);
                    break;
                }
            }
        }

        answer = n - losStu.size();
        return answer;
    }
}
