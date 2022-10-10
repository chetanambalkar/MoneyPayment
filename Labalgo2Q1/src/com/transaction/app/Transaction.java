package com.transaction.app;

public class Transaction {
	public void istargetchieveable(int Target, int[] a) {
		int sum=0;
		for(int i=0; i<a.length;i++) {
			sum=sum+a[i];
			if (sum>=Target) {
				System.out.println("Target is acheived after"+" "+(i+1)+" "+"Transaction");
				break;
			}
		}
		if(sum<Target) {
		System.out.println("Target is not achieved");
	}
}
}

