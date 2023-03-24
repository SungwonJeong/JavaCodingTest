package codingTest;

import java.util.Arrays;

public class FindKim {
    /*
    * String형 배열 seoul의 element중 "Kim"의 위치x를 찾기
    * "김서방은 x에 있다"는 String을 반환하는 함수 - x는 인덱스
    * "Kim"은 오직 한번만
    * seoul은 길이 1이상 1000이하인 배열
    * seoul의 원소는 길이 1이상 20이하인 문자열
    * "Kim"은 반드시 seoul안에 포함*/
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            String str = seoul[i];
            if(str.equals("Kim")){
                answer = "김서방은 "+i+"에 있다.";
            }
        }
        return answer;
    }

    public String solution2(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }

    public static void main(String[] args) {
        FindKim sol = new FindKim();
        String[] test = {"Jane", "Kim"};
        System.out.println(sol.solution(test));
    }
}
