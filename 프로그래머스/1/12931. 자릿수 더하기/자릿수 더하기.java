import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String nStr = Integer.toString(n);
        String[] nStrArr = nStr.split("");
        
        for(String i : nStrArr){
            answer += Integer.parseInt(i);
        }
        
        return answer;
    }
}