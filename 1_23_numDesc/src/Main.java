import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n = 118372;
		
		System.out.println("°á°ú°ª: " + new Solution().solution(n));
		
	}

}

class Solution {
    public long solution(long n) {
        return Long.parseLong(Arrays.stream(String.valueOf(n).split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
    }
}