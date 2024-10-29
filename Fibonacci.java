package Leetcode;

public class Fibonacci {
	public static void main(String[] args) {
		int n=4;
		System.out.println(fibonacci(n));
	}
public static int fibonacci(int n) {
	int first=0;
	int second=1;
	if(n==2) return first+second;
	int sum=0;
	for(int i=1;i<n;i++){
        sum=first+second;
        first=second;
        second=sum;
    }
	return sum;
}
}
