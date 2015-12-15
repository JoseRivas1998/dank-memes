package cam.tcg.garage;

import java.awt.Desktop;
import java.net.URL;

public class DankThread extends Thread {

	private String videoURL = "https://youtu.be/Cv1RJTHf5fk";
	
	public DankThread() {
		super();
		this.start();
	}
	
	@Override
	public void run() {
		try {
			Desktop.getDesktop().browse(new URL(videoURL).toURI());
			sleep(10000);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		for(int i = 0; i < 19; i++) {
			try {
				Desktop.getDesktop().browse(new URL(videoURL).toURI());
				sleep(5000);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
