// 큰 수 A+B 출력
public class baekjoon_7_8 {
    String str1 = "1";
    String str2 = "999";

    void solution_7_8() {
        int[] sumArr = new int[longerNum(str1, str2).length() + 1];

        str1 = stringReverse(str1);
        str2 = stringReverse(str2);
        // sumArr에 길이가 긴 문자열 대입
        if(longerNum(str1, str2).equals(str1)) for(int k=0; k<str1.length(); k++) sumArr[k] = Character.getNumericValue(str1.charAt(k));
        else for(int k=0; k<str2.length(); k++) sumArr[k] = Character.getNumericValue(str2.charAt(k));

        // sumArr에 길이가 짧은 문자열 덧셈
        for(int i=0; i<shortNum(str1, str2).length(); i++) {
            sumArr[i] = sumArr[i] + Character.getNumericValue(shortNum(str1, str2).charAt(i));
            if(sumArr[i] >= 10) {
                sumArr[i] = sumArr[i] % 10;
                sumArr[i+1]++;
            }
        }

        for(int i=shortNum(str1, str2).length(); i<longerNum(str1, str2).length(); i++) {
            if(sumArr[i] >= 10) {
                sumArr[i] = sumArr[i] % 10;
                sumArr[i+1]++;
            }
        }

        // 출력하기
        int p=sumArr.length-1;
        while(sumArr[p] == 0){
            p--;
        }
        for(int k=p; k>=0; k--) System.out.print(sumArr[k]);
    }

    static String shortNum(String str1, String str2) {
        if(str1.length() >= str2.length()) return str2;
        else return str1;
    }

    static String longerNum(String str1, String str2) {
        if(str1.length() >= str2.length()) return str1;
        else return str2;
    }

    static String stringReverse(String str){
        char[] arr = str.toCharArray();
        char[] reverseArr = new char[arr.length];
        String str2 = "";
        for(int i=0; i<arr.length; i++) {
            reverseArr[arr.length-1-i] = arr[i];
        }
        return str2.valueOf(reverseArr);
    }

}
