package com.tcg.dankjavafx;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DankWindow {

	public DankWindow() {
		Stage window = new Stage();
		window.setTitle("Dank Memes");
		
		
		Label memes = new Label("Dank Memes");

		StackPane layout = new StackPane();
		layout.getChildren().addAll(memes);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.setX(Math.random() * java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth());
		window.setY(Math.random() * java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		window.show();

	}
	
}
