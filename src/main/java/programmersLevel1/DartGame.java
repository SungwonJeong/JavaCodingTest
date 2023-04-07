package programmersLevel1;

public class DartGame {
    public static void main(String[] args) {
        DartGameSolution sol = new DartGameSolution();
        String dartResult = "1D#2S*3S";
        System.out.println("sol.solution(dartResult) = " + sol.solution(dartResult));
    }
}

/*
* 다트 게임은 총 3번의 기회, 각 기회마다 0~10점
* 점수와 함께 S,D,T 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱, 점수마다 하나씩 존재
* 옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스
* 스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배
* 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배
* 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배
* 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다
**/
class DartGameSolution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] dart = dartResult.toCharArray();
        int[] score = new int[3];
        int idx = -1;

        for (int i = 0; i < dart.length; i++) {
            if (dart[i] >= '0' && dart[i] <= '9') {
                idx++;
                score[idx] += Integer.parseInt(String.valueOf(dart[i]));
                if (dart[i] == '1' && dart[i + 1] == '0') {
                    score[idx] -= Integer.parseInt(String.valueOf(dart[i]));
                    score[idx] = 10;
                    i++;
                }
            } else if (dart[i] == 'D') {
                score[idx] = (int) Math.pow(score[idx], 2);
            } else if (dart[i] == 'T') {
                score[idx] = (int) Math.pow(score[idx], 3);
            } else if (dart[i] == '*') {
                if (idx > 0) {
                    score[idx - 1] *= 2;
                }
                score[idx] *= 2;
            } else if (dart[i] == '#') {
                score[idx] *= -1;
            }
        }

        answer = score[0] + score[1] + score[2];
        return answer;
    }
}
