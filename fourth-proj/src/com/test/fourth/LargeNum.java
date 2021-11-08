package com.test.fourth;
import java.util.*;
public class LargeNum {
static void printSecondLargest(int arr[],int arr_size)
{
	int i;
	if(arr_size<2)
	{
		System.out.println("INVALID");
		return;
	}
	Arrays.sort(arr);
	for(i= arr_size-2;i>=0;i--)
	{
		if(arr[i]!=arr[arr_size-1])
		{
			System.out.println("The Second Largest element is\n"+arr[i]);
			return ;
		
		}
	}
	System.out.println("There is no Second Largest element\n");
}
	public static void main(String[] args) {
		
int arr[] = {2,3,10,5,8,12};
int n =arr.length;
printSecondLargest(arr,n);
	}

}
