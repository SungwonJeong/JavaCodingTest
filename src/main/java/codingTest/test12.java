package codingTest;

public class test12 {
    public static void main(String[] args) {
        test12 sol = new test12();
        System.out.println(sol.solution(1, 0, 0));
    }

    //부족한 금액 계산하기
    //1. 놀이기구의 처음 이용료 : price : 1<= price <= 2500, 자연수
    //2. 이후 n번째 이용료 : price*n
    //3. 이용횟수 count : 1<= count <=2500, 자연수
    //4. 처음 가지고 있던 금액 money: 1<= money <=1,000,000,000 자연수
    //count번 타면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지?
    ///-> money , for(price*n) -> for(price*n)-money 둘중 누가더 큰지 비교
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;  // int로하면 결과 달라짐.
        for (int i = 1; i <= count; i++) {
            sum += (price * i);
        }
//        answer = (money > sum) ? (money - sum) : (sum - money);
        if (sum > money) {
            answer = sum-money;
        } else {
            return 0;
        }
        return answer;
    }

}
