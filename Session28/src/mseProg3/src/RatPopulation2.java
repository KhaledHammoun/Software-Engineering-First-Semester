package mseProg3.src;


public class RatPopulation2 {

    public int ratPopulation2(double time, double growthRate){
        double actualGrowth = 1;
        for (int i = 0; i < (int)time; i++)
        {
            actualGrowth *= growthRate;
        }
        return (int)Math.round(actualGrowth);
    }
}
