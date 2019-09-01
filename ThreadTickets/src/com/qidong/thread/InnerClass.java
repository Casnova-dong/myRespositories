package com.qidong.thread;



public class InnerClass {
	public AnonymousClass doTest(){
		return new AnonymousClass(){
			private int i=1;
			public int getValue(){
				return i;
			}
		};
	}
}
