package calculation;

import java.text.DecimalFormat;

/**
 * Created by mainu on 3/2/2017.
 */
public class CGCalculation {

    private double totalCredit, totalCG;

    //Calculate grade from Marks
    public static double calculateCG(int totalMarks){
        if (totalMarks >= 80) {
            return 4.0;
        }
        if (totalMarks >= 75) {
            return 3.75;
        }
        if (totalMarks >= 70) {
            return 3.5;
        }
        if (totalMarks >= 65) {
            return 3.25;
        }
        if (totalMarks >= 60) {
            return 3.0;
        }
        if (totalMarks >= 55) {
            return 2.75;
        }
        if (totalMarks >= 50) {
            return 2.5;
        }
        if (totalMarks >= 45) {
            return 2.25;
        }
        if (totalMarks >= 40) {
            return 2.0;
        }
        return 0.0;
    }


    public void add(double credit, double cg){
        if(cg>0){
            totalCredit += credit;
            totalCG += cg;
        }
    }

    public double getResult(){
        double result;
        result = totalCG/totalCredit;
        result = Double.parseDouble(new DecimalFormat("##.##").format(result));
        return result;
    }

    public double getTotalCredit(){
        return totalCredit;
    }

    public void reset(){
        totalCredit = 0;
        totalCG = 0;
    }

}
