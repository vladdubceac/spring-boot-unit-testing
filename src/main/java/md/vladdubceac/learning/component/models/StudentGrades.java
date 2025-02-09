package md.vladdubceac.learning.component.models;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Component
public class StudentGrades {

    List<Double> mathGradeResults;

    public StudentGrades() {
    }

    public StudentGrades(List<Double> mathGradeResults) {
        this.mathGradeResults = mathGradeResults;
    }

    public double addGradeResultsForSingleClass(List<Double> grades){
        double result = 0;
        for(double grade : grades){
            result += grade;
        }
        return result;
    }

    public double findGradePointAverage(List<Double> grades){
        int lengthOfGrades = grades.size();
        double sum = addGradeResultsForSingleClass(grades);
        double result = lengthOfGrades!=0 ? sum / lengthOfGrades : 0;

        // round function
        BigDecimal resultRound = BigDecimal.valueOf(result);
        resultRound = resultRound.setScale(2, RoundingMode.HALF_UP);
        return resultRound.doubleValue();
    }

    public Boolean isGradeGreater(double gradeOne, double gradeTwo){
        if(gradeOne > gradeTwo){
            return true;
        }
        return false;
    }

    public Object checkNull(Object obj){
        if(obj!=null){
            return obj;
        }
        return null;
    }

    public List<Double> getMathGradeResults() {
        return mathGradeResults;
    }

    public void setMathGradeResults(List<Double> mathGradeResults) {
        this.mathGradeResults = mathGradeResults;
    }

    @Override
    public String toString() {
        return "StudentGrades{" +
                "mathGradeResults=" + mathGradeResults +
                '}';
    }
}
