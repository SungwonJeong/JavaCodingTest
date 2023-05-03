package programmersLevel1;

public class StringOfNumbersAndWords {
    public static void main(String[] args) {
        StringOfNumbersAndWordsSolution sol = new StringOfNumbersAndWordsSolution();
        String s = "one4seveneight";
        System.out.println("result = " + sol.solution(s));
    }
}

/* 숫자를 건낼 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 상대방이 원래 숫자를 찾는 게임
 * 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return
 * */
class StringOfNumbersAndWordsSolution {
    public int solution(String s) {
        int answer;

        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < word.length; i++) {
            s = s.replace(word[i], Integer.toString(i));
        }

        answer = Integer.parseInt(s);
        return answer;
    }
}
