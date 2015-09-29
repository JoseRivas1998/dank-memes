package com.tcg.dankmemes;

import java.util.Random;

import javax.swing.*;

import java.awt.*;

public class DankMeme extends JFrame{

	private static final long serialVersionUID = 1L;

	public DankMeme() {
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setSize(100, 60);
		Random r = new Random();

		int w = Toolkit.getDefaultToolkit().getScreenSize().width;
		int h = Toolkit.getDefaultToolkit().getScreenSize().height;

		int x = r.nextInt(w - 100);
		int y = r.nextInt(h - 60);
		
		setLocation(x, y);

		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		
		p.add(new JLabel("Dank Memes"));
		
		getContentPane().add(p, BorderLayout.CENTER);
		
		setResizable(false);
		
		setVisible(true);
		
	}
	
}
