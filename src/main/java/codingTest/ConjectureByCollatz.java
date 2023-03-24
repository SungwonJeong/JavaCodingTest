package codingTest;

public class ConjectureByCollatz {
    // 주어진 수가 1이 될 때까지 작업을 반복하면, 모든 수를 1로 만들 수 있다.
    // 입련된 수가 짝수 - 2로 나눈다 / 홀수 - 3을 곱하고 1을 더한다. -> 반복 - if/ while
    // 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 // 8번
    // 총 몇번을 반복해야하는지를 반환하는 함수
    // 조건 1.  주어진 수가 1일 때는 0  2. 500번 반복할 때 까지 1이 안되면 -1

    public int solution(int num) {
        int totalTimes = 0; // 총 횟수
        long numOfItar = num;

        while (numOfItar !=1) {
            if (numOfItar % 2 == 0) {
                numOfItar /= 2;
            } else {
                numOfItar = numOfItar * 3 + 1;
            }
            totalTimes++;
        }
        if (totalTimes > 500) {
            return -1;
        }
        return totalTimes;
    }

    //삼항식 활용
    public int solution2(int num) {
        long n = (long)num;
        for(int i =0; i<500; i++){
            if(n==1) return i;
            n = (n%2==0) ? n/2 : n*3+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        ConjectureByCollatz cbc = new ConjectureByCollatz();
        int num1 = 6;       //8
        int num2 = 16;      //4
        int num3 = 626331;  //-1
        int num4 = 21;
        System.out.println(cbc.solution(num2));
    }
}
