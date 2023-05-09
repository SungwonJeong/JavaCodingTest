package programmersLevel1;

public class KnightWeapon {
    public static void main(String[] args) {
        KnightWeaponSolution solution = new KnightWeaponSolution();
        int number = 5;
        int limit = 3;
        int power = 2;
        System.out.println("result = " + solution.solution(number,limit,power));
    }
}

/* 각 기사에게 1번 부터 number까지 번호가 지정
 * 각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 함
 * 단, 이웃나라와의 협약에 의해 공격력의 제한 수치보다 큰 공격력을 가진 무기를 구매해야하는 기사는 협약 기관에서 정한 공격력을 가지는 무기를 구매해야 함
 * number는 기사단원의 수, limit은 협약으로 정해진 공격력의 제한 수치, power는 제한수치를 초과한 기사가 사용할 무기의 공격력
 * 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return, 철의 무게는 공격력 1당 1kg의 철이 필요
 * */
class KnightWeaponSolution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j*j <=i ; j++) {
                if (j*j == i) {
                    cnt++;
                } else if (i%j == 0) {
                    cnt += 2;
                }
            }
            answer += cnt > limit ? power : cnt;
        }

        return answer;
    }
}
