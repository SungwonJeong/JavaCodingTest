package programmersLevel1;

public class CaesarCipher {
    public static void main(String[] args) {
        CaesarCipherSolution sol = new CaesarCipherSolution();
        String test = "a B z";
        System.out.println("result = " + sol.solution(test, 4));
    }
}

/*
 * 시저 암호 : 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
 * 공백은 아무리 밀어도 공백
 * */
class CaesarCipherSolution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            answer += ch;
        }

        return answer;
    }
}
