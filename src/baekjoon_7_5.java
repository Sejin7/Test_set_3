// 각 테스트 데이터마다 정확히 한 행을 출력하는데, 내용은 N 번째 손님에게 배정되어야 하는 방 번호를 출력한다.
public class baekjoon_7_5 {
        int[] data = {6, 6, 6};
        int num = 1;

        void solution_7_5() {
            for(int i=0; i<num; i++) {
                int floor = data[2]%data[0];
                int roomNum = data[2]/data[0]+1;

                if(floor == 0) {
                    floor = data[0];
                    roomNum = roomNum - 1;
                }
                System.out.printf("%d%02d\n", floor, roomNum);
            }
        }
}
