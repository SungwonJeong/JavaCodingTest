package programmersLevel1;

import java.util.Arrays;

public class DesktopCleanup {
    public static void main(String[] args) {
        DesktopCleanupSolution solution = new DesktopCleanupSolution();
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        int[] result = solution.solution(wallpaper);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/* 바탕화면은 각 칸이 정사각형인 격자판일 때 바탕화면의 상태를 나타낸 문자열 배열 wallpaper
 * 파일들은 바탕화면의 격자칸에 위치하고 바탕화면의 격자점들은 가장 왼쪽 위를 (0,0)로 시작하고, 빈칸은 ".", 파일이 있는 칸은 "#"
 * 최소한의 이동거리를 갖는 한 번의 드래그로 모든 파일을 선택해서 한 번에 지우려고 할 때,
 * 드래그는 격자점 S(lux,luy)부터 E(rdx, rdy)로 이동하고, S, E를 드래그의 시작점과 끝점
 * 이 때 드래그 한 거리는 |rex - lux| + |rdy - luy|
 * lux가 세로 luy가 가로
 * 시작점과 끝점을 담은 정수 배열을 return
 * wallpaper[i][j]는 i+1행, j+1행, 그리고 wallpaper[i][j]는 "#","."만 갖는다.
 * */
class DesktopCleanupSolution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int columnMin = wallpaper.length;
        int columnMax = 0;
        int rowMin = wallpaper[0].length();
        int rowMax = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            String row = wallpaper[i];
            for (int j = 0; j < row.length(); j++) {
                char ch = row.charAt(j);
                if (ch == '#') {
                    columnMin = Math.min(columnMin, i);
                    columnMax = Math.max(columnMax, i+1);
                    rowMin = Math.min(rowMin, j);
                    rowMax = Math.max(rowMax, j+1);
                }
            }
        }

        answer[0] = columnMin;
        answer[1] = rowMin;
        answer[2] = columnMax;
        answer[3] = rowMax;

        return answer;
    }
}
