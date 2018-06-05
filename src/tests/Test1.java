package tests;

import javafx.application.Application;
import javafx.stage.Stage;



public class Test1 extends Application {
	
	public Test1() {
		System.out.println("Test");
	}
	
	@Override
	public void start(Stage primaryStage) {
		System.out.println("start");
	}
	
	public static void main(String[] args) {
		System.out.println("launch");
		Application.launch(args);
	}
}
