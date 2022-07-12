// N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
public class baekjoon_8_3 {
    int num = 72;
    void solution_8_3() {
        if(num != 1) {
            int div = 1;
            int N = num;
            // 나눌 수 있는 수를 찾아 하나씩 출력
            while(N != 1) {
                for(int i=2; i<=N; i++){
                    if(N%i == 0) {
                        div = i;
                        break;
                    }
                }
                N = N/div;
                System.out.println(div);
            }
        }
    }
}
