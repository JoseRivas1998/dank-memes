package com.tcg.dankfollow;

import java.awt.MouseInfo;

public class DankThread extends Thread {

	@Override
	public void run() {
		while(true) {
			Main.frame.setLocation(MouseInfo.getPointerInfo().getLocation());
			Main.frame.setColor();
		}
	}

}
