package programmersLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortOwnsString {
    public static void main(String[] args) {
        SortOwnsStringSolution sol = new SortOwnsStringSolution();
        String[] test = {"sun", "bed", "car"};
        String[] result = sol.solution(test, 1);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/*
* 1<=strings.length<=50
* strings 는 모두 소문자 알파벳
* 1<=strings[i].length<=100
* 인덱스 n의 문자로 오름차순 정렬
* */
class SortOwnsStringSolution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arrayList.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arrayList);

        answer = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i).substring(1);
        }
        return answer;
    }
}
