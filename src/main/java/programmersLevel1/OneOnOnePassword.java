package programmersLevel1;

import java.util.Arrays;

public class OneOnOnePassword {
    public static void main(String[] args) {
        OneOnOnePasswordSolution solution = new OneOnOnePasswordSolution();
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println("result = " + solution.solution(s,skip,index));
    }
}

/* 문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줌
 * index 만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아감
 * skip에 있는 알파벳은 제외하고 건너 뛴다.
 * 위의 규칙대로 s를 변환한 결과를 return
 * */
class OneOnOnePasswordSolution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = 0; j < index; j++) {
                ch += 1;
                if (ch > 'z') {
                    ch -= 26;
                }
                if (skip.contains(String.valueOf(ch))) {
                    j--;
                }
            }
            answer += ch;
        }

        return answer;
    }
}
