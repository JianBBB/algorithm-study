class Solution {
    public int[] solution(long n) {

        int numStrLength = Long.toString(n).length();
        int[] answer = new int[numStrLength];        
        
        for(int i=0; i < numStrLength; i++ ){
            answer[i] = (int) (n % 10);
            n/=10;
        }
        
        return answer;
    }
}