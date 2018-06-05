package ch14exercises;
//import java.io.File;
//import java.awt.Transparency;
import javafx.application.Application;
//import javafx.geometry.Insets;
import javafx.scene.Scene;
//import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
//import javafx.scene.control.TextField;
//import javafx.scene.control.Label;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.FontPosture;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
//import javafx.scene.shape.Arc;
//import javafx.scene.shape.ArcType;
//import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
//import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import java.util.ArrayList;
import javafx.collections.ObservableList;
//import javafx.scene.text.TextAlignment;
//import java.util.Scanner;


public class Ch14Exercises extends Application {
    
    public static void main(String args[]) { Application.launch(args); }
    
    @Override
    public void start(Stage primaryStage) {

    // 14.1 a...
//    Pane pane = new Pane();
//    Image image1 = new Image("image/uk.jpg");
//    Image image2 = new Image("image/ca.gif");
//    Image image3 = new Image("image/china.gif");
//    Image image4 = new Image("image/us.gif");
//    
//    ImageView v1 = new ImageView(image1);
//    ImageView v2 = new ImageView(image2);
//    ImageView v3 = new ImageView(image3);
//    ImageView v4 = new ImageView(image4);
//    
//    v2.setX(image1.getWidth());
//    v2.setY(0);
//    v3.setX(0);
//    v3.setY(image1.getHeight());
//    v4.setX(image1.getWidth());
//    v4.setY(image2.getHeight());
//    
//    pane.getChildren().addAll( v1, v2, v3, v4 );
    
    // 14.2 b...
//    Pane pane = new Pane();
//    Image o = new Image("image/not.gif");
//    Image x = new Image("image/x.gif");
//    
//    ImageView upperLeft = new ImageView(o);
//    ImageView upperMid = new ImageView(x);
//    ImageView upperRight = new ImageView(o);
//    ImageView midLeft = new ImageView(x);
//    ImageView midRight = new ImageView(x);
//    ImageView lowLeft = new ImageView(x);
//    
//    double w = o.getWidth();
//    double h = o.getHeight();
//    
//    ImageView[] squares = new ImageView[9];
//    
//    for(int i = 0; i < 9; i++) {
//    int pick = (int)( Math.random() * 3);
//    System.out.println("pick:   " + pick);
//    if(pick == 0) {
//        squares[i] = new ImageView(o);
//        squares[i].setOpacity(0);
//    }
//        
//    else if(pick == 1)
//        squares[i] = new ImageView(o);
//    else
//        squares[i] = new ImageView(x);
//    }
//
//    squares[0].setLayoutX(w);
//    squares[1].setLayoutX(w * 2);
//    squares[2].setLayoutX(w * 3);
//    
//    squares[3].setLayoutX(w);
//    squares[3].setLayoutY(h);
//    
//    squares[4].setLayoutX(w * 2);
//    squares[4].setLayoutY(h);
//    
//    squares[5].setLayoutX(w * 3);
//    squares[5].setLayoutY(h);
//    
//    squares[6].setLayoutX(w);
//    squares[6].setLayoutY(h * 2);
//    
//    squares[7].setLayoutX(w * 2);
//    squares[7].setLayoutY(h * 2);
//            
//    squares[8].setLayoutX(w * 3);
//    squares[8].setLayoutY(h * 2);
//    
//
//    pane.getChildren().addAll(squares);
//
//    
//    Scene scene = new Scene(pane, o.getWidth() * 5, o.getHeight() * 3);
    
    // 14.3 c...
//   HBox hBox = new HBox(3);
//     int[] card = {0, 0, 0};
    
//     for(int i = 0; i < card.length; i++)
//         card[i] = (int) (1 + Math.random() * 54);
    
//     for(int i : card)
//         System.out.println(i);
        
//     Image c1 = new Image("image/card/" + card[0] +  ".png");
//     Image c2 = new Image("image/card/" + card[1] +  ".png");
//     Image c3 = new Image("image/card/" + card[2] +  ".png");
    
//     ImageView iv1 = new ImageView (c1);
//     ImageView iv2 = new ImageView (c2);
//     ImageView iv3 = new ImageView (c3);
    
//     Scene scene = new Scene(hBox);
//     hBox.getChildren().addAll(iv1, iv2, iv3);
//     primaryStage.setTitle("cards");
//     primaryStage.setScene(scene);
//     primaryStage.show();
        
    //  PE  14.4   display vertical text with random colors...
        
    
    
        
//    Text[] t = new Text[5];
    
//    for(int i = 0; i < 5; i++) {
//        t[i] = new Text(1 + i * 40, 40, "Java");
//        t[i].setRotate(90);
//        t[i].setFill(Color.color(Math.random(), Math.random(), Math.random()));
//        t[i].setOpacity(Math.random());
//        t[i].setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
//        pane.getChildren().add(t[i]);
//    }
    
    
    //  PE 14.5   Display "WELCOME TO JAVA" curved in a circle instead of straight...
    
//    String str = "WELCOME TO JAVA ";
//    char[] chrs = new char[str.length()];
//    
//    for(int i = 0; i < str.length(); i++)
//        chrs[i] = str.charAt(i);
//    
//    Text[] message = new Text[chrs.length];
//    
//  
//    for(int i = 0; i < message.length; i++) {
//        message[i] = new Text(20, 20, "" + chrs[i]);
//        message[i].setFont(Font.font("Tahoma", FontWeight.BOLD, FontPosture.REGULAR, 30));
//        message[i].setRotate(i * 360 / message.length + 90);
//        
//        message[i].setX(150 + 90 * Math.cos(2 * i * Math.PI / message.length));
//        message[i].setY(150 + 90 * Math.sin(2 * i * Math.PI / message.length));
//        pane.getChildren().add(message[i]);
//    }
    
    //  PE  14.6  Display checkerboard
//    Rectangle[] rect = new Rectangle[8 * 8];
//    int count = 0;
//    
//    for(int i = 0; i < 8; i++) {
//    
//        for(int j = 0; j < 8; j++) {
//            rect[count] = new Rectangle( j * (300/8), i  * (300/8), 300 / 8, 300 / 8 );
//            
//            if(count % 2 == 0 && i % 2 == 0) {
//            rect[count].setFill(Color.WHITE);
//            } else if (count % 2 != 0 && i % 2 != 0) 
//                rect[count].setFill(Color.WHITE);
//            else
//                rect[count].setFill(Color.BLACK);
//            
//            pane.getChildren().add(rect[count]);
//            count++;
//        }
//    }
    
    
    //  PE  14.7  10x10 matrix of 1 or 0 TextFields...
//    FlowPane pane = new FlowPane();
//    for(int i = 0; i < 10; i++) {
//    
//        for(int j = 0; j < 10; j++) {
//        TextField tf = new TextField();
//        int num = (int)( Math.random() * 2);
//        tf.setText("" + num);
//        tf.setMaxWidth(20);
//        
//        pane.getChildren().add(tf);
//        
//        }
//    }
        
    // PE  14.8  Display all playing cards 9 per row...
//    double sizeW = new Image("image/card/1.png").getWidth();
//    double sizeH = new Image("image/card/1.png").getHeight();
//    
//    System.out.println("SizeW: " + sizeW);
//    System.out.println("SizeH: " + sizeH);
//    
//    for(int i = 1; i <= 54; i++) {
//    Image card = new Image("image/card/" + i + ".png");
//    ImageView view = new ImageView(card);
//    pane.getChildren().add(view);
//    }
//        
//    Scene scene = new Scene(pane,sizeW * 9,sizeH * (54 / 9));
        
        
        // PE  14.9 Display four fans...
        
    //Pane pane = new Pane();
//    pane.setPadding(new Insets(5, 5, 5, 5));
//
//
//    for(int x = 60; x < 60 * 3; x += 60 + 50) {
//    
//                for(int y = 60; y < 60 * 3; y += 60 + 50) {
//                    
//                Circle c = new Circle(x, y, 50);
//                c.setStroke(Color.BLACK);
//                c.setFill(Color.WHITE);
//
//                pane.getChildren().add(c);
//
//                for(int i = 0; i < 360; i += 90) {
//                    Arc arc = new Arc(c.getCenterX(), c.getCenterY(), 
//                            c.getRadius() - 5, c.getRadius() - 5, 30 + i, 40);
//
//                    arc.setType(ArcType.ROUND);
//                    arc.setFill(Color.BLUE);
//                    arc.centerXProperty().bind(c.centerXProperty());
//                    arc.centerYProperty().bind(c.centerYProperty());
//
//                    pane.getChildren().add(arc);
//                    
//                }
//            } // end of inner four loop
//        }  // end of outer for loop
        

    //  PE  14.10  Display a cylinder...
    
//    Ellipse e = new Ellipse(250/ 2, 30, 60, 20);
//    e.setFill(Color.WHITE);
//    e.setStroke(Color.BLACK);
//    
//    Line left = new Line();
//    left.setStartX(e.getCenterX() - 60);
//    left.setStartY(e.getCenterY());
//    
//    left.setEndX(left.getStartX());
//    left.setEndY(180);
//    
//    Line right = new Line(e.getCenterX() + 60, e.getCenterY(), e.getCenterX() + 60, 180);
//    
//    
//    Arc solid = new Arc(e.getCenterX(), 180, 60, 20, 0, -180);
//    solid.setStroke(Color.BLACK);
//    solid.setFill(Color.WHITE);
//    
//    Arc dashed = new Arc(e.getCenterX(), 180, 60, 20, 0, 180);
//    dashed.getStrokeDashArray().addAll(6.0, 21.0);
//    dashed.setFill(Color.WHITE);
//    dashed.setStroke(Color.BLACK);
//    
//    pane.getChildren().addAll(e, left, right, solid, dashed);
    
    //  PE 14.11    Paint a smiley face...  
    
//    Circle head = new Circle(250 / 2, 225 / 2, 100);
//    head.setStroke(Color.BLACK);
//    head.setFill(Color.WHITE);
//    
//    Polygon nose = new Polygon();
//    nose.setStroke(Color.BLACK);
//    nose.setFill(Color.WHITE);
//    ObservableList<Double> list = nose.getPoints();
//    
//    Double points[] = { 250.0 / 2 - 20, 225.0 / 2 + 20, 
//        250.0 / 2 + 20, 225.0 / 2 + 20,
//        250.0 / 2, 225.0 / 2 - 25,
//    };
//    
//    for(Double d : points)
//        list.add(d);
//    
//    Ellipse leftEye = new Ellipse(80, 80, 25, 15);
//    leftEye.setFill(Color.WHITE);
//    leftEye.setStroke(Color.BLACK);
//    
//    Ellipse rightEye = new Ellipse(250 - 80, 80, 25, 15);
//    rightEye.setFill(Color.WHITE);
//    rightEye.setStroke(Color.BLACK);
//    
//    
//    Circle leftPupil = new Circle(leftEye.getCenterX(), leftEye.getCenterY(), 10);
//    Circle rightPupil = new Circle(rightEye.getCenterX(), rightEye.getCenterY(), 10);
//    
//    Arc mouth = new Arc(250 / 2, (225 / 4) * 2.8, 40, 12, 0, -180);
//    mouth.setStroke(Color.BLACK);
//    mouth.setFill(Color.WHITE);
//    
//    pane.getChildren().addAll(head, nose, leftEye, rightEye, leftPupil, rightPupil, mouth);
//    
//    Scene scene = new Scene(pane, 250, 225);
//    primaryStage.setTitle("Ellipse");
//    primaryStage.setScene(scene);
//    primaryStage.show();
    
    
    
    //  PE  14.12   Display a bar chart...
//    Pane pane = new Pane();
//
//    
//    double barAmnts[] = {20, 10, 30, 40};
//    String items[] = {"Project", "Quiz", "Midterm", "Final"};
//    Color[] color = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
//    double paneWidth = 500;
//    double paneHeight = 200;
//    double barWidth = paneWidth / 4 - 10;
//
//    
//    for(int i = 0; i < barAmnts.length; i++) {
//        System.out.println("i = " + i);
//        double x = i * (paneWidth / barAmnts.length) + 5;
//        double y = (100 - barAmnts[i]) * paneHeight / 100;
//        double barHeight = barAmnts[i] * paneHeight / 100 - 5;
//        
//        System.out.println("x: " + x + ",  y: " + y + ",  barHeight: " + barHeight);
//        
//        Rectangle rec = new Rectangle(x, y, barWidth, barHeight);
//        rec.setFill(color[i]);
//        
//        Text label = new Text(items[i] + " -- " + String.format("%1.0f", barAmnts[i]) + "%");
//        label.setX(x);
//        label.setY(y - 10);
//        label.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
//        
//        pane.getChildren().addAll(rec, label);
//    }
//
//
//    Scene scene = new Scene(pane, 500, 200);
//    primaryStage.setTitle("Exercise14_12");
//    primaryStage.setScene(scene);
//    primaryStage.show();
        
        //  PE  14.13  Display a pie chart...
        
        //  Projects 20% red, quizzes 10% blue, 
        //  midterm exams 30% green, and final exams 40% orange
        
//        Pane pane = new Pane();
//        
//        int xPane = 400;
//        int yPane = 400;
//        int centerX = xPane / 2;
//        int centerY = yPane / 2;
//        double covered = 0;
//        
//        String labels[] = {"Projects", "Quizzes", "Midterm Exams", "Final Exams"};
//        double amounts[] = {20, 10, 30, 40};
//        Color color[] = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
//        
//        for(int i = 0; i < amounts.length; i++) {
//            double portion = 360 * amounts[i] / 100;
//            Arc arc = new Arc(centerX, centerY, 100, 100, covered, portion);
//            arc.setType(ArcType.ROUND);
//            arc.setFill(color[i]);
//            Text label = new Text(labels[i] + "--" + String.format("%1.0f", amounts[i]) + "%");
//
//            pane.getChildren().addAll(arc);
//            covered += portion;
//        }
//        
//        Text[] label = {
//            new Text(centerX + 30, centerY - 10, "Project -- 20%"),
//            new Text(centerX, centerY / 2, "Quiz -- 10%"),
//            new Text(centerX / 6, centerY - 5, "Midterm -- 30%"),
//            new Text(centerX, yPane * 0.7, "Final -- 40%")
//        };
//        
//        for(Text t : label)
//            pane.getChildren().add(t);
//        
//        Scene scene = new Scene(pane, xPane, yPane);
//        primaryStage.setTitle("Exercise14.13");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        
        //  14.14  Display a rectanguloid (resizable cube)...
        
//        Pane pane = new Pane();
//        
//        int paneWidth = 400;
//        int paneHeight = 400;
//        
//        Rectangle back = new Rectangle();
////        back.scaleXProperty().bind(null);
//        back.xProperty().bind(pane.widthProperty().divide(6.0));
//        back.yProperty().bind(pane.heightProperty().divide(13.0));
//        back.widthProperty().bind(pane.widthProperty().divide(1.3));
//        back.heightProperty().bind(pane.heightProperty().divide(1.4));
//        back.setStroke(Color.BLACK);
//        back.setFill(Color.TRANSPARENT);
//        
//        Rectangle front = new Rectangle();
//        front.setStroke(Color.BLACK);
//        front.setFill(Color.TRANSPARENT);
//        front.xProperty().bind(pane.widthProperty().divide(13.0));
//        front.yProperty().bind(pane.heightProperty().divide(6.0));
//        front.widthProperty().bind(pane.widthProperty().divide(1.3));
//        front.heightProperty().bind(pane.heightProperty().divide(1.4));
//        
//        Line upperLeft = new Line();
//        upperLeft.startXProperty().bind(back.xProperty());
//        upperLeft.startYProperty().bind(back.yProperty());
//        upperLeft.endXProperty().bind(front.xProperty());
//        upperLeft.endYProperty().bind(front.yProperty());
//        
//        Line upperRight = new Line();
//        upperRight.startXProperty().bind(back.xProperty().add(back.widthProperty()));
//        upperRight.startYProperty().bind(back.yProperty());
//        upperRight.endXProperty().bind(front.xProperty().add(front.widthProperty()));
//        upperRight.endYProperty().bind(front.yProperty());
//        
//        Line lowerLeft = new Line();
//        lowerLeft.startXProperty().bind(back.xProperty());
//        lowerLeft.startYProperty().bind(back.yProperty().add(back.heightProperty()));
//        lowerLeft.endXProperty().bind(front.xProperty());
//        lowerLeft.endYProperty().bind(front.yProperty().add(front.heightProperty()));
//        
//        Line lowerRight = new Line();
//        lowerRight.startXProperty().bind(back.xProperty().add(back.widthProperty()));
//        lowerRight.startYProperty().bind(back.yProperty().add(back.heightProperty()));
//        lowerRight.endXProperty().bind(front.xProperty().add(front.widthProperty()));
//        lowerRight.endYProperty().bind(front.yProperty().add(front.heightProperty()));
//        
//        
//        pane.getChildren().addAll(back, front, upperLeft, upperRight, lowerLeft, lowerRight);
//        
//        Scene scene = new Scene(pane, paneWidth, paneHeight);
//        primaryStage.setTitle("Resizeable Cube");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        
        // PE 14.15   Draw a stop sign
//        Pane pane = new Pane();
//        int paneWidth = 300;
//        int paneHeight = 300;
//        
//        Polygon sign = new Polygon();
//        sign.setFill(Color.DARKRED);
//        ObservableList<Double> list = sign.getPoints();
//        
//        double width = 300; double height = 300;
//        double radius = Math.min(width, height) * 0.4;
//        double centerX = width / 2, centerY = height / 2;
//        
//        for (int i = 0; i < 8; i++) {
//        list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
//        list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
//        }
//        
//        sign.setRotate(22);
//        
//        Text stop = new Text("STOP");
//        stop.setX(68);
//        stop.setY(170);
//        stop.setFill(Color.WHITE);
//        stop.setFont(Font.font("Tahoma", FontWeight.NORMAL, 70));
//        
//        
//        pane.getChildren().addAll(sign, stop);
//        Scene scene = new Scene(pane, paneWidth, paneHeight);
//        primaryStage.setTitle("Stop Sign");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        
        // 14.16  3 x 3 resizeable grid red vertical and blue horizontal...
        
//        Pane pane = new Pane();
//        int paneWidth = 200;
//        int paneHeight = 200;
//        
//        for(int i = 1; i <= 2; i++) {
//            Line vert = new Line();
//            vert.startXProperty().bind(pane.widthProperty().divide(3).multiply(i));
//            vert.setStartY(0);
//            vert.endXProperty().bind(pane.widthProperty().divide(3).multiply(i));
//            vert.endYProperty().bind(pane.heightProperty());
//            vert.setStroke(Color.RED);
//            pane.getChildren().add(vert);
//        }
//        
//        for(int i = 1; i <= 2; i++) {
//            Line horz = new Line();
//            horz.setStartX(0);
//            horz.startYProperty().bind(pane.heightProperty().divide(3).multiply(i));
//            horz.endXProperty().bind(pane.widthProperty());
//            horz.endYProperty().bind(pane.heightProperty().divide(3).multiply(i));
//            horz.setStroke(Color.BLUE);
//            pane.getChildren().add(horz);
//        }
//        
//        Scene scene = new Scene(pane, paneWidth, paneHeight);
//        primaryStage.setTitle("Resizeable Grid");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        //  PE 14.17    Display hangman drawing
        
//        Pane pane =  new Pane();
//        int paneWidth = 400;
//        int paneHeight = 380;
//        
//        Color bodyColor = Color.DARKSALMON;
//        
//        Arc base = new Arc(80, 365, 50, 15, 0, 180);
//        base.setStroke(Color.BLACK);
//        base.setFill(Color.TRANSPARENT);
//        
//        Line pole = new Line(80, 15, 80, 350);
//        
//        Line horz = new Line(80, 15, 240, 15);
//        
//        Line hook = new Line(240, 15, 240, 35);
//        
//        Circle head = new Circle(240, 70, 35);
//        head.setFill(Color.TRANSPARENT);
//        head.setStroke(bodyColor);
//        
//        Line leftArm = new Line();
//        leftArm.startXProperty().bind(head.centerXProperty().subtract(25));
//        leftArm.startYProperty().bind(head.centerYProperty().add(25));
//        leftArm.endXProperty().bind(head.centerXProperty().subtract(80));
//        leftArm.endYProperty().bind(head.centerYProperty().add(80));
//        
//        Line rightArm = new Line();
//        rightArm.startXProperty().bind(head.centerXProperty().add(25));
//        rightArm.startYProperty().bind(head.centerYProperty().add(25));
//        rightArm.endXProperty().bind(head.centerXProperty().add(80));
//        rightArm.endYProperty().bind(head.centerYProperty().add(80));
//        
//        rightArm.setStroke(bodyColor);
//        leftArm.setStroke(bodyColor);
//        
//        Line body = new Line();
//        body.startXProperty().bind(head.centerXProperty());
//        body.startYProperty().bind(head.centerYProperty().add(head.radiusProperty()));
//        body.endXProperty().bind(body.startXProperty());
//        body.endYProperty().bind(body.startYProperty().add(150));
//        body.setStroke(bodyColor);
//        
//        Line leftLeg = new Line();
//        leftLeg.startXProperty().bind(body.endXProperty());
//        leftLeg.startYProperty().bind(body.endYProperty());
//        leftLeg.endXProperty().bind(leftLeg.startXProperty().subtract(60));
//        leftLeg.endYProperty().bind(leftLeg.startYProperty().add(80));
//        
//        Line rightLeg = new Line();
//        rightLeg.startXProperty().bind(body.endXProperty());
//        rightLeg.startYProperty().bind(body.endYProperty());
//        rightLeg.endXProperty().bind(rightLeg.startXProperty().add(60));
//        rightLeg.endYProperty().bind(rightLeg.startYProperty().add(80));
//        
//        leftLeg.setStroke(bodyColor);
//        rightLeg.setStroke(bodyColor);
//        
//        pane.getChildren().addAll(base, pole, horz, hook, 
//                head, leftArm, rightArm, body, leftLeg, rightLeg);
//        
//        Scene scene = new Scene(pane, paneWidth, paneHeight);
//        primaryStage.setTitle("Resizeable Grid");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        
        // PE 14.18   Draw function f of x parabolla on an axis  ------------ INCOMPLETE -----------
        
//        Pane pane = new Pane();
//        
//        Polyline pLine = new Polyline();
//        
//        ObservableList<Double> list = pLine.getPoints();
//        double scaleFactor = 0.0125;
//        for(int x = 150; x >= -150; x--) {
//            list.add(x + 150.0);
//            list.add(scaleFactor * x * x);
//        }
//        
//        pLine.setStroke(Color.BLACK);
//        
//        Line xAxis = new Line(0, 160, 300, 160);
//        Line yAxis = new Line(150, 200, 150, 20 );
//        
//        Text yLabel = new Text("Y");
//        yLabel.setX(165);
//        yLabel.setY(20);
//        
//        Text xLabel = new Text("X");
//        xLabel.setX(270);
//        xLabel.setY(135);
//        
//        Polyline yArrow = new Polyline();
//        
//        ObservableList<Double> yArrList = yArrow.getPoints();
//        double[] yArrPts = {
//            yAxis.getEndX() - 5, yAxis.getEndY() + 7, yAxis.getEndX(), yAxis.getEndY(),
//            yAxis.getEndX() + 5, yAxis.getEndY() + 7
//        };
//        
//        for(double d : yArrPts)
//            yArrList.add(d);
//        
//        Polyline xArrow = new Polyline();
//        ObservableList<Double> xArrList = xArrow.getPoints();
//        double[] xArrPts = {
//            xAxis.getEndX() - 7, xAxis.getEndY() - 5, xAxis.getEndX(), xAxis.getEndY(),
//            xAxis.getEndX() - 7, xAxis.getEndY() + 5
//        };
//        
//        for(double d : xArrPts)
//            xArrList.add(d);
//        
//        pane.getChildren().addAll(pLine, xAxis, yAxis, yLabel, xLabel, yArrow, xArrow);
//        
//        Scene scene = new Scene(pane, 300, 200);
//        primaryStage.setTitle("f(x) = x^2");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        //  PE 14.19  display the sine function in red and cosine in blue ------------ INCOMPLETE ------------
        
//        Pane pane = new Pane();
//        int paneWidth = 500;
//        int paneHeight = 200;
//        
//        Polyline xAxis = new Polyline();
//        ObservableList<Double> xAxisList = xAxis.getPoints();
//        double[] xAxisPts = {
//            0, 100, 490, 100, 480, 90,
//            490, 100, 480, 110
//        };
//        
//        for(double d : xAxisPts)
//            xAxisList.add(d);
//        
//        Polyline yAxis = new Polyline();
//        ObservableList<Double> yAxisList = yAxis.getPoints();
//        double[] yAxisPts = {
//            250, 200, 250, 10, 240, 20,
//            250, 10, 260, 20
//        };
//        
//        for(double d : yAxisPts)
//            yAxisList.add(d);
//        
//        Text x = new Text("X");
//        x.setX(485);
//        x.setY(80);
//        
//        Text y = new Text("Y");
//        y.setX(265);
//        y.setY(15);
//        
//        
//        Polyline sine = new Polyline();
//        ObservableList<Double> list = sine.getPoints();
//        double scaleFactor = 50;
//        for(int xPt = -170; xPt <= 170; xPt++) {
//            list.add(xPt + 200.0);
//            list.add(100 - scaleFactor * Math.sin((xPt / 100.0) * 2 * Math.PI));
//        }
//        
//        sine.setStroke(Color.RED);
//        
//        Polyline cosine = new Polyline();
//        ObservableList<Double> list2 = cosine.getPoints();
//        double scaleFactor2 = 8;
//        for(int xPt2 = -170; xPt2 <= 170; xPt2++) {
//            list2.add(xPt2 + 200.0);
//            list2.add(100 - scaleFactor2 * Math.cos(xPt2 / 100.0) * 2 * Math.PI);
//        }
//        
//        cosine.setStroke(Color.BLUE);
//        
//        pane.getChildren().addAll(xAxis, yAxis, x, y, sine, cosine);
//        Scene scene = new Scene(pane, paneWidth, paneHeight);
//        primaryStage.setTitle("Sine and Cosine");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        
        
        //  14.20   Display a random arrow on the stage...
        // --------------- INCOMPLETE --------------------
//        Pane pane = new Pane();
//        double paneWidth = 400;
//        double paneHeight = 400;
//        
//        double startX = 1 + Math.random() * paneWidth;
//        double startY = 1 + Math.random() * paneHeight;
//        double endX = 1 + Math.random() * paneWidth;
//        double endY = 1 + Math.random() * paneHeight;
//        
//        drawArrowLine(startX, startY, endX, endY, pane);
//        
//        Scene scene = new Scene(pane, paneWidth, paneHeight);
//        primaryStage.setTitle("Random Arrow");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        // 14.21   Display two filled circles with radius 15px
        //          at random locations with a connecting line
        //          and display the length
//        Pane pane = new Pane();
//        double paneWidth = 400;
//        double paneHeight = 400;
//        
//        double aX = 16 + Math.random() * (paneWidth - 16);
//        double aY = 16 + Math.random() * (paneHeight - 16);
//        double bX = 16 + Math.random() * (paneWidth - 16);
//        double bY = 16 + Math.random() * (paneHeight - 16);
//        
//        drawPoints(aX, aY, bX, bY, pane);
//        
//        Scene scene = new Scene(pane, paneWidth, paneHeight);
//        primaryStage.setTitle("Circles with distance.");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        
        //  14.22  display circles with non overlapping connected line
        //          and numbers showing circle 1 and 2
        
//        Pane pane = new Pane();
//        double paneWidth = 400;
//        double paneHeight = 400;
//        
//        double aX = 16 + Math.random() * (paneWidth - 16);
//        double aY = 16 + Math.random() * (paneHeight - 16);
//        double bX = 16 + Math.random() * (paneWidth - 16);
//        double bY = 16 + Math.random() * (paneHeight - 16);
//        
//        drawPointsNoFill(aX, aY, bX, bY, pane);
//        
//        Scene scene = new Scene(pane, paneWidth, paneHeight);
//        primaryStage.setTitle("Circles with line");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        //  14.23   Two rectangles defined by user input,
        //          Rectangels are displayed,
        //          Text at bottom states their relationship
        //          (they overlap or they don't, or one is contained by the other)
        
//        //  Prompt for user input
//        //   need the center points, width, and height for both
//        
//        Pane pane = new Pane();
//        
        //Scanner in = new Scanner(System.in);
//        System.out.print("Enter rec1 center, w, and h (x y w h): ");
//        double rec1x = in.nextDouble();
//        double rec1y = in.nextDouble();
//        double rec1w = in.nextDouble();
//        double rec1h = in.nextDouble();
//        Rectangle rec1 = new Rectangle(rec1x, rec1y, rec1w, rec1h);
//        rec1.setFill(Color.TRANSPARENT);
//        rec1.setStroke(Color.BLACK);
//        
//        System.out.print("Now enter rec2's(x y w h): ");
//        double rec2x = in.nextDouble();
//        double rec2y = in.nextDouble();
//        double rec2w = in.nextDouble();
//        double rec2h = in.nextDouble();
//        Rectangle rec2 = new Rectangle(rec2x, rec2y, rec2w, rec2h);
//        rec2.setFill(Color.TRANSPARENT);
//        rec2.setStroke(Color.BLACK);
//             
//        
//        //  getRelationship function to produce the text
//        //      this can return text and set to a var
//        
//        Text result = new Text(getRelationship(rec1, rec2));
//        result.setX(20);
//        result.setY(365);
//        //  create the stage, pane, rectangles, and display with text
//        
//        pane.getChildren().addAll(result, rec1, rec2);
//        
//        Scene scene = new Scene(pane, 400, 400);
//        primaryStage.setTitle("Rectangles");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
      //  14.24  Four points from user input to make a polygon
        //       fifth point is determined to be inside or outside
        
//        Enter five points (x1, y1, x2, y2, x3, y3, x4, y4, x5, y5)
//        System.out.println("Enter five points (x1, y1, x2, y2, x3, y3, x4, y4, x5, y5): ");
//        
//        Pane pane = new Pane();
//        Polygon polygon = new Polygon();
//        polygon.setFill(Color.TRANSPARENT);
//        polygon.setStroke(Color.BLACK);
//        ObservableList<Double> list = polygon.getPoints();
//        
//        for(int i = 0; i < 8; i++)
//            list.add(in.nextDouble());
//        
//        Circle circle = new Circle(in.nextDouble(), in.nextDouble(), 3);
//        
//        Text text = new Text();
//        
//        text.setText( "The point is " + 
//                (polygon.contains(circle.getCenterX(), circle.getCenterY()) ? "" : "not ") 
//                + "inside the polygon" );
//                    
//        text.setX(20);
//        text.setY(370);
//        
//        pane.getChildren().addAll(polygon, circle, text);
//        
//        Scene scene = new Scene(pane, 400, 400);
//        primaryStage.setTitle("Polygon with fifth point");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        //  14.25  Connect 5 random points in a circle's edges...
        
//        Pane pane = new Pane();
//        
//        Circle c = new Circle( 200, 200, 190 );
//        
//        Polygon p = new Polygon();
//        p.setFill(Color.TRANSPARENT);
//        p.setStroke(Color.BLACK);
//        
//        ObservableList<Double> list = p.getPoints();
//        
//        double[][] unsortedPts = new double[5][2];
//        
//        //  Gets the 5 random points
//        for(int i = 0; i < 5; i++) {
//            double ptOnCircle = 1 + Math.random() * 360;
//            double xPt = c.getCenterX() + 190 * Math.sin(ptOnCircle * (2 * Math.PI / 360));
//            double yPt = c.getCenterY() + 190 * Math.cos(ptOnCircle * (2 * Math.PI / 360));
//            
//            unsortedPts[i][0] = xPt;
//
//            unsortedPts[i][1] = yPt;
//        }
//        
//        //  This code can be commented out...
//        int loopCount = 0;
//        
//        
//        //  Invisible "second hand" sweeps through the circle, detecting the points,
//        //      and when found adds them to the list.
//        
//        for(int i = 1; i <= 180; i++) {
//            
//            double xSensor = c.getCenterX() + 190 * Math.sin(i * (2 * Math.PI / 180));
//            double ySensor = c.getCenterY() + 190 * Math.cos(i * (2 * Math.PI / 180));
//            Line sensor = new Line(c.getCenterX(), c.getCenterY(), xSensor, ySensor);
//            sensor.setStroke(Color.YELLOW);
//            for(int j = 0; j < 5; j++) {
//                loopCount++;
//                System.out.println("Checking " + xSensor + " and " + ySensor + "...");
//                System.out.println("...against" + unsortedPts[j][0] + " and " + unsortedPts[j][1]);
//                if( Math.abs( xSensor - unsortedPts[j][0] ) < 10 && 
//                        Math.abs( ySensor - unsortedPts[j][1] ) < 10 ) {
//                    list.add(unsortedPts[j][0]);
//                    list.add(unsortedPts[j][1]);
//                    sensor.setStroke(Color.GREEN);
//                }
//            }
//            pane.getChildren().add(sensor);
//        }
//                    
//        System.out.println("Loop count: " + loopCount);
//        c.setStroke(Color.BLACK);
//        c.setFill(Color.TRANSPARENT);
//        
//        pane.getChildren().addAll(c, p);
//        
//        
//        Scene scene = new Scene(pane, 400, 400);
//        primaryStage.setTitle("Polygon in Circle");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        
        // 14.26  Display two clocks with multiple hand positions...
        // clockOne: 4, 20, 45
        // clockTwo: 22, 46, 15...
        
//        Pane pane = new Pane();
//        int positions1[] = {4, 20, 45};
//        int positions2[] = {22, 46, 15};
//        
//        getClock(pane, 150, 150, 100, positions1);
//        getClock(pane, 450, 150, 100, positions2);
//
//        //pane.getChildren().addAll(clockOne, clockTwo);
//        
//        Scene scene = new Scene(pane, 600, 300);
//        primaryStage.setTitle("Polygon in Circle");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        //  14.27  Draw a detailed clock...
        
//        DetailedClockPane dcp = new DetailedClockPane();
//        
//        Scene scene = new Scene(dcp);
//        primaryStage.setTitle("Detailed Clock");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        
        //   14.28  random minute and hour hands with invisible second hand...
//        int hour = (int) (1 + Math.random() * 11);
//        int minute = (int) (1 + Math.random() * 59);
//        ClockPane c = new ClockPane( hour, minute, 0 );
//        
//        c.setSecondHandVisibility(false);
//        c.paintClock();
//        
//        Text time = new Text(c.getHour() + ":" + c.getMinute() + ":" + c.getSecond());
//        time.setX(220 / 2);
//        time.setY(265);
//        
//        c.getChildren().add(time);
//        
//        Scene scene = new Scene(c, 280,280 );
//        primaryStage.setTitle("Clock with no second hand");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        //  14.29  Display the marble machine...
        
        Pane pane = new Pane();
        
        Polyline poly = new Polyline();
        ObservableList<Double> list = poly.getPoints();
        poly.setStroke(Color.BLACK);
        
        double polyPts[] = { 
            180, 40,
            180, 80,
            60, 320,
            60, 390,
            340,390,
            340,320,
            220, 80,
            220, 40
        };
        
        Circle peg1 = new Circle(200, 100, 8);
        peg1.setFill(Color.MAROON);
        
        for(int n = 1, h = 36, w = 17; n < 7; n++, h += 36, w += 17) {
            double x = peg1.getCenterX();
            double y = peg1.getCenterY();
            Circle peg = new Circle(x - w, y + h, 8);
            peg.setFill(Color.MAROON);
            pane.getChildren().add(peg);
            
            if (n == 6) {
            pane.getChildren().add(new Line(peg.getCenterX(), peg.getCenterY() + peg.getRadius(),
                        peg.getCenterX(), 390));
            }
            
            for(int i = 0, space = 35; i < n; i++, space += 35) {
                Circle pegs = new Circle(peg.getCenterX() + space, peg.getCenterY(), 8);
                pegs.setFill(Color.MAROON);
                pane.getChildren().add(pegs);
                
                if(n == 6) {
                    Line slots = new Line(pegs.getCenterX(), pegs.getCenterY() + pegs.getRadius(),
                        pegs.getCenterX(), 390);
                    pane.getChildren().add(slots);
                }
            }
        }
        
        for(double d : polyPts)
            list.add(d);
        
        pane.getChildren().addAll(poly, peg1);
        
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Marble machine.");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }  // end of start
    
    
    

        //  14.24  Make Clock with second hands...

        public static void getClock(Pane p, int x, int y, int r, int[] positions) {

            Circle clock = new Circle(x, y, r);
            clock.setStroke(Color.BLACK);
            clock.setFill(Color.TRANSPARENT);

            Text twelve = new Text("12");
            twelve.setX(x - 10);
            twelve.setY(y - (r - 12));

            Text three = new Text("3");
            three.setX(x + (r - 10));
            three.setY(y + 5);

            Text six = new Text("6");
            six.setX(x - 10);
            six.setY(y + (r - 10));

            Text nine = new Text("9");
            nine.setX(x - (r - 10));
            nine.setY(y + 5);

            // make the hands...
            for(int i = 0, j = 30; i < 3; i++, j += 20) {
                int divisor = i == 0 ? 12 : 60;

                // adjust for 24 hour clock...
                if(i == 0)
                    if(positions[i] > 12)
                        positions[i] -= 12;

                // draw the hands...
                double ptOnClock = positions[i];
                double xPt = clock.getCenterX() + j * Math.sin(ptOnClock * (2 * Math.PI / divisor));
                double yPt = clock.getCenterY() - j * Math.cos(ptOnClock * (2 * Math.PI / divisor));

                Line hand = new Line(clock.getCenterX(), clock.getCenterY(), xPt, yPt);
                p.getChildren().add(hand);
            }

            p.getChildren().addAll(clock, twelve, three, six, nine);

    }
    
    // 14.23  Rectangles...
    
    public static String getRelationship(Rectangle rec1, Rectangle rec2) {
        String ans = "";
        
        double rec1Rt = rec1.getX() + rec1.getWidth();
        double rec1Lft = rec1.getX();
        double rec1Top = rec1.getY();
        double rec1Btm = rec1.getY() + rec1.getHeight();
        
        double rec2Rt = rec2.getX() + rec2.getWidth();
        double rec2Lft = rec2.getX();
        double rec2Top = rec2.getY();
        double rec2Btm = rec2.getY() + rec2.getHeight();
        
        System.out.println("rec1Lft: " + rec1Lft);
        System.out.println("rec1Rt: " + rec1Rt);
        System.out.println("rec1Top: " + rec1Top);
        System.out.println("rec1Btm: " + rec1Btm);
        
        System.out.println("rec2Lft: " + rec2Lft);
        System.out.println("rec2Rt: " + rec2Rt);
        System.out.println("rec2Top: " + rec2Top);
        System.out.println("rec2Btm: " + rec2Btm);
        
        
        if(rec1Lft < rec2Lft && rec1Rt > rec2Rt && 
                rec1Top < rec2Top && rec1Btm > rec2Btm)
            ans = "One rectangle is contained in another";
        else if(rec1Lft > rec2Lft && rec1Rt < rec2Rt && 
                rec1Top > rec2Top && rec1Btm < rec2Btm)
            ans = "One rectangle is contained in another";
        else if( rec1Btm < rec2Top || rec1Lft > rec2Rt || rec1Rt < rec2Lft || rec1Top > rec2Btm || 
                 rec2Btm < rec1Top || rec2Lft > rec1Rt || rec2Rt < rec1Lft || rec2Top > rec1Btm )
            ans = "The rectangles do not overlap";
        else
            ans = "The rectangles overlap";
        
        return ans;
    }
    
    // 14.22
    public static void drawPointsNoFill(double aX, double aY, 
        double bX, double bY, Pane pane) {
               
        Circle a = new Circle(aX, aY, 15);
        Circle b = new Circle(bX, bY, 15);

        Line line = new Line(a.getCenterX(), a.getCenterY(), b.getCenterX(), b.getCenterY());
        a.setFill(Color.WHITE);
        b.setFill(Color.WHITE);
        a.setStroke(Color.BLACK);
        b.setStroke(Color.BLACK);
            
        Text one = new Text("1");
        one.setX(aX);
        one.setY(aY);
        
        Text two = new Text("2");
        two.setX(bX);
        two.setY(bY);
        
        pane.getChildren().addAll( line, a, b, one, two);
    }
    
    // 14.21
    public static void drawPoints(double aX, double aY, 
            double bX, double bY, Pane pane) {
        Circle a = new Circle(aX, aY, 15);
        Circle b = new Circle(bX, bY, 15);
        
        Line line = new Line(a.getCenterX(), a.getCenterY(), b.getCenterX(), b.getCenterY());
        
        Text num = new Text(getDistanceStr(aX,aY,bX,bY));
        num.setX(200);
        num.setY(200);
        
        pane.getChildren().addAll(a, b, line, num);
    }
    
    
    // 14.20
    
    public static String getDistanceStr(double aX, double aY, double bX, double bY) {
        double distance = Math.sqrt(Math.pow(bX - aX, 2) + Math.pow(bY - aY, 2));
        return String.format("%1.4f", distance);
    }
    
    public static void drawArrowLine(double startX, double startY, 
            double endX, double endY, Pane pane) {
        
        Polyline arrow = new Polyline();
        ObservableList<Double> list = arrow.getPoints();
        double[] points = {
            startX, startY, endX, endY,
//            endX + 5, endY + 5,
//            endX, endY,
//            endX + 5, endY + 5
        };
        
       // Line arrowLine = new Line(startX, startY, endX, endY);
 
        for(double d : points)
            list.add(d);
        
        Line tip1 = new Line();
        tip1.setStartX(endX);
        tip1.setStartY(endY);
        tip1.setEndX(endX - 10);
        tip1.setEndY(endY - 10);
        
        Line tip2 = new Line();
        tip2.setStartX(endX);
        tip2.setStartY(endY);
        tip2.setEndX(endX - 10);
        tip2.setEndY(endY + 10);
        
        tip2.rotateProperty().bind(null);
        
        
        
        pane.getChildren().addAll(arrow, tip1, tip2);
        
    }
    
    public static double getDistance(double startX, double startY,
            double endX, double endY) {
        double ans = 0;
        
        ans = Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
        
        return ans;
    }
    
}  // end of class