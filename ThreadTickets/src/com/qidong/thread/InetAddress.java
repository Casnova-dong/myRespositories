package com.qidong.thread;

import java.net.UnknownHostException;

public class InetAddress {
	public static void main(String[] args) throws UnknownHostException {
		java.net.InetAddress id=java.net.InetAddress.getByName("www.baidu.com");
		System.out.println(id.getHostAddress());
		System.out.println(id.getHostName());
		
		java.net.InetAddress localId=java.net.InetAddress.getLocalHost();
		System.out.println(localId.getHostName());
		System.out.println(localId.getHostAddress());
		System.out.println(localId.toString());
	}
}
