package codingTest;

public class test09 {
    public static void main(String[] args) {
        test09 sol = new test09();
        String str = "4422";
        System.out.println(str.length());

        System.out.println(sol.solution(str));
    }
    //핸드폰 번호 가리기
    //1. 전화번호가 문자열 phone_number로 주어짐
    //2. 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴
    //3. phone_number의 길이는 4이상 20이하인 문자열
    //for *계속 더해주기 if 길이가 5이상일때 else 길이가 4일때
    public String solution(String phone_number) {
        int number = phone_number.length() - 4;
        StringBuilder sb = new StringBuilder(phone_number);

        for(int i =0;i<number;i++){
            sb.setCharAt(i,'*');
        }
        return sb.toString();

        //        answer = String.valueOf(sb.replace(0,number,"*"));

//        answer = phone_number.replace(phone_number.substring(0,number),"*");
//        for (int i =0; i<number;i++){
//            if()
//        }

    }
}
