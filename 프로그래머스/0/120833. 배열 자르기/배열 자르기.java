class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int length = num2-num1+1;
        int[] answer = new int[length];
        
        
        for(int i = num1, j=0; i <= num2; i++,j++){
            answer[j] = numbers[i];    
        }
        
        return answer;
    }
}