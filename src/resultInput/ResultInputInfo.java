package resultInput;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.Main;

/**
 * Created by mainu on 3/2/2017.
 */
public class ResultInputInfo {
    public static int totalClass, totalTTMarks, partAMarks, partBMarks, labFullMarks;

    @FXML
    public TextField tfTotalClass;
    @FXML
    TextField tfTotalTTMarks;
    @FXML
    TextField tfPartAMarks;
    @FXML
    TextField tfPartBMarks;
    @FXML
    TextField tfLabFullMarks;

    @FXML
    static Label lblTest;
    @FXML
    Label teasdf;


    int getTotalClass(){
        return Integer.parseInt(tfTotalClass.getText());
    }

    int getTotalTTMarks(){
        return Integer.parseInt(tfTotalTTMarks.getText());
    }

    int getPartAMarks(){
        return Integer.parseInt(tfPartAMarks.getText());
    }
    int getPartBMarks(){
        return Integer.parseInt(tfPartBMarks.getText());
    }
    int getLabFullMarks(){
        return Integer.parseInt(tfLabFullMarks.getText());
    }


    @FXML
    void theoryGo(){
        try {
            System.out.println("Part A: " + getPartAMarks());
            System.out.println("Part B: " + getPartBMarks());
            totalClass = getTotalClass();
            Main.showTheoryResultInput();
        }catch (Exception e){
            System.out.println(""+e);
            System.out.println("Please input valid Number");

        }

    }

    @FXML
    void labInputMarks(){
        System.out.println("Lab full marks: " + getLabFullMarks());
    }

    @FXML
    void labInputGrade(){
        System.out.println("Lab Input Grade");
    }


}
