import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers)
                .map( a -> a * 2)
                .toArray();
    }
}