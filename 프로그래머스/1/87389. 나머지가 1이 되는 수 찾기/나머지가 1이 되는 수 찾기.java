class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n-1;
        
        // (n-1)의 최소 공약수 중 1을 제외한 가장 작은 값 
        for(int i=2; i <= num; i++){
            if(num % i == 0){
                answer = i;
                break;
            }    
        }

        return answer;
    }
}