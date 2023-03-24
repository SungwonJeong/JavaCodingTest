package codingTest;

public class DateTest {
    //2016년 1월 1일은 금요일 - a월 b일은 무슨 요일?
    //요일 이름 = SUN, MON, TUE, WED, THU, FRI, SAT
    //ex. a=5, b=24 화요일 - TUE나오게
    //31일 되고 다음 2월 1일 되면 그대로 이어져야함. 2월1일 = 1월 32일 - b+=1 (b = 31*a) -> b=1

    //Calcu
    public String solution(int a, int b) {
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int allDay = 0;
        for (int day = 0; day < a - 1; day++) { // a만 하면 5월일 경우 5월 31일가지 나옴 - 4월 30일까지 나오게 하고 나머지 일수를 더해야함
            allDay += month[day]; // 5월 24일을 구하고 싶다 - 4월 31일까지 더한 값
        }
        allDay += b - 1; // 나머지 24일을 더한 값 - b-1은 1월 1일도 포함하기 위해
        return week[allDay % 7];

    }

    public static void main(String[] args) {
        DateTest sol = new DateTest();
        System.out.println(sol.solution(3,5));
    }

}
