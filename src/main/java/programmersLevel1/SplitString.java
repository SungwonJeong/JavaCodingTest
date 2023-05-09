package programmersLevel1;

public class SplitString {
    public static void main(String[] args) {
        SplitStringSolution solution = new SplitStringSolution();
        String s = "aaabbaccccabba";
        System.out.println("result = " + solution.solution(s));
    }
}

/* 문자열 s가 주어졌을 때 먼저 첫 글자를 읽는다. 이글자를 x라고 한다.
 * 왼쪽에서 오른쪽으로 읽어가면서 x와 x가 아닌 글자들이 나온 횟수를 각각 센다. 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리한다.
 * s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복. 남은 부분이 없으면 종료
 * 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료한다.
 * banana : ba, na, na // abracadabra : ab, ra, ca, da, br, a // aaabbaccccabba : aaabbacc, ccab, ba
 * */
class SplitStringSolution {
    public int solution(String s) {
        int answer = 0;

        char firstChar = s.charAt(0);
        int sameCnt = 0;
        int notSameCnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (sameCnt == notSameCnt) {
                answer++;
                firstChar = s.charAt(i);
            }

            if (firstChar == s.charAt(i)) {
                sameCnt++;
            } else {
                notSameCnt++;
            }
        }

        return answer;
    }
}
