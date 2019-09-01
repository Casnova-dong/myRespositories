package demo;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		float d1=4231414f;
		float d2=d1+1;
		System.out.println(d1);
		System.out.println(d2);
		if (d1==d2) {
			System.out.println("d1==d2");
		}else {
			System.out.println("d1!=d2");
		}
		System.out.println(true);
		char c2='y';
		switch (c2) {
		case 'y':
		case 'w':
			System.out.println("banyuanyin");
			break;
		default:
			System.out.println("fuyin");;
		}
		
		int[] arr={11,2,3,1,77,22};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"   ");
		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j =0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"   ");
		}
		}
	}
