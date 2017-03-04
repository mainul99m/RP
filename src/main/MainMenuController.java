package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainMenuController {

    private Main main;

    @FXML
    public Label test;

    @FXML
    public void btnOne(ActionEvent e){
        System.out.println("Hello World");
        test.setText("FU");
    }

    @FXML
    void menuExit(ActionEvent e) throws Exception{
        System.out.println("set");
        Main.showResultGeneratorInput();
    }

    @FXML
    void menuGenerateResult(ActionEvent e) throws Exception{
        Main.showResultGeneratorInput();
    }

    @FXML
    void menuInputResult(ActionEvent e) throws  Exception{
        Main.showResultInputInfo();
    }
}
