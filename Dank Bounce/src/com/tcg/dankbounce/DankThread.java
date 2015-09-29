package com.tcg.dankbounce;

import java.util.Random;

public class DankThread extends Thread {

	private float velX, velY;
	
	private float x, y;
	
	private Random rand;
	
	private DankFrame frame;
	
	public DankThread(DankFrame frame) {
		this.frame = frame;
		rand = new Random();
		x = rand.nextInt(Main.width);
		y = rand.nextInt(Main.height);
		randomVel();
	}
	
	@Override
	public void run() {
		while(true) {
			x += velX;
			y += velY;
			if(x >= Main.width || x <= 0) {
				velX *= -1;
			}
			if(y >= Main.height || y <= 0) {
				velY *= -1;
			}
			frame.update(x, y);
			try {
				sleep(16);
			} catch(Exception e) {}
		}
	}
	
	private void randomVel() {
		int speed = rand.nextInt(10) + 10;
		float r = rand.nextFloat() * ((float) Math.PI);
		float[] vel = {
			(float) Math.cos(r) * (float)speed, (float) Math.sin(r) * (float)speed
		};
		this.velX = vel[0];
		this.velY = vel[1];
	}

}
