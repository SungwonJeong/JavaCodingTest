package codingTest;

public class AddDigits {
    /*
     * 자연수 N의 각 자릿수의 합을 수해서 return
     * N = 123 - 1+2+3 = 6
     * 숫자를 문자열로 -> 각각 자르고 -> Integer로 바꾸고 더하기?
     * */
    public int solution(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.substring(i,i+1));
        }
        return sum;
    }

    public static void main(String[] args) {
        AddDigits ad = new AddDigits();
        System.out.println(ad.solution(5444));
    }
}

