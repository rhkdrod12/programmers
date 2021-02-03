
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String skill = "CBDK";
		String[] skill_trees = {"CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"};
		
		System.out.println("´ä: " + new Solution().solution(skill, skill_trees));
		
	}

}


class Solution {
	
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i = 0 ; i < skill_trees.length ; i++) {
        	if(skill.indexOf(skill_trees[i].replaceAll("[^" + skill+"]", "")) == 0) {
        		answer++;
        	}
        }
        return answer;
    }
}