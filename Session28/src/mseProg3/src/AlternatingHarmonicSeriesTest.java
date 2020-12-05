package mseProg3.src;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingHarmonicSeriesTest {

    @Test
    void alternatingHarmonicSeries() {
        AlternatingHarmonicSeries alternatingHarmonicSeries = new AlternatingHarmonicSeries();
        assertEquals(0.698172179310195, alternatingHarmonicSeries.alternatingHarmonicSeries(100));
    }
}