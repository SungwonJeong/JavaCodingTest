package codingTest;

public class SquareInteger {
    /*
     * 임의의 양의 정수 n
     * n이 어떤 양의 정수 x의 제곱인지 아닌지
     * n이 양의 정수 x의 제곱이면 x+1의 제곱을 리턴 / 아니면 -1 리턴
     * 조건 : n은 1이상 50000000000000 이하인 양의 정수
     * n = 121 - 11의 제곱 - return (11+1)^2 = 144
     * n = 3 - 양의 정수의 제곱이 아님 - return -1
     * */

    // 효율성이 떨어진 코드 - 시간이 오래 걸림
    public long solution(long n) {
        long answer = 0;
        for (int i = 0; i < n; i++) {
            if (n == (int) (Math.pow((i), 2))) {
                answer = (int) (Math.pow((i + 1), 2));
            }
        }
        return answer == 0 ? -1 : answer;
    }

    public long solution2(long n) {
        long square = (long) (Math.sqrt(n));
        if (Math.pow(square,2) == n){
            return (long) (Math.pow(square+1,2));
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        SquareInteger si = new SquareInteger();
        System.out.println(si.solution2(4));
    }
}
