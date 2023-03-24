package codingTest;

public class HashadNumber {
    //하샤드 수 : 양의 정수 x의 자릿수의 합으로 x가 나눠져야함
    //x가 하샤드 수인지 아닌지 return
    //18 - 1+8=9 - 18%9 ==0
    public boolean solution(int x) {
        boolean answer = true;
        if (!checkHashad(x)) {
            return false;
        }
        return answer;
    }

    private boolean checkHashad(int num) {
        String number = String.valueOf(num);
        String[] eachOfNumber = number.split("");
        int sum = 0;

        for (int i = 0; i < eachOfNumber.length; i++) {
            sum += Integer.parseInt(eachOfNumber[i]);
        }

        if (num % sum != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        HashadNumber hn = new HashadNumber();
        int arr1 = 10;
        int arr2 = 12;
        int arr3 = 11;
        int arr4 = 13;
        System.out.println(hn.solution(arr4));
    }
}
