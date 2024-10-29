package Leetcode;


public class MinCostClimbingStairs {
	public static void main(String args[])
	{
	   // int a[] = {1,100,1,1,1,100,1,1,100,1 };
		int a[]= {10,15,20};
	    int n = a.length;
	    System.out.print(minimumCost(a, n));
	}
	static int minimumCost(int cost[], int n)
	{
	    int dp1 = 0, dp2 = 0;
	 
	    // traverse till N-th stair
	    for (int i = 0; i < n; i++) 
	    {
	        int dp0 = cost[i] +  Math.min(dp1, dp2);
	 
	        // update the last 
	        // two stairs value
	        dp2 = dp1;
	        dp1 = dp0;
	    }
	    return Math.min(dp1, dp2);
	}
		}
