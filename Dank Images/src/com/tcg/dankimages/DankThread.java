package com.tcg.dankimages;

public class DankThread extends Thread {

	@Override
	public void run() {
		boolean first = true;
		while(true) {
			new DankFrame(first);
			first = false;
			try {
				sleep(2000);
			} catch (Exception e) {}
		}
	}

}
