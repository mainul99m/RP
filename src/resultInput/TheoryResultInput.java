package resultInput;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Created by mainu on 3/2/2017.
 */
public class TheoryResultInput {
    @FXML
    public Label lblTotalClass;
    @FXML
    public static Label lblTTMarks;
    @FXML
    Label lblPartAMarks;
    @FXML
    Label lblPartBMarks;

    @FXML
    void update(){
        lblTotalClass.setText("Total Class:" + ResultInputInfo.totalClass);
    }


}
