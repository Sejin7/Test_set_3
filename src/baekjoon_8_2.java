// M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
// 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
public class baekjoon_8_2 {
    int M = 60;
    int N = 100;

    void solution_8_2() {
        int[] intArr = new int[10001];

        // 소수 여부 확인 후 소수인 경우 intArr에 저장
        for(int i=M; i<=N; i++) {
            if(i == 2) {
                intArr[i] = i;
                continue;
            }
            else if(i == 1) continue;

            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    break;
                }
                else if(j == i-1) intArr[i] = i;
            }
        }

        // 소수가 저장되어 있지 않은 경우 -1 출력 및 그렇지 않은 경우 합과 최소값 출력
        int empty = 0;
        for(int i=0; i<intArr.length; i++) {
            if(intArr[i] != 0) {
                empty = 1;
                break;
            }
        }
        if(empty == 1) {
            System.out.println(findSum(intArr));
            System.out.println(findMin(intArr, N));
        }
        else System.out.println(-1);
    }

    static int findSum(int[] intArr) {
        int sum = 0;
        for(int i=0; i<intArr.length; i++) {
            sum = sum + intArr[i];
        }
        return sum;
    }

    static int findMin(int[] intArr, int N) {
        int min = N;
        for(int i=1; i<intArr.length; i++) {
            if(intArr[i] != 0 && min > intArr[i]) min = intArr[i];
        }
        return min;
    }
}
