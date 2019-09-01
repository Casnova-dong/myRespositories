package com.qidong.thread;

import java.lang.reflect.Method;

public class Teat {
	public static void main(String[] args) {
		int  i=1;
		int  j=i++;
		System.out.println(j);
		//System.out.println(j>++j);
		if((j>++j)&&(i++==j)){
			j+=i;
			System.out.println(j);
		}
				 System.out.println(j+"last");
				 Method();				 
	}
	public static void Method(){
		int i=9;
		switch (i) {
		default:
		System.out.println("default");
		case 0:
		System.out.println("zero");
		break;
		case 1:
		System.out.println("one");
		break;
		case 2:
		System.out.println("two");
		break;
		}
	}
}
