
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phone_number = "010333344441";
		
		
		System.out.println("´ä: " + new Solution().solution(phone_number));
		
	}

}

class Solution {
    public String solution(String phone_number) {
        String star = "********************";
        return star.substring(0, phone_number.length()-4) + phone_number.substring(phone_number.length() - 4);
    }
}