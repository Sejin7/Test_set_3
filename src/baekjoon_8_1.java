// 주어진 수들 중 소수의 개수를 출력한다.
public class baekjoon_8_1 {
    int num = 4;
    int[] intArr = {1, 3, 5, 7};
    void solution_8_1() {
        int count = 0;

        for(int i=0; i<num; i++) {
            if(intArr[i] == 2) {
                count++;
                continue;
            }
            else if(intArr[i] == 1) continue;

            for(int j=2; j<intArr[i]; j++) {
                if(intArr[i]%j == 0) {
                    count--;
                    break;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
