package com.test.charging.service;

public class BussCallback implements IBussCallback{
	
	public void notifySync(BussMsg msg) {
		//TODO invoke some service to send msg
		System.out.println("调用消息发送通知");
	};
}
