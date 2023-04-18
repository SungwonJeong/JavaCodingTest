package programmersLevel1;

public class PressKeypad {
    public static void main(String[] args) {
        PressKeypadSolution sol = new PressKeypadSolution();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println("result = " + sol.solution(numbers, hand));
    }
}

/*
* 손가락은 상하좌우 4가지 방향으로만 이동할 수 있고 키패드 이동 한칸은 거리로 1로 해당
* 1,4,7은 왼손 / 3,6,9는 오른손으로만 사용 가능
* 가운데 2,5,8,0은 더 가까운 손으로 입력 / 단, 같은 거리일 때는 오른손잡이는 오른손, 왼손잡이는 왼손으로 함
* 시작은 왼손은 *, 오른손은 #
* 각 번호를 누른 손이 왼손인지 오른손인지를 연속된 문자열 형태로 return
* */
class PressKeypadSolution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer += "R";
                right = number;
            } else {
                if (number == 0) {
                    number = 11;
                }
                int leftDistance = Math.abs(number - left)/3 + Math.abs(number - left)%3;
                int rightDistance = Math.abs(number - right)/3 + Math.abs(number - right)%3;
                if (leftDistance > rightDistance) {
                    answer += "R";
                    right = number;
                } else if (leftDistance < rightDistance) {
                    answer += "L";
                    left = number;
                } else {
                    if (hand.equals("right")) {
                        answer += "R";
                        right = number;
                    } else {
                        answer += "L";
                        left = number;
                    }
                }
            }
        }
        return answer;
    }
}
