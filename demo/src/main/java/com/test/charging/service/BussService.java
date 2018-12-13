package com.test.charging.service;

public class BussService {
	
	public void mainRoyal() {
		new IBussCallback() {
			@Override
			public void notifySync(BussMsg msg) {
				System.out.println("msg");
			}
		};
	}
}
