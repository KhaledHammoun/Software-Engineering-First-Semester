package mseProg3.src;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class HyperharmonicSeries {
    public double hyperharmonicSeries(double n, double p){

        double result = 0;
        for (int i = 1; i < (int)n; i++)
        {
            result += 1/(Math.pow(i,p));
        }

        return result;
    }
}
