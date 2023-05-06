package programmersLevel1;

import java.util.Stack;

public class MakingHamburger {
    public static void main(String[] args) {
        MakingHamburgerSolution solution = new MakingHamburgerSolution();
        int[] ingredient = {1,1,1,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1};
        System.out.println("result = " + solution.solution(ingredient));
    }
}

/* 빵은 1 야채는 2 고기는 3의 원소 값을 갖고 있을 때 빵, 야채, 고기, 빵 순서일 때만 포장을 함
 * 포장하는 햄버거의 개수를 return
 * */
class MakingHamburgerSolution {
    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i : ingredient) {
            stack.push(i);
            if(stack.size() >= 4) {
                if(stack.get(stack.size() - 1)==1 && stack.get(stack.size() - 2)==3 && stack.get(stack.size() - 3)==2 && stack.get(stack.size() - 4)==1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return answer;
    }
}
