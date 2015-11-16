package com.tcg.danktofile;

import java.io.PrintWriter;

import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DankFrame {

	private Stage window;
	
	public static boolean run;
	
	private TextArea textArea;
	
	public static final String dank = "Dank Memes\tDank Memes\n";
	public static String current;
	
	public DankFrame() {
		window = new Stage();
		window.setTitle("Dank memes");
		
		current = "";
		
		run = true;
		
		
		textArea = new TextArea();
		textArea.setEditable(false);
		StackPane pane = new StackPane();
		
		pane.getChildren().addAll(textArea);
		
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.setMinWidth(200);
		window.setMinHeight(200);
		window.setWidth(200);
		window.setHeight(200);
		window.show();
		window.setOnCloseRequest(e -> {
			run = false;
			try {
				PrintWriter pw = new PrintWriter("dankMemes.txt");
				pw.println(current);
				pw.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		Task<Void> task = new Task<Void>() {
		    @Override protected Void call() throws Exception {
		        while(run) {
		        	for(int i = 0; i < 100; i++) {
			        	current += dank;
		        	}
		        	textArea.setText(current);
		        	textArea.setScrollTop(Double.MAX_VALUE);
			        Thread.sleep(50);
		        }
		        return null;
		    }
		};
		
		Thread t = new Thread(task);
		t.setDaemon(true);
		t.start();
		
	}
	
}
