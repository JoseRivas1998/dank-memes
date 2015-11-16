package com.tcg.danktofile;

import javafx.application.Application;
import javafx.stage.Stage;

public class Dank extends Application{
	
	public static DankFrame frame;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		frame = new DankFrame();
		
	}

}
