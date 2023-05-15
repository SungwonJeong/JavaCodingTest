package programmersLevel1;

import java.util.HashMap;
import java.util.Map;

public class RunningRace {
    public static void main(String[] args) {

    }
}

/* 해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부른다.
 * 선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players, 해설진이 부른 이름을 담은 문자열 배열 callings
 * 경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return
 * */
class RunningRaceSolution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i],i);
        }

        for (String calling : callings) {
            int rank = map.get(calling);

            String before = players[rank - 1];
            players[rank - 1] = calling;
            players[rank] = before;

            map.put(calling, rank-1);
            map.put(before, rank);
        }

        return players;
    }
}
