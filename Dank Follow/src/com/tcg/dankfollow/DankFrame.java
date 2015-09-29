package com.tcg.dankfollow;

import javax.swing.*;
import java.awt.*;

public class DankFrame extends JFrame {

	private static final long serialVersionUID = 2663254621319617257L;
	
	private JLabel l;
	
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
		getContentPane().add(p, BorderLayout.CENTER);
		
		setVisible(true);
		
	}

	public void setColor() {
		l.setForeground(new Color((float)Math.random(),(float) Math.random(),(float) Math.random(), 1));
	}
	
}
