package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        GridPane grid = new GridPane();
        Scene scene = new Scene(grid,420,420, Color.RED );
        primaryStage.setTitle("BasicCalc");
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);

//        scene.setFill(Color.web("#81c483"));
//
//
//        scene.setFill(new LinearGradient(
//                0, 0, 1, 1, true,                      //sizing
//                CycleMethod.NO_CYCLE,                  //cycling
//                new Stop(0, Color.web("#81c483")),     //colors
//                new Stop(1, Color.web("#fcc200")))
//        );


        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Label label = new Label();

        Button add = new Button("+");
        Button mul = new Button("X");
        Button sub = new Button("-");
        Button div = new Button("/");
        Button mod = new Button("%");
        Button sqrt = new Button("sqrt");
        Button clear = new Button("Clear");

        Text actionTarget = new Text();

        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int total = num1 + num2;

                actionTarget.setText(String.valueOf(total));
            }
        });

        mul.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int total = num1 * num2;

                actionTarget.setText(String.valueOf(total));
            }
        });

        sub.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int total = num1 - num2;

                actionTarget.setText(String.valueOf(total));
            }
        });

        div.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int total = num1 / num2;


                actionTarget.setText(String.valueOf(total));
            }
        });

        mod.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int total = num1 % num2;

                actionTarget.setText(String.valueOf(total));
            }
        });

        sqrt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int total = num1 + num2;
                int numSqrt = (int) Math.sqrt(total);

                actionTarget.setText(String.valueOf(numSqrt));
            }
        });

        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actionTarget.setText("");
                t1.setText("");
                t2.setText("");
            }
        });





        grid.add(t1, 0,0);
        grid.add(t2, 1, 0);
        grid.add(add, 0, 3);
        grid.add(mul,1,3 );
        grid.add(sub, 1,4);
        grid.add(div, 0, 4);
        grid.add(mod, 2,3);
        grid.add(sqrt, 2,4);
        grid.add(clear, 1, 8);
        grid.add(actionTarget, 1,6);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
