public class baekjoon_7_6 {
    int num = 1;
    int k = 2;
    int n = 3;

    void solution_7_6() {
        for(int i=0; i<num; i++) {
            int[][] apart = new int[k+1][n];

            // 1층 및 1호실 채우기 (1명)
            for(int a=0; a<n; a++) apart[0][a] = a+1;
            for(int b=0; b<k+1; b++) apart[b][0] = 1;

            // 나머지 호실 인원수 세기
            for(int c=1; c<k+1; c++) {
                for(int j=1; j<n; j++){
                    for(int q=0; q<=j; q++) apart[c][j] = apart[c][j] + apart[c-1][q];
                }
            }
            // 결과 출력
            System.out.println(apart[k][n-1]);
            // 각 호실 별 인원수 출력
            for(int w =k; w >= 0; w--) {
                for(int e=0; e<n; e++) System.out.printf("%d", apart[w][e]);
                System.out.println();
            }
        }
    }
}
