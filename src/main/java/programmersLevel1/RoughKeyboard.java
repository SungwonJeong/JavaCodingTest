package programmersLevel1;

import java.util.Arrays;
import java.util.HashMap;

public class RoughKeyboard {
    public static void main(String[] args) {
        RoughKeyboardSolution solution = new RoughKeyboardSolution();
        String[] keymap = {"AGZ", "BSSS"};
        String[] targets = {"ASA","BGZ"};
        int[] result = solution.solution(keymap,targets);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/* 휴대폰의 자판은 하나의 키에 여러 개의 문자가 할당 될 수 있음
 * 휴대폰 자판은 키의 개수가 1개부터 최대 100개까지 있을 수 있음
 * 특정 키를 눌렀을 때 입력되는 문자들도 무작위로 배열
 * 같은 문자가 자판 전체에 여러 번 할당 된 경우도 있으며, 키 하나에 같은 문자가 여러번 할당된 경우도 있음, 아예 할당되지 않은 경우도 있음
 * 1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열 배열 keymap, 입력하려는 문자열들이 담긴 문자열 배열 targets
 * 각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야하는지 순서대로 배열로 return, 단 목표 문자열을 작성할 수 없을 때는 -1을 저장
 * 1 <= keymap, keymap의 원소의 길이 <= 100, keymap[i]는 i+1번 키를 눌렀을 때 순서대로 바뀌는 문자, 즉 1부터 시작
 * */
class RoughKeyboardSolution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                int min = Math.min(i+1, map.getOrDefault(ch,i+1));
                map.put(ch, min);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int cnt = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                if (map.containsKey(targets[i].charAt(j))) {
                    cnt += map.get(targets[i].charAt(j));
                } else {
                    cnt = -1;
                    break;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}
