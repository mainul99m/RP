package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.plaf.SplitPaneUI;
import java.io.IOException;

public class Main extends Application {

    static BorderPane mainLayout;
    Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 800, 600));
//        primaryStage.show();
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("RPS");
        primaryStage.setMinWidth(1000.0);
        primaryStage.setMinWidth(600.0);

        showMainView();
        showHomeScreen();
//        showResultGeneratorInput();
    }

    private void showMainView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("mainMenu.fxml"));
        mainLayout =loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void showHomeScreen() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("homeScreen.fxml"));
        AnchorPane mainItem = loader.load();
        mainLayout.setCenter(mainItem);

    }

    public static void showResultGeneratorInput() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("../resultOutput/resultGeneratorInput.fxml"));
        AnchorPane mainItem = loader.load();
        mainLayout.setCenter(mainItem);
    }

    public static void showResultViewer() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("../resultOutput/resultViewer.fxml"));
        AnchorPane mainItem = loader.load();
        mainLayout.setCenter(mainItem);
    }

    public static void showResultInputInfo() throws  Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("../resultInput/resultInputInfo.fxml"));
        AnchorPane mainItem = loader.load();
        mainLayout.setCenter(mainItem);
    }

    public static void showTheoryResultInput() throws  Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("../resultInput/theoryResultInput.fxml"));
        AnchorPane mainItem = loader.load();
        mainLayout.setCenter(mainItem);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
