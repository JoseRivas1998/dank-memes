package com.tcg.dankjavafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		for(int i = 0; i < 1000; i++) {
			new DankWindow();
		}
	}

}
