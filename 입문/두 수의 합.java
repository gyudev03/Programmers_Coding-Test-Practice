import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger C = A.add(B);
        answer = C.toString();
        return answer;
    }
}