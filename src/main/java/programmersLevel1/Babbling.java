package programmersLevel1;

import java.util.ArrayList;

public class Babbling {
    public static void main(String[] args) {
        BabblingSolution solution = new BabblingSolution();
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println("result = " + solution.solution(babbling));
    }
}

/* 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워함
 * 문자열 배열 babbling이 매개변수로 주어질 때, 조카가 발음할 수 있는 단어의 개수를 return
 * */
class BabblingSolution {
    public int solution(String[] babbling) {
        int answer = 0;

        ArrayList<String> canBabbling = new ArrayList<>();
        for (String str : babbling) {
            str = str.replace("ayaaya","1");
            str = str.replace("yeye","1");
            str = str.replace("woowoo","1");
            str = str.replace("mama","1");
            if (!str.contains("1")) {
                canBabbling.add(str);
            }
            System.out.println("canBabbling = " + canBabbling);
        }

        for (String str : canBabbling) {
            str = str.replace("aya"," ");
            str = str.replace("ye"," ");
            str = str.replace("woo"," ");
            str = str.replace("ma"," ");
            str = str.replace(" ","");
            if (str.equals("")) {
                answer++;
            }
        }

        return answer;
    }
}
