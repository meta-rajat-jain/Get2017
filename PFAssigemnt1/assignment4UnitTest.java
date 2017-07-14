import org.junit.*;
import static org.junit.Assert.*;

public class assignment4UnitTest {
	boolean isArrayEqual(int expected[][],int output[][]) {
		int flag=0;
		for(int i=0;i<expected.length;i++) {
			for(int j=0;j<expected[i].length;j++) {
				if(expected[i][j]!=output[i][j]) {
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			return true;
		}else {
			return false;
		}
	}
	@Test
	public void whenFCFSIsScheduledCorrectly() {
		assignment4 unitTest=new assignment4();
		int []arrival_time= {1, 5, 9, 25};
		int []job_size= {12,7,2,5};
		int output[][]=new int[arrival_time.length][5];
		output=unitTest.FCFS(arrival_time, job_size);
		int expected[][]={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		assertEquals(true, isArrayEqual(expected,output));
		
	}
	
	@Test
	public void whenFCFSIsScheduledInorrectly() {
		assignment4 unitTest=new assignment4();
		int []arrival_time= {1, 5, 9, 25};
		int []job_size= {12,7,2,5};
		int output[][]=new int[arrival_time.length][5];
		output=unitTest.FCFS(arrival_time, job_size);
		int expected[][]={{1,0,1,13},{5,8,13,18},{9,11,20,24},{25,0,25,28}};
		assertEquals(true, isArrayEqual(expected,output));
		
	}
	
	
}