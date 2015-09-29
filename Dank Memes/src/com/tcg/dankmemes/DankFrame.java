package com.tcg.dankmemes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DankFrame extends JFrame {

	private static final long serialVersionUID = -343549217711247861L;

	public DankFrame(boolean first) {
		setSize(100, 60);
		Random r = new Random();
		int sW = Toolkit.getDefaultToolkit().getScreenSize().width;
		int sH = Toolkit.getDefaultToolkit().getScreenSize().height;
		int x = r.nextInt(sW);
		int y = r.nextInt(sH);
		x = clamp(x, 0, sW - 100);
		y = clamp(y, 0, sH - 60);
		if(first) {
			setLocationRelativeTo(null);
		} else {
			setLocation(x, y);
		}
		
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		
		p.add(new JLabel("Dank Memes"));
		
		getContentPane().add(p, BorderLayout.CENTER);
		
		setResizable(false);
		
		
		setVisible(true);
		try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource("dank.wav"));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	
	private int clamp(int n, int min, int max) {
		int i = n;
		if(i < min) {
			i = min;
		}
		if(i > max) {
			i = max;
		}
		return i;
	}
	
}
