package com.tcg.dankbounce;

import java.awt.Toolkit;
import java.util.Random;

public class Main {
	
	public static int width, height;
	
	public static void main(String[] args) {
		width = Toolkit.getDefaultToolkit().getScreenSize().width - 440;
		height = Toolkit.getDefaultToolkit().getScreenSize().height - 74;
		Random r = new Random();
		int l;
		do {
			l = r.nextInt(30);
		} while(l < 10);
		for(int i = 0; i < l; i++) {
			DankThread thread = new DankThread(new DankFrame());
			thread.start();
		}
	}

}
