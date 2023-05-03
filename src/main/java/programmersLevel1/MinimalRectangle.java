package programmersLevel1;

public class MinimalRectangle {
    public static void main(String[] args) {
        MinimalRectangleSolution sol = new MinimalRectangleSolution();
        int[][] sizes = {
                {10,7},
                {12,3},
                {8,15},
                {14,7},
                {5,15}
        };
        System.out.println("result = " + sol.solution(sizes));
    }
}

/*
 * 명함들이 모두 들어갈 가로의 최대 길이 x 세로의 최대 길이 값을 return
 * 이때 명함을 적절하게 회전시켜서 가로와 세로의 최대 길이 값
 * */
class MinimalRectangleSolution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int maxWidth = 0;
        int maxHeight = 0;
        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        answer = maxWidth * maxHeight;
        return answer;
    }
}
