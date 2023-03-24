package codingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MarathonByParticipant {
    /*
     * 단 한 명의 선수를 제외하고 모든 선수가 마라톤을 완주
     * participant 마라톤에 참여한 선수들의 이름들이 담긴 배열
     * completion 완주한 선수들의 이름이 담긴 배열
     * 완주하지 못한 선수의 이름을 return
     * //선수 수는 1명 이상 100,000이하
     * //completion.length = participant.length-1
     * //이름은 알파벳 소문자 1개이상 20개 이하
     * //참가자중 동명이인 있을 수 있음
     * //오름차순으로 정렬 후 비교
     * */
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }

        }
        return participant[i];

    }

    public static void main(String[] args) {
        MarathonByParticipant marathon = new MarathonByParticipant();
        String[] test1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] test2 = {"josipa", "nikola", "vinko", "filipa"};
        System.out.println(marathon.solution(test1, test2));
//        Arrays.sort(test1);
//        Arrays.sort(test2);

//        for (String s : test1) {
//            System.out.println(s);
//
//        }
//        for (String s : test2) {
//            System.out.println(s);

    }
}

