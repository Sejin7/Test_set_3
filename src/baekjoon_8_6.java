// 골드바흐의 추측: 각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
public class baekjoon_8_6 {
    int num = 1;
    int n = 10000;
    void solution_8_6() {
        boolean[] prime = new boolean[10001];
        getPrime(prime);

        // 골드바흐 파티션에 해당하는 정수 찾기
        for(int i=0; i<num; i++) {
            int partition1 = 0;
            int partition2 = 0;

            // 받은 값의 절반에서 -1씩 빼가며 파티션(소수)여부 확인
            for(int j=n/2; j>1; j--) {
                if(!prime[j]) {
                    if(!prime[n-j]) {
                        partition1 = j;
                        partition2 = n-j;
                        break;
                    }
                }
            }
            // 찾은 파이션 정수를 출력
            System.out.printf("%d %d\n", partition1, partition2);
        }
    }

    public static void getPrime(boolean[] prime) {
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
