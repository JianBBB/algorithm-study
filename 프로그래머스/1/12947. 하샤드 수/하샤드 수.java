class Solution {
    public boolean solution(int x) {
        String str = Integer.toString(x);
        String[] strArr = str.split("");
        int sum = 0;
        
        for(String strNum : strArr){
            sum += Integer.parseInt(strNum);
        }
        
        return (x % sum == 0) ? true : false;
    }
}