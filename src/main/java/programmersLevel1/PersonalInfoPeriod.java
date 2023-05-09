package programmersLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PersonalInfoPeriod {
    public static void main(String[] args) {
        PersonalInfoPeriodSolution solution = new PersonalInfoPeriodSolution();
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] result = solution.solution(today,terms,privacies);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/* 약관 종류는 여러 가지 있으며 각 약관마다 개인정보 보관 유효기간이 정해져 있음
 * ex) 2021년 1월 5일에 수집된 개인정보가 A약관으로 수집되었을 때, A의 유효기간이 12달이면 2022년 1월 4일까지 보관 가능하고 2022년 1월 5일부터는 파기해야함.
 * 모든 달은 28일까지만 있다고 가정
 * 오늘 날짜 today : "YYYY.MM.DD", 약관의 유효기간을 담은 배열 terms : "약관종류 유효기간", 수집된 개인정보의 정보를 담은 배열 privacies : privacies[i]는 i+1번 개인정보의 수집 일자와 약관 종류, "날짜 약관종류"
 * 파기해야 할 개인정보의 번호를 오름차순으로 배열로 return
 * */
class PersonalInfoPeriodSolution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        int date = countDate(today);

        HashMap<String, Integer> map = new HashMap<>();

        for (String term : terms) {
            String[] str = term.split(" ");
            map.put(str[0], Integer.parseInt(str[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            if(countDate(privacy[0]) + (map.get(privacy[1])*28) <= date) {
                answer.add(i+1);
            }
        }

        return answer.stream().mapToInt(Integer->Integer).toArray();
    }

    private int countDate(String today) {
        String[] todayToDate = today.split("\\.");
        int year = Integer.parseInt(todayToDate[0]);
        int month = Integer.parseInt(todayToDate[1]);
        int day = Integer.parseInt(todayToDate[2]);

        return (year*12*28) + (month*28) + day;
    }
}
