package programmersLevel1;

import java.util.Stack;

public class CraneCatchGame {
    public static void main(String[] args) {
        CraneCatchGameSolution sol = new CraneCatchGameSolution();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println("result = " + sol.solution(board, moves));
    }
}

/*
 * 게임판 2차원 배열 board, 크레인이 위치한 배열 moves
 * 게임판에서는 맨 위에 있는 것 부터 하나씩 꺼내고, 바구니에는 차례대로 담아짐
 * 바구니에 같은 인형이 2개 연속할 경우는 터지고 사라짐
 * 사라진 인형의 개수를 return
 * */
class CraneCatchGameSolution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] == 0) {
                    continue;
                } else {
                    if (!stack.isEmpty() && stack.peek() == board[j][move - 1]) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(board[j][move - 1]);
                    }
                }
                board[j][move - 1] = 0;
                break;
            }
        }

        return answer;
    }
}
