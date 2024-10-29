package Leetcode;

public class ClimbingStairs {
public static void main(String[] args) {
	int size=4;
	System.out.println(climbstairs(size));
}
public static int climbstairs(int n) {
//	//using recursion
//	if(n==0) return 1;
//	else if(n<0) return 0;
//	else {
//		return climbstairs(n-2)+climbstairs(n-1);
//	}
	
	//using dp
	
	int[] step=new int[n+1];
	step[0]=1;
	step[1]=1;
	for(int i=2;i<=n;i++) {
		step[i]=step[i-1]+step[i-2];
	}
	return step[n];
	
}
}
