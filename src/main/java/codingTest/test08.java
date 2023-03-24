package codingTest;

public class test08 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[] {1,2,3,4,5,6,11,25,24,56,23};
        test08 sol = new test08();

        System.out.println(sol.solution(arr));
    }

    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        answer = (double) sum / len;
        return answer;
    }
}
