package programmersLevel1;

import java.util.ArrayList;

public class NewIdRecommendation {
    public static void main(String[] args) {
        NewIdRecommendationSolution sol = new NewIdRecommendationSolution();
        String new_id = "abcdefghijklmn.p";
        System.out.println("result = " + sol.solution(new_id));
    }
}

/*
 * ID는 3자 이상 15자 이하
 * ID는 알파벳 소문자, 숫자, -, _, .만 사용 가능, .는 처음과 끝에는 사용이 불가능 하고 연속으로 사용 불가능
 * */
class NewIdRecommendationSolution {
    public String solution(String new_id) {
        String answer = "";

        String step1 = new_id.toLowerCase();
        String step2 = step1.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9-_.]", "");
        String step3 = step2.replaceAll("[.]+", ".");
        ArrayList<Character> step4 = new ArrayList<>();
        for (int i = 0; i < step3.length(); i++) {
            step4.add(step3.charAt(i));
        }
        if (!step4.isEmpty()){
            if (step4.get(0).equals('.')) {
                step4.remove(0);
            }
        }
        if (!step4.isEmpty()){
            if (step4.get(step4.size() - 1).equals('.')) {
                step4.remove(step4.size() - 1);
            }
        }
        if (step4.size() == 0) {
            step4.add('a');
        }

        String step5 = "";
        for (Character character : step4) {
            step5 += character;
        }

        String step6 = "";
        if (step5.length() > 15) {
            step6 = step5.substring(0, 15);
            answer = step6;
            if (step6.endsWith(".")) {
                answer = step6.substring(0, 14);
            }
        } else if (step5.length() < 3) {
            do {
                step5 += step5.substring(step5.length() - 1);
            } while (step5.length() < 3);
            answer = step5;
        } else {
            answer = step5;
        }

        return answer;
    }
}
