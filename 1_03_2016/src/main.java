import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
		
		System.out.println(new Solution().solution(5, 24));
		
	}

}


class Solution {
    public String solution(int a, int b) {
        
        String date = "2016-"+a+"-"+b;
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        Calendar cal = Calendar.getInstance();
        try {
			cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return day[cal.get(Calendar.DAY_OF_WEEK) -1];
    }
}