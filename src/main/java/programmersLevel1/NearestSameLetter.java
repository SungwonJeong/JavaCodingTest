package programmersLevel1;

import java.util.Arrays;

public class NearestSameLetter {
    public static void main(String[] args) {
        NearestSameLetterSolution solution = new NearestSameLetterSolution();
        String s = "aabbaacc";
        int[] result = solution.solution(s);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/* 문자열 s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어딨는지 알고 싶음
 * ex) "banana"
 * b는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없음, 이는 -1
 * a는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없음, 이는 -1
 * n은 처음 나왔기 때문에 자신의 앞에 같은 글자가 없음, 이는 -1
 * a는 자신보다 두칸 앞에 a가 있기 때문에, 2
 * n도 자신보다 두칸 앞에 n이 있기 때문에, 2
 * 마지막 a는 자신보다 두칸, 네칸 앞에 a가 있는데, 이 중 가까운 것은 두칸 앞이고, 2
 * 따라서 이 보든 결과값을 배열로 return
 * */
class NearestSameLetterSolution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        String[] splitS = s.split("");
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(0,i);
            if (str.contains(String.valueOf(s.charAt(i)))) {
                for (int j = i; j >= 0; j--) {
                    if (String.valueOf(s.charAt(i)).equals(splitS[j]) && answer[i] == 0) {
                        answer[i] = i-j;
                    }
                }
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}
