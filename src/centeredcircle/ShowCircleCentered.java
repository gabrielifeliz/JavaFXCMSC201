package centeredcircle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {

	/* The Stage object is a window. 
	 * Primary Stage is automatically created by 
	 * 	the JVM when an application is launched */ 
	@Override
	public void start(Stage primaryStage) {
		/* Create a Pane object
		 * 	This class allows setting of position 
		 * 	and size properties of attached visual components */ 
		Pane pane = new Pane();
		
		/* Create a Circle object, which is added to the Pane */ 
		Circle circle = new Circle();
		
		// Set center of radius
		circle.setCenterX(100);
		circle.setCenterY(100);
		// Bind the centerX and centerY property 
		//	to the height and width of the pane
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));

		// Set the radius of the circle to 50
		circle.setRadius(50);
		// Modify the outline color of the circle
		/* The Color class provides static constants 
		 * 	for a variety of different color*/
		circle.setStroke(Color.BLACK);
		// Set the fill color of the circle
		circle.setFill(Color.WHITE);
		
		// Add the circle to the pane
		pane.
			// Obtain the list of children that belong to the pane
			getChildren().
			// Add Circle object to the children list
			add(circle);
		
		/* The Scene class houses the nodes 
		 * 	that are applied to a stage*/
		// Create Scene object, passing in our pane
		// 	and setting the size of the window to 200 x 200
		
		// Set the title of primaaryStafe,set the scence, 
		// and show the stage 
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("ShowCircleCentered");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	// Create a main method to run program inside Eclipse
	public static void main(String[] args) {
		launch(args);
	}
}
