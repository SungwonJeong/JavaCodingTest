package programmersLevel1;

import java.util.ArrayList;

public class CardDeck {
    public static void main(String[] args) {
        CardDeckSolution solution = new CardDeckSolution();
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"to","want"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println("result = " + solution.solution(cards1,cards2,goal));
    }
}

/* 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용한다.
 * 한 번 사용한 카드는 다시 사용할 수 없다.
 * 카드를 사용하지 않고 다음 카드로 넘어갈 수 없다.
 * 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없다.
 * cards1과 cards2에 적힌 단어들로 원하는 단어 배열 goal를 만들 수 있다면 "Yes", 아니면 "No"를 return
 * */
class CardDeckSolution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        ArrayList<String> goalCard1 = new ArrayList<>();
        ArrayList<String> goalCard2 = new ArrayList<>();
        for (int i = 0; i < goal.length; i++) {
            for (int j = 0; j < cards1.length; j++) {
                if (goal[i].equals(cards1[j])) {
                    goalCard1.add(goal[i]);
                }
            }
        }
        for (int i = 0; i < goal.length; i++) {
            for (int j = 0; j < cards2.length; j++) {
                if (goal[i].equals(cards2[j])) {
                    goalCard2.add(goal[i]);
                }
            }
        }

        ArrayList<Boolean> isAvailable1 = new ArrayList<>();
        ArrayList<Boolean> isAvailable2 = new ArrayList<>();

        //goal의 길이가 cards1 + cards2 의 길이보다 작을 수도 있기 때문에 반복 횟수를 goalCard로 설정
        for (int i = 0; i < goalCard1.size(); i++) {
            if (goalCard1.get(i).equals(cards1[i])) {
                isAvailable1.add(true);
            } else {
                isAvailable1.add(false);
            }
        }
        for (int i = 0; i < goalCard2.size(); i++) {
            if (goalCard2.get(i).equals(cards2[i])) {
                isAvailable2.add(true);
            } else {
                isAvailable2.add(false);
            }
        }

        if (!isAvailable1.contains(false) && !isAvailable2.contains(false)) {
            answer = "Yes";
        } else {
            answer = "No";
        }

        return answer;
    }


    // 다른 풀이
    public String solution2(String[] cards1, String[] cards2, String[] goal) {
        int cardIdx1 = 0;
        int cardIdx2 = 0;

        for(int i=0; i<goal.length; i++){
            String target = goal[i];

            if(cardIdx1 < cards1.length && target.equals(cards1[cardIdx1]))
                cardIdx1 ++;
            else if (cardIdx2 < cards2.length && target.equals(cards2[cardIdx2]))
                cardIdx2++;
            else
                return "No";
        }

        return "Yes";
    }
}
