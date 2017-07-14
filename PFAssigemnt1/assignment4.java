import java.util.Scanner;

public class assignment4 {
	//method for Implementation of First Come First Service Method
        int [][]FCFS( int arrival_time [], int job_size[] ) {
           

            int size=arrival_time.length;
            int jobArrivedTime[]= new int[size];
            int jobWaitTime[] = new int[size];
            int jobStartAt[] = new int[size];
            int jobFinishedAt[] = new int[size];
            int result[][]= new int[size+1][size+1];
            //arrival time is computed
            for(int i=0;i<size;i++){
                jobArrivedTime[i] =  arrival_time[i];
               
            }
            //finished time is computed
            jobFinishedAt[0]=job_size[0];
            for(int i=1;i<size;i++){
            	if(jobArrivedTime[i] > jobFinishedAt[i-1] ){
            		
            		jobFinishedAt[i] = jobArrivedTime[i] + job_size [i] - 1 ;
            	}
            	else {
            jobFinishedAt[i] = jobFinishedAt[i-1] + job_size[i] ;
            	}
            	}
            //start time is computed
            jobStartAt[0] = 1;
            for(int i=1;i<size;i++){
            	if(jobArrivedTime[i] > jobFinishedAt[i-1] ){
            		jobStartAt[i]=jobArrivedTime[i];
            	}
            	else {
                jobStartAt[i] = jobFinishedAt[i-1]  + 1;
            	}
            	}
            //wait time is computed
            jobWaitTime[0]=0;
            for(int i=1;i<size;i++){
            	if(jobArrivedTime[i] > jobFinishedAt[i-1] ){
            		jobWaitTime[i]=0;
            	}
            	else{
                jobWaitTime[i]= jobStartAt[i] - jobArrivedTime[i];
                  	}
            	}
            int k=1;
            System.out.println("job\tjobArrivedTime\tjobWaitTime\tjobStartAt\tjobFinishedAt" );
            //FCFS is created
            for(int i=0;i<size;i++){
           
                    result[i][0]=k++;
                    result[i][1]=jobArrivedTime[i];
                    result[i][2]=jobWaitTime[i];
                    result[i][3]=jobStartAt[i];
                    result[i][4]=jobFinishedAt[i];
               
                    }
            for(int i=0;i<size;i++){
                System.out.println();
                for(int j=0;j<size+1;j++){
                    System.out.print(result[i][j] + "\t\t");
                }
            }
            return result;
        }
        
   
}
