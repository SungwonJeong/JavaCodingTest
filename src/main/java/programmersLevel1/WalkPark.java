package programmersLevel1;

import java.util.Arrays;

public class WalkPark {
    public static void main(String[] args) {
        WalkParkSolution solution = new WalkParkSolution();
        String[] park = {"SOO","OXX","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        int[] result = solution.solution(park,routes);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/* 지나다니는 길 'O', 장애물 'X' 로 나타낸 직사각형 격자 모양의 공원
 * 로봇 강아지에게 ["방향 거리", "방향 거리" … ]로 명령을 내린다
 * ex) "E 5"는 현재 위치에서 동쪽으로 5칸 이동
 * 명령을 수행하기 전에 주어진 방향으로 이동할 때 공원을 벗어나는지 확인하고, 이동 중 장애물을 만나는지 아닌지 확인한다.
 * 위 조건 중 하나라도 해당하면 해당 명령을 무시하고 다음 명령을 수행한다.
 * 가로 길이가 W, 세로길이가 H일 때, 좌표는 (0,0)부터 (H-1, W-1)이다
 * 공원을 나타내는 문자열 배열 park, 명령이 담긴 문자열 배열 routes일 때, 모든 명령을 수행 후 놓인 위치를 [세로 방향 좌표, 가로 방향 좌표] 순으로 배열에 담아 return
 * park[i]는 S:시작지점,O:이동가능한 통로,X: 장애물의 문자로만 이루어져 있음
 * */
class WalkParkSolution {
    public int[] solution(String[] park, String[] routes) {
        int startRow = 0;
        int startCol = 0;
        char[][] arr = new char[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            arr[i] = park[i].toCharArray();
            if (park[i].contains("S")) {
                startCol = i;
                startRow = park[i].indexOf("S");
            }
        }

        String[] direction = new String[routes.length];
        String[] distance = new String[routes.length];
        for (int i = 0; i < routes.length; i++) {
            direction[i] = routes[i].split(" ")[0];
            distance[i] = routes[i].split(" ")[1];
            int columnDist = startCol;
            int rowDist = startRow;
            for (int j = 0; j < Integer.parseInt(distance[i]); j++) {
                if (direction[i].equals("E")) {
                    rowDist++;
                } else if (direction[i].equals("W")) {
                    rowDist--;
                } else if (direction[i].equals("S")) {
                    columnDist++;
                } else if (direction[i].equals("N")) {
                    columnDist--;
                }

                if (rowDist >= 0 && columnDist >= 0 && columnDist < arr.length && rowDist < arr[0].length) {
                    if (arr[columnDist][rowDist] == 'X') {
                        break;
                    }
                    if (j == Integer.parseInt(distance[i])-1) {
                        startCol = columnDist;
                        startRow = rowDist;
                    }
                }
            }
        }
        return new int[] {startCol, startRow};
    }
}
