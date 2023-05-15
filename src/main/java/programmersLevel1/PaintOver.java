package programmersLevel1;

public class PaintOver {
    public static void main(String[] args) {
        PaintOverSolution solution = new PaintOverSolution();
        int n = 8;
        int m = 4;
        int[] section = {2,3,6};
        System.out.println("result = " + solution.solution(n,m,section));
    }
}

/* 벽을 1미터 길이의 구역 n 개로 나누고, 각 구역에 왼쪽부터 순서대로 1번부터 n번까지 번호를 붙였다
 * 벽에 페인트를 칠하는 롤러의 길이는 m 미터이고, 롤러가 벽에서 벗어나면 안되고, 구역의 일부분만 포함되도록 칠하면 안되는 규칙으로 칠한다.
 * 롤러의 좌우측 끝을 구역의 경계선이나 벽의 좌우측 끝부분에 맞춘 후 롤러를 위아래로 움직이면서 벽을 칠해야함
 * 한 구역에 페인트를 여러번 칠해도 되고 다시 칠해야 할 구역이 아닌 곳에 페인트를 칠해도 되지만 다시 칠하기로 정한 구역은 적어도 한 번 페인트 칠을 해야함.
 * 다시 페인트를 칠하기로 정한 구역들의 번호가 담긴 정수 배열 section 일때, 페인트칠해야 하는 최소 횟수를 return
 * section의 원소를 같은 원소가 두번 이상 나타나지 않으며, 오름차순
 * ex) n : 8, m : 4, section : {2,3,6} 일 때 3,4,5,6 한번 칠하고 1,2,3,4 칠하면 최소 2번
 * */
class PaintOverSolution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int max = 0;

        for (int num : section) {
            if (num < max) {
                continue;
            }
            answer += 1;
            max = num + m;
        }

        return answer;
    }
}
