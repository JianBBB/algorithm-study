class Solution {
    public int[] solution(int[] numbers) {
        
        int[] result = new int[numbers.length];
        int index = 0;
        
        for(int num : numbers){
            result[index] = num*2;
            index++;
        }
        
        
        return result;
    }
}