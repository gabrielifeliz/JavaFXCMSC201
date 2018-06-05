package project12CMSC201;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class RacingCarControl extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		CarPane carPane = new CarPane(); // Create a ball pane

		// Pause and resume animation
		carPane.setOnMousePressed(e -> carPane.pause());
		carPane.setOnMouseReleased(e -> carPane.play());

		// Increase and decrease animation
		carPane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.UP) {
				carPane.increaseSpeed();
			} else if (e.getCode() == KeyCode.DOWN) {
				carPane.decreaseSpeed();
			}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(carPane, 250, 150);
		primaryStage.setTitle("RacingCarControl"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		// Must request focus after the primary stage is displayed
		carPane.requestFocus();
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}