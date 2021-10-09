package com.old.maven;

public class FirstProg {
	public static void main(String[] args) {
		for (int n = 0; n < 10000; n++) {
			int a, i=0 ,j=0;
		a=n;
		while (a>0) {
			i = a%10;
			j= (i*i*i*i)+j;
			a= a/10;
			
		}
		 if (n==j) {
			 System.out.println("It is Amstron no "+j);
		 }
		}
	}
	}


 