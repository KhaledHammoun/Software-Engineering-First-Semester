package mseProg3.src;

import java.math.BigDecimal;

public class Loan {

    public int loan(double principal, double interest, double nrOfRepayments) {

        double result = principal;
        for (int i = 0; i < nrOfRepayments; i++)
        {
            result += result * interest;
        }
        result/= nrOfRepayments;
        return (int)Math.round(result);
    }

}
