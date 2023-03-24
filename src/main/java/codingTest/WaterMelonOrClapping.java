package codingTest;

public class WaterMelonOrClapping {
    /*
     * 길이가 n
     * "수박수박수박수..."패턴을 유지하는 문자열을 리턴
     * n = 4 수박수박
     * n = 3 수박수
     * */
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i%2==1) {
                answer = String.valueOf(sb.append("박"));
            } else {
                answer = String.valueOf(sb.append("수"));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        WaterMelonOrClapping sol = new WaterMelonOrClapping();
        System.out.println(sol.solution(2));
    }
}
