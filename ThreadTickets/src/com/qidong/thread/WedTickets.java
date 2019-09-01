package com.qidong.thread;

public class WedTickets {
	public static void main(String[] args) {
		Wed12306 we = new Wed12306(8,"火车票");
		new passenger(we, "张三", 5).start();
		new passenger(we, "李四",4).start();
	}
}
	//顾客
	class passenger extends Thread{
		//座位
		int seats;
		public passenger(Runnable target, String name,int seats) {
			super(target, name);
			this.seats=seats;
			// TODO Auto-generated constructor stub
		}
	}
	//火车票网
	class Wed12306 implements Runnable{
		//总共票数
		int available;
		//名称
		String name;
		public Wed12306(int available, String name) {
			this.available = available;
			this.name = name;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			passenger p = (passenger) Thread.currentThread();
			boolean flag = this.bookTickets(p.seats);
			if (flag) {
				System.out.println("出票成功"+Thread.currentThread().getName()+"-->位置为:"+p.seats);
			}else {
				System.out.println("出票失败"+Thread.currentThread().getName()+"-->位置不够");
			}
		}
		//购票
		public synchronized boolean bookTickets(int seats){
			System.out.println("可用位置为："+available);
			if (seats>available) {
				return false;
			}
			available-=seats;
			return true;
		}
	}
