// 베르트랑 공준: 각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
public class baekjoon_8_5 {
    int num = 123456;

    void solution_8_5() {
        boolean[] prime = new boolean[123456*2+1];
        int count = 0;

        getPrime(prime);
        for (int i = num+1; i <= 2*num; i++) {
           if (!prime[i]) count++;
        }
        System.out.println(count);
    }

    public static void getPrime(boolean[] prime) {
        prime[0] = prime[1] = true;
        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
