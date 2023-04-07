package programmersLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockExam {
    public static void main(String[] args) {
        MockExamSolution sol = new MockExamSolution();
        int[] answers = {1,2,3,4,5};
        int[] result = sol.solution(answers);
        System.out.println("result = " + Arrays.toString(result));
    }
}

/*
* 배열 answers는 정답의 순서 배열
* 수포자들이 찍어서 가장 많이 맞춘 사람이 누구인지 return
* */
class MockExamSolution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] score = {0,0,0};

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == first[i%5]) {
                score[0]++;
            }
            if(answers[i] == second[i%8]) {
                score[1]++;
            }
            if(answers[i] == third[i%10]) {
                score[2]++;
            }
        }

        // 최대 점수
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        // 가장 많이 맞춘 수포자들
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) {
                arrList.add(i+1);
            }
        }

        answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}
