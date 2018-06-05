/*
 * Class: CMSC201 
 * Instructor: Ping-Wei Tsai
 * Description: This program displays sine and cosine graphs using JavaFX too
 * Due: 04/22/2018
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Gabriel I. Feliz 
 */

package project11CMSC201;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Project11 extends Application {
	@Override //Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		// Create sin(x) graph 
		Polyline sineGraph = new Polyline();
		sineGraph.setStroke(Color.RED);
		ObservableList<Double> listSine = sineGraph.getPoints();		
		double scaleFactorSine = 50;
		for (int x = -170; x <= 170; x++) {
			listSine.add(x + 200.0);
			listSine.add(150 - scaleFactorSine * Math.sin((x / 100.0) * 2 * Math.PI));
		}

		// Create cos(x) graph 
		Polyline cosineGraph = new Polyline();
		cosineGraph.setStroke(Color.BLUE);
		ObservableList<Double> listCosine = cosineGraph.getPoints();		
		double scaleFactorCosine = 50;
		for (int x = -170; x <= 170; x++) {
			listCosine.add(x + 200.0);
			listCosine.add(150 - scaleFactorCosine * Math.cos((x / 100.0) * 2 * Math.PI));
		}

		// Draw y-axis and x-axis
		Line xAxis = new Line(10, 150, 390, 150);
		Line yAxis = new Line(200, 30, 200, 250);
		
		// Draw arrows
		Line xAxisDiagLine1 = new Line(390, 150, 370, 140);
		Line xAxisDiagLine2 = new Line(390, 150, 370, 160);
		Line yAxisDiagLine1 = new Line(200, 30, 190, 50);
		Line yAxisDiagLine2 = new Line(200, 30, 210, 50);
		
		// Draw x, y axis labels
		Text xLabel = new Text(380, 170,"X");
		Text yLabel = new Text(220, 40,"Y");
		Text negativeTwoPiLabel = new Text(88, 165, "-2\u03c0");
		Text negativePiLabel = new Text(144, 165, "-\u03c0");
		Text zeroLabel = new Text(200, 165, "0");
		Text piLabel = new Text(248, 165, "\u03c0");
		Text twoPiLabel = new Text(293, 165, "2\u03c0");
		
		// Add the nodes to the layout (pane)
		pane.getChildren().addAll(sineGraph, cosineGraph, xAxis, 
				yAxis, xAxisDiagLine1, xAxisDiagLine2, 
				yAxisDiagLine1, yAxisDiagLine2, xLabel, yLabel, 
				negativeTwoPiLabel, negativePiLabel, 
				zeroLabel, piLabel, twoPiLabel);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setTitle("Project11"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
