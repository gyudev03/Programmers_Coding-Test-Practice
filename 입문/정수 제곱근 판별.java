class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = (long) (Math.sqrt(n));
        if(x*x == n){
            x += 1;
            answer = x*x;
        }
        else{
            answer = -1;
        }
        return answer;
    }
}