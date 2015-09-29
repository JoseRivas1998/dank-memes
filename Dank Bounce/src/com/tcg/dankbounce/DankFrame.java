package com.tcg.dankbounce;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class DankFrame extends JFrame {

	private static final long serialVersionUID = 800280685101071380L;
	
	private JLabel l;
	
	private Random r;
	
	public DankFrame() {
		setSize(440, 74);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setUndecorated(true);
		setBackground(new Color(0,0,0,0));
		setAlwaysOnTop(true);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.setBackground(new Color(0,0,0,0));
		l = new JLabel("Dank Memes");
		l.setFont(new Font("Arial", Font.BOLD, 72));
		p.add(l);
		r = new Random();
		getContentPane().add(p, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void update(float x, float y) {
		setLocation((int) x, (int) y);
		l.setForeground(new Color(r.nextFloat(), r.nextFloat(), r.nextFloat(), 1));
	}
	
}
