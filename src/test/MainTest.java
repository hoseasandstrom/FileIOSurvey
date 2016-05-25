import com.studenttheironyard.Beer;
import com.studenttheironyard.Main;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

/**
 * Created by hoseasandstrom on 5/25/16.
 */
public class MainTest {
    static final String TEST_FILE = "test.json";

    @Test

    public void saveAndLoad() throws FileNotFoundException {
        Beer beer = new Beer();
        beer.beer = "Test Beer";
        beer.type = "Test Type";
        beer.brewer = "Test Brewer";
        beer.company = "Test Company";
        beer.drunk = 10;

        Main.saveSurvey(beer, TEST_FILE);
        Beer newBeer = Main.loadSurvey(TEST_FILE);

        assertTrue(newBeer != null);
        assertTrue(newBeer.beer.equals(beer.beer));
        assertTrue(newBeer.type.equals(beer.type));
        assertTrue(newBeer.brewer.equals(beer.brewer));
        assertTrue(newBeer.company.equals(beer.company));
        assertTrue(newBeer.drunk == 10);


    }

}