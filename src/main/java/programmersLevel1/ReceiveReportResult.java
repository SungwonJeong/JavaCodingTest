package programmersLevel1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ReceiveReportResult {
    public static void main(String[] args) {
        ReceiveReportResultSolution sol = new ReceiveReportResultSolution();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] result = sol.solution(id_list,report,k);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/*
* 1. 각 유저는 한 번에 한 명의 유저를 신고 할 수 있음, 여러번에 나눠서 여러명을 신고 할 수 있지만, 한 유저에게는 여러번 신고해도 횟수가 1로 처리됨
* 2. k번 이상 신고된 유저는 게시판 이용이 정지되며, 신고한 모든 유저에게 정지 사실을 메일로 받음
* 이용자의 ID의 배열은 id_list, 각 이용자가 신고한 이용자의 ID 정보가 담긴 배열은 report, 정지 기준이 되는 신고 횟수 k
* report는 "이용자 id, 신고한 id" 형태의 문자열 배열, 둘 사이는 공백 하나로 구분되어 있음, 자기 자신은 신고 못함
* 각 유저 별로 처리 결과 메일을 받은 횟수를 배열에 담아서 return
*
* */
class ReceiveReportResultSolution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, HashSet<String>> reporterMap = new HashMap<>();
        HashMap<String, Integer> idxMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            reporterMap.put(name, new HashSet<>());
            idxMap.put(name, i);
        }
        for (String s : report) {
            String reporter = s.split(" ")[0];
            String reported = s.split(" ")[1];
            reporterMap.get(reported).add(reporter);
        }

        for (String s : id_list) {
            HashSet<String> sendToReporter = reporterMap.get(s);
            if (sendToReporter.size() >= k) {
                for (String name : sendToReporter) {
                    answer[idxMap.get(name)]++;
                }
            }
        }

        return answer;
    }
}
