// 소수 구하기: 에라토스테네스의 체
public class baekjoon_8_4 {
    int M = 1;
    int N = 15;

    void solution_8_4() {
        boolean[] prime = new boolean[N+1];
        get_prime(prime);

        for(int i=M; i<=N; i++) {
            if(!prime[i]) System.out.println(i);
        }
    }

    public static void get_prime(boolean[] prime) {
        prime[0] = prime[1] = true;
        // 에라토스테네스의 체 알고리즘
        for(int i=2; i<=Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}
