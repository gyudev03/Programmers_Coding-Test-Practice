class Solution {
    public double solution(int[] arr) {
        double a = 0;
        for(int i = 0;i<arr.length;i++){
            int j = arr[i];
            a += j;
        }
        double answer = a/arr.length;
        return answer;
    }
}