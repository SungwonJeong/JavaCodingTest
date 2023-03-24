package codingTest;

public class StringByBasic {
    /*
     * 1.문자열 길이가 4 or 6
     * 2.숫자로만 구성돼있는지 확인
     * "a234" false "1234" true
     * */
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StringByBasic sol = new StringByBasic();
        System.out.println(sol.solution("1234"));
    }
}
