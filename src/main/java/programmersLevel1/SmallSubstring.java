package programmersLevel1;

public class SmallSubstring {
    public static void main(String[] args) {
        SmallSubstringSolution solution = new SmallSubstringSolution();
        String t = "500220839878";
        String p = "7";
        System.out.println("result = " + solution.solution(t,p));
    }
}

/* 숫자로 이루어진 문자열 t, p
 * t에서 p와 길이가 같은 부분 문자열 중, 이 부분 문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return
 * t : "3141592", p : "271"-> 314, 141, 415, 159, 592 중 271보다 작거나 같은 수는 141, 159 -> return : 2
 * */
class SmallSubstringSolution {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = p.length(); i <= t.length(); i++) {
            String str = t.substring(i-p.length(),i);
            // 길이가 Integer의 범위를 넘어갈 때도 있기 때문에 Long으로 바꿈
            if (Long.parseLong(p) >= Long.parseLong(str)) {
                answer++;
            }
        }

        return answer;
    }
}
