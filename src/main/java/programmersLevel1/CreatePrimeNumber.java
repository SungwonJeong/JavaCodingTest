package programmersLevel1;

public class CreatePrimeNumber {
    public static void main(String[] args) {
        CreatePrimeNumberSolution sol = new CreatePrimeNumberSolution();
        int[] nums = {1,2,7,6,4};
        System.out.println("result = " + sol.solution(nums));
    }
}

/*
 * 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수
 * */
class CreatePrimeNumberSolution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    answer += isPrime(sum) ? 1 : 0;
                }
            }

        }

        return answer;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
