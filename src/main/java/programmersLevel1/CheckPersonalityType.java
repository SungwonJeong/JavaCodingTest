package programmersLevel1;

import java.util.HashMap;

public class CheckPersonalityType {
    public static void main(String[] args) {
        CheckPersonalityTypeSolution sol = new CheckPersonalityTypeSolution();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println("result = " + sol.solution(survey,choices));
    }
}

/* 1번 지표 : 라이언형(R),튜브형(T) , 2번 지표 : 콘형(C), 프로도형(F) , 3번 지표 : 제이지형(J), 무지형(M) , 4번 지표 : 어피치형(A), 네오형(N)
 * 성격 유형은 총 16가지(2*2*2*2)
 * 검사지에는 총 n개의 질문과 각 질문에는 7개의 선택지가 있음
 * 매우는 3점(지표의 두가지 형), 동의/비동의는 2점, 약간은 1점, 모르겠음은 점수 없음
 * 검사 결과는 모든 질문의 성격 유형 점수를 더해 각 지표에서 더 높은 점수를 받은 성격 유형이 검사자의 성격 유형, 단 하나의 지표에서 각 성격 유형 점수가 같으면 두 성격 유형 중 사전 순으로 빠른 유형을 택
 * 질문마다 판단하는 지표의 survey, 검사자가 각 질문마다 선택한 선택지를 담은 choices
 * 검사자의 성격 유형 검사 결과를 지표 번호 순서대로 return
 * survey의 원소는 "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" 중 하나
 * survey[i]의 첫 번째 캐릭터는 i+1번 질문의 비동의 관련 선택지를 선택하면 받는 성격 유형을 의미
 * survey[i]의 두 번째 캐릭터는 i+1번 질문의 동의 관련 선택지를 선택하면 받는 성격 유형을 의미
 * choices의 길이 == survey의 길이
 * choices[i]는 검사자가 선택한 i+1번째 질문의 선택지를 의미
 * choices의 1~7은 매우 비동의 ~ 매우 동의
 *
 * */
class CheckPersonalityTypeSolution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        HashMap<Character, Integer> idx = new HashMap<>();
        for (int i = 0; i < type.length; i++) {
            idx.put(type[i], i);
        }

        int[] scores = new int[8];
        for (int i = 0; i < survey.length; i++) {
            char[] ch = survey[i].toCharArray();
            switch (choices[i]) {
                case 1:
                    scores[idx.get(ch[0])] += 3;
                    break;
                case 2:
                    scores[idx.get(ch[0])] += 2;
                    break;
                case 3:
                    scores[idx.get(ch[0])] += 1;
                    break;
                case 4:
                    break;
                case 5:
                    scores[idx.get(ch[1])] += 1;
                    break;
                case 6:
                    scores[idx.get(ch[1])] += 2;
                    break;
                case 7:
                    scores[idx.get(ch[1])] += 3;
                    break;
            }
        }
        for (int i = 0; i < 8; i+=2) {
            if (scores[i] > scores[i+1]) {
                answer += type[i];
            } else if (scores[i] == scores[i+1]) {
                if (type[i] < type[i+1]) {
                    answer += type[i];
                } else {
                    answer += type[i+1];
                }
            } else {
                answer += type[i+1];
            }
        }

        return answer;
    }
}
