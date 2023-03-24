package codingTest;

public class test01 {
    public static void main(String[] args) {
        System.out.println("시작!");
        while (true) {
            int dice = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int sum = dice + dice2;
            System.out.println("(" + dice + ", " + dice2 + ")");
            if (sum == 5) {
                break;
            }
        }
        System.out.println("끝!");
    }
}

//새로운 풀이법
//        import java.util.Scanner;
//        import java.util.stream.IntStream;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        StringBuilder sb = new StringBuilder();
//        IntStream.range(0, a).forEach(s -> sb.append("*"));
//        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
//    }
//}
