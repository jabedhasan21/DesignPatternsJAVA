package com.jabed.ObserverPattern;

public class HexaObserver extends Observer{

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Hexa String: "+ Integer.toHexString( subject.getState() ));
	}

}
