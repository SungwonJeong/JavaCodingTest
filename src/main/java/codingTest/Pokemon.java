package codingTest;

import java.util.HashSet;

public class Pokemon {
    public static void main(String[] args) {
        PokemonSolution ps = new PokemonSolution();
        int[] test = {2,3,4,5,6,2,3,9,2,3};

        System.out.println("result = " + ps.solution(test));
    }
}

/*
 * 1 <= nums.length <= 10000
 * 1 <= 포켓몬의 종류 번호 <= 200000
 * 포켓몬 종류 개수의 최댓값 하나만 return
 * */
class PokemonSolution {
    public int solution(int[] nums) {
        int max = nums.length / 2;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        return Math.min(max, hashSet.size());
    }
}

