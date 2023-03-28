package programmersLevel1;

import java.util.Arrays;
import java.util.Collections;

public class StringDescendingSort {
    public static void main(String[] args) {
        StringDescendingSortSolution sol = new StringDescendingSortSolution();
        String test = "asfeFe";
        System.out.println("result = " + sol.solution(test));
    }
}

/*
* 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬
* s는 대소문자로 구성
* 대문자는 소문자보다 작은것으로 간주함
* */
class StringDescendingSortSolution {
    public String solution(String s) {
        String answer = "";

        String[] arrString = s.split("");
        Arrays.sort(arrString, Collections.reverseOrder());

        for (String string : arrString) {
            answer += string;
        }

        return answer;
    }
}
