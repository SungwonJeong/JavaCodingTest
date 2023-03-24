package codingTest;

public class CountByString {
    /*대문자, 소문자 섞여있는 문자열 s
    * s에 p의 개수, y의 개수를 비쇼해 같으면 true 다르면 false
    * 1. 대문자 -> 소문자바꾸기 = .toLowerCase()
    * 2. p,y가 모두 없는 경우 true - if(문자열.indexOf("찾는문자열") == -1) - 찾는 문자열 없는경우
    * */
    boolean solution(String s) {
        boolean answer = true;
        String strings = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < strings.length(); i++) {
             if(strings.charAt(i) == 'p') {
                 pCount++;
             }
             if (strings.charAt(i) == 'y') {
                 yCount++;
             }
            
        }
        if(pCount == yCount) {
            return answer;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        CountByString sol = new CountByString();
        String test = "pPoooyY";
        System.out.println(sol.solution(test));
    }
}
