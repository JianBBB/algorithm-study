class Solution {
    public long solution(int a, int b) {
        if(a == b){ return a; }
        
        long min = a; long max = b;
        if(a > b){ min=b; max=a; }
        long sum = 0;
        
        for(long i = min; i <= max; i++){
            sum += i;
        }
        
        return sum;
    }
}