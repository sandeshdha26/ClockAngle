import java.io.*;
import java.util.*;

class clockAngle {
    public static void main(String args[])
{           String S[] = read.readLine().split(" ");
            int H = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.getAngle(H,M));
}


//User function

class Solution 
{
    static int getAngle(int H , int M) 
	{
        		if(H < 0||M < 0||H > 12 ||M > 60)   /*hour cannot be more than 12, less than 0 and minute cannot be
						 more than 59, less than 0. */
            System.out.println("Wrong input!");
        if(H == 12)
            H = 0;  //set hour to 0 if user entered 12
            if(M == 60)
            {
                M = 0;
                H += 1;
                if(H > 12)
                    H = 12 - H;
            }
        int hoursAngle = (int)(0.5 * (H * 60 + M));
        int minutesAngle = (int)(6 * M);
        
        int totalAngleResult = Math.abs(hoursAngle - minutesAngle);
        totalAngleResult = Math.min(360 - totalAngleResult, totalAngleResult);
        return totalAngleResult;
    }
};