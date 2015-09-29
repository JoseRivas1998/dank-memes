package com.tcg.dankimages;

import java.util.Random;

import javax.swing.*;
import java.awt.*;

public class DankFrame extends JFrame {

	private static final long serialVersionUID = -4256835461759456336L;
	
	public final String[] images = new String[] {
		"clarkeconfirmed.png", "communistclarke.png", "Confirmed.png",
		"dankclarke.png", "dariudclarkestorm.png", "Data.png",
		"ImmersionPrinciple.png", "interestingfact.png", "Mathematical.png",
		"Microwaves.png", "NIMBY.png", "showmethedata.png"
	};
	
	public DankFrame(boolean first) {
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setAlwaysOnTop(true);
		Random r = new Random();
		ImageIcon img;
		if(first) {
			img = new ImageIcon(this.getClass().getResource("ImmersionPrinciple.png"));
		} else {
			img = new ImageIcon(this.getClass().getResource(images[r.nextInt(images.length - 1)]));
		}
		JLabel l = new JLabel(img);
		getContentPane().add(l);
		setUndecorated(true);
		setSize(img.getIconWidth(), img.getIconHeight());
		int w = Toolkit.getDefaultToolkit().getScreenSize().width - img.getIconWidth();
		int h = Toolkit.getDefaultToolkit().getScreenSize().height - img.getIconHeight();
		if(w < 0) {
			w = 1;
		}
		if(h < 0) {
			h = 1;
		}
		if(first) {
			setLocationRelativeTo(null);
		} else {
			setLocation(r.nextInt(w), r.nextInt(h));
		}
		setVisible(true);
	}
	
}
