package com.test.fourth;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			int num=1;
			System.out.printf("%" +(n-i)+"s","");
			for(int j=0;j<=1;j++)
			{
				System.out.printf("%4d",num);
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}

	}

}
