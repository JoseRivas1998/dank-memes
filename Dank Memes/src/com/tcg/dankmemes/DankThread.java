package com.tcg.dankmemes;

public class DankThread extends Thread {

	@Override
	public void run() {
		boolean first = true;
		while(true) {
			new DankFrame(first);
			first = false;
			try {
				sleep(1000);
			} catch(Exception e){}
		}
	}

}
