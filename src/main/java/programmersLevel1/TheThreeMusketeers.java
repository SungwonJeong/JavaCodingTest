package programmersLevel1;

public class TheThreeMusketeers {
    public static void main(String[] args) {
        TheThreeMusketeersSolution sol = new TheThreeMusketeersSolution();
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println("result = " + sol.solution(number));
    }
}

/* 학생 3명의 정수 번호를 더했을 때 0이 되면 삼총사
 * 학생들의 번호의 배열 number
 * 학생들 중 삼총사를 만들 수 있는 방법의 수를 return
 * */
class TheThreeMusketeersSolution {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
