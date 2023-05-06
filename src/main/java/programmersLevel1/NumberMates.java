package programmersLevel1;

public class NumberMates {
    public static void main(String[] args) {
        NumberMatesSolution sol = new NumberMatesSolution();
        String X = "100";
        String Y = "2345";
        System.out.println("result = " + sol.solution(X,Y));
    }
}

/* 두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k들을 이용해 만들 수 있는 가장 큰 정수를 return-
 * 짝꿍이 존재하지 않으면 -1 return, 짝꿍이 0으로만 구성되어 있으면 0 return
 * */
class NumberMatesSolution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for (String x : X.split("")) {
            xCount[Integer.parseInt(x)]++;
        }
        for (String y : Y.split("")) {
            yCount[Integer.parseInt(y)]++;
        }

        for (int i = 9; i >= 0; i--) {
            while (xCount[i] > 0 && yCount[i] > 0) {
                sb.append(i);
                xCount[i]--;
                yCount[i]--;
            }
        }
        if ("".equals(sb.toString())) {
            return "-1";
        }
        if ("0".equals(sb.toString().substring(0, 1))) {
            return "0";
        }

        answer = sb.toString();
        return answer;
    }
}
