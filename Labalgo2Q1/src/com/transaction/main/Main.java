package com.transaction.main;

import java.util.Scanner;

import com.transaction.app.Transaction;

public class Main {
		public static void main(String[] args) {
			Transaction transaction=new Transaction();
			Scanner sc=new Scanner (System.in);
			
			System.out.println("Enter the size of transaction array");
			int size=sc.nextInt();
			
			System.out.println("Enter the value of array");
			int[] a=new int[size];
			for (int i=0; i<size; i++) {
				a[i]= sc.nextInt();
	                }
			
			System.out.println("Enter the total no of targets need to be acheieve");
			int Target=sc.nextInt();
			for (int i=0;i<Target;i++) {
			System.out.println("Enter the value of target");
			int Value=sc.nextInt();
			transaction.istargetchieveable(Value, a);
			}
			
		}
			
	}

