import java.util.Stack;

public class main {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(new Solution().solution(board, moves));
	
	}
	
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        // ���� for�� ������ �ϸ�  �����ɸ��� ������
        
        int n = board.length;
        int[] depth = new int[n];
        
        // ���� ���� ���
        for(int i = 0 ; i < n ; i++) {
        	for(int j = 0 ; j < n ; j++) {
        		if(board[j][i] != 0) {
        			depth[i] = j;
        			break;
        		}
        	}
        }
        
        // ����� ����
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = 0 ; i < moves.length ; i++) {
        	
        	int x = moves[i]-1;
        	int y = depth[x];
        	
        	if(y < n && board[y][x] != 0) {
        		
        		if(!stack.isEmpty() && stack.peek() == board[y][x]) {
        			stack.pop();
        			answer++;
        		}else {
        			stack.push(board[y][x]);
        		}
        		depth[x]++;
        	}
        }
        
        return answer*2;
    }
}