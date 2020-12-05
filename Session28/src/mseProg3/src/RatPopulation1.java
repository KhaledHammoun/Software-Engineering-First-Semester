package mseProg3.src;



public class RatPopulation1 {
    public int ratPopulation(double size, double weeks) {
        for (int i = 0; i < (int)weeks; i++)
        {
            size += size*0.13;
        }

        return (int)Math.round(size);
    }
}
