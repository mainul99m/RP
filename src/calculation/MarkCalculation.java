package calculation;

/**
 * Created by mainu on 3/2/2017.
 */
public class MarkCalculation {


    //Calculate the attendance Marks
    public static int getAttendenceNumber(int attendedClass, int totalClass){
        if(getPercentage(attendedClass, totalClass) >= 95)
            return 10;
        if(getPercentage(attendedClass, totalClass) >= 90)
            return 9;
        if(getPercentage(attendedClass, totalClass) >= 85)
            return 8;
        if(getPercentage(attendedClass, totalClass) >= 80)
            return 7;
        if(getPercentage(attendedClass, totalClass) >= 75)
            return 6;
        if(getPercentage(attendedClass, totalClass) >= 70)
            return 5;
        if(getPercentage(attendedClass, totalClass) >= 65)
            return 4;
        if(getPercentage(attendedClass, totalClass) >= 60)
            return 3;
        return 0;
    }


    public static int getPercentage(int attendedClass, int totalClass){
        return (attendedClass/totalClass)*100;
    }


    //TermTest
    public static int getTTMarks(int obtainedMarks, int totalMarks){
        return (obtainedMarks/totalMarks)*20;
    }

    //PartA and B
    public static int getWrittenExamMark(int obtainedPartA, int obtainedPartB, int totalPartA, int totalPartB){
        return ((obtainedPartA+obtainedPartB)/(totalPartA+totalPartB))*70;
    }
}
