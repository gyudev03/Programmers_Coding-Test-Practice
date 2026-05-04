import java.util.HashMap;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String p : phone_book) map.put(p, 0);
        
        for(int i = 0; i<phone_book.length; i++){
            for(int j = 0; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0, j))) answer = false;
            }
        }
        return answer;
    }
}