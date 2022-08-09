import java.util.*;

public class caesarCipher {
    public static void main(String[] args) {
        String str = "khoor zruog";
        int secret = 3;
        System.out.println(decryptCaesarCipher(str, secret));
    }

    public static String decryptCaesarCipher(String str, int secret) {
    /*
    아스키코드사용
    1. 문자열에서 charAt검색
    2. askicode에 해당하는 숫자로 변환
    3. 해당 숫자-secret한 문자 반환
    3. 문자를 문자열로 변환
    */

        String result = "";
        for(int i=0 ; i< str.length() ; i++) {
            // 빈칸은 어차피 아스키코드 10진법상 64이므로, 96~123 사이의 숫자가 아니라서 cha에 그대로 할당되어 result에 그대로 추가됨
            // if(str.charAt(i)==' ') {
            //   result += str.charAt(i);
            // }
            char cha = str.charAt(i);
            if(cha>96 && cha<123) {
                cha -= secret;
                if(cha < 97) {
                    cha +=26;
                }
            }
            result += cha;
        }
        return result;
    }
}
