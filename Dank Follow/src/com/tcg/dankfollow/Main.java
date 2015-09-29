package com.tcg.dankfollow;

public class Main {

	public static DankFrame frame;
	
	public static void main(String[] args) {
		Main.frame = new DankFrame();
		DankThread thread = new DankThread();
		thread.start();
	}
	
}
