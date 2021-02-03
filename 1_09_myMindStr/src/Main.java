import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] strings = {"sun", "bed", "car"};
		String[] strings = {"abce","abcd","cdx"};
		int n = 2;
		
		System.out.println(Arrays.toString(new Solution().solution(strings, n)));
		
	}

}


class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.charAt(n) > o2.charAt(n)) {
					return 1;
				}else if(o1.charAt(n) == o2.charAt(n)){
					return o1.compareTo(o2);
				}
				return -1;
			}
		});
        return strings;
    }
}