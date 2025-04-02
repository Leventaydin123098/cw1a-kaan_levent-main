package gr.uop;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        CheckBox snapToGrid = new CheckBox("Snap to Grid");
        CheckBox showGrid = new CheckBox("Show Grid");
        VBox gridSettingsContent = new VBox(5, snapToGrid, showGrid);
        TitledPane gridSettingsPane = new TitledPane("Grid Settings", gridSettingsContent);
        gridSettingsPane.setCollapsible(false);
        

        
        Label horizontalLabel = new Label("Horizontal:");
        horizontalLabel.setAlignment(Pos.CENTER_RIGHT);
        TextField horizontalField = new TextField();
        horizontalField.setPrefWidth(60);
        HBox horizontalBox = new HBox(10, horizontalLabel,horizontalField);
        horizontalBox.setAlignment(Pos.CENTER_RIGHT);
        Label verticalLabel = new Label("Vertical:");
        verticalLabel.setAlignment(Pos.CENTER_RIGHT);
        TextField verticalField = new TextField();
        verticalField.setPrefWidth(60);
        HBox verticalBox = new HBox(10,verticalLabel,verticalField);
        verticalBox.setAlignment(Pos.CENTER_RIGHT);
        VBox gridDimensionsContent = new VBox(5, horizontalBox, verticalBox);
        TitledPane gridDimensionsPane = new TitledPane("Grid Dimensions", gridDimensionsContent);
        gridDimensionsPane.setCollapsible(false);

        Button btn1 = new Button("Ok");
        Button btn2 = new Button("Cancel");
        Button btn3 = new Button("Help");
        btn1.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);

        VBox buttonPane = new VBox(10, btn1, btn2, btn3);
        buttonPane.setAlignment(Pos.TOP_CENTER);
        buttonPane.setStyle(" -fx-padding: 11px;");

        HBox mainContent = new HBox(10, gridSettingsPane, gridDimensionsPane, buttonPane);
        mainContent.setStyle("-fx-padding: 10px;");
        mainContent.setAlignment(Pos.TOP_CENTER);

        Label statusBar = new Label("Status");
        statusBar.setStyle(" -fx-padding: 5px; -fx-border-color: gray;");
        statusBar.setMaxWidth(Double.MAX_VALUE);
        statusBar.setAlignment(Pos.BOTTOM_LEFT);

        BorderPane root = new BorderPane();
        root.setCenter(mainContent);
        root.setBottom(statusBar);

        Scene scene = new Scene(root, 500, 180);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Status Bar Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
