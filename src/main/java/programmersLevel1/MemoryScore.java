package programmersLevel1;

import java.util.Arrays;
import java.util.HashMap;

public class MemoryScore {
    public static void main(String[] args) {
        MemoryScoreSolution solution = new MemoryScoreSolution();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] result = solution.solution(name,yearning,photo);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/* 그리워하는 사람의 이름을 담은 문자열 배열 name
 * 각 사람별 그리움 점수를 담은 정수 배열 yearning
 * 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo
 * 사진들의 추억 점수를 photo에 주어진 순서대로 배열에 담아 return
 * */
class MemoryScoreSolution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    sum += map.get(photo[i][j]);
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
}
