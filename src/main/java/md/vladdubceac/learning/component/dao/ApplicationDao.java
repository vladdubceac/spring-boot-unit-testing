package md.vladdubceac.learning.component.dao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class ApplicationDao {

    public double addGradeResultsForSingleClass(List<Double> grades) {
        double result = 0;
        for (double grade : grades) {
            result += grade;
        }
        return result;
    }

    public double findGradePointAverage(List<Double> grades) {
        int lengthOfGrades = grades.size();
        double sum = addGradeResultsForSingleClass(grades);
        double result = sum / lengthOfGrades;

        BigDecimal resultRound = BigDecimal.valueOf(result);
        resultRound = resultRound.setScale(2, RoundingMode.HALF_UP);
        return resultRound.doubleValue();
    }

    public Object checkNull(Object object){
        if(object!=null){
            return object;
        }
        return null;
    }
}
