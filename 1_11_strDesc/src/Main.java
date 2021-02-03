import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String s = "daZbcdefg";
		
		System.out.println(new Solution().solution(s));
	}
}


class Solution {
    public String solution(String s) {
    	String result = "";
    	char[] temp = s.toCharArray();
    	Arrays.sort(temp);
    	for(int i = temp.length-1 ; i>=0 ; i--) result+= temp[i];
        return result;
    }
}

