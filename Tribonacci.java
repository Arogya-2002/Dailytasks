package Leetcode;

public class Tribonacci {
	public static void main(String[] args) {
		int n=25;
		System.out.println(tribonacci(n));
	}
	public static int tribonacci(int n) {
		int first=0,second=1,third=1;
		if(n==0) return first;
        if(n==1) return second;
        if(n==2) return third;
        int sum=0;
        for(int i=2;i<n;i++){
            sum=first+second+third;
            first=second;
            second=third;
            third=sum;
        }
        return sum;
	}
}
