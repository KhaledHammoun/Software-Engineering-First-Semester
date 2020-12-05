package mseProg3.src;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class AlternatingHarmonicSeries
{

  public double alternatingHarmonicSeries(double n)
  {
    double result = 0;

    for (int i = 1; i < (int) n; i++)
    {
      result += (Math.pow(-1, i+1))/i;
    }
    return result;
  }
}
