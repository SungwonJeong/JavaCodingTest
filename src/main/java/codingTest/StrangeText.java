package codingTest;

public class StrangeText {
    /*
     * 문자열 s는 한 개 이상의 단어
     * 각 단어는 하나 이상의 공백문자로 구분
     * 각 단어의 짝수번째 알파벳은 대문자
     * 홀부선째 알파멧은 소문자로 바꾼 문자열을 return
     * 단어(공백을 기준)별로 짝/홀수 인덱스를 판단
     * 첫번째는 짝수번째 알파벳
     * */
    public String solution(String s) {
        String answer = "";

        int index = 0;
        String[] str = s.split("");

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")){
                index = 0;
            } else if (index%2==0) {
                str[i] = str[i].toUpperCase();
                index++;
            } else {
                str[i] = str[i].toLowerCase();
                index++;
            }
            answer += str[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        StrangeText st = new StrangeText();
        String test = "STEIFJ AWEJF AWEJFAWIOEF";

        System.out.println(st.solution(test));
    }
}
