package programmersLevel1;

public class FindPrimeNumber {
    public static void main(String[] args) {
        FindPrimeNumberSolution sol = new FindPrimeNumberSolution();
        int test = 30;
        System.out.println("test = " + sol.solution(test));
    }
}

/*
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수 반환하기
 * 에라토스테네스의 체 사용
 * */
class FindPrimeNumberSolution {
    public int solution(int n) {
        int answer = 0;
        int[] numbers = new int[n + 1];
        for (int i = 2; i <= n; i++) numbers[i] = i;

        for (int i = 2; i < n; i++) {
            if (numbers[i] == 0) continue;
            for (int j = 2 * i; j <= n; j += i) numbers[j] = 0;
        }

        for (int number : numbers) {
            if (number != 0) answer++;
        }

        return answer;
    }
}
