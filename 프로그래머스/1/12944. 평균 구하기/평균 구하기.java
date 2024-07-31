class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        double result = 0;
        
        for (int num : arr ){
            sum+=num;
        }
        
        result = (double) sum / arr.length;
        
        return result;
    }
}