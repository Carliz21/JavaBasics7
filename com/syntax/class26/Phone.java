package com.syntax.class26;

public abstract class Phone {
	
	 public void makeCall() {
		System.out.println("Phone makes call");
	}
	
	public void sentText() {
		System.out.println("Phones can send text");
	}
	
	public abstract void navigate ();
	
	public abstract void playMusic ();
	
	//public abstract void takePicture();
		
	}

class Samsung extends Phone {
	
	public void navigate () {
		System.out.println("Samsung navigates ");
	}
	
	public void playMusic () {
		System.out.println("Samsung plays music with google store");
	}
	
}

class iphone extends Phone {
	
	public void navigate() {
		System.out.println("iphone uses GPS via google maps");
	}
	
	public void playMusic() {
	System.out.println("iphone plays music via itunes");	
	}
}
