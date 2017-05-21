import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by sarahweisser on 5/21/17.
 */
public class CsvParserTest {

    @Test
    public void readFileTest() throws FileNotFoundException {
        CsvParser parser = new CsvParser();
        //parser.readFile("/Users/sarahweisser/dev/labs/ZCW-MesoLab-Strings/src/main/resources/LicenseInfo");
        parser.createLicenses("/Users/sarahweisser/dev/labs/ZCW-MesoLab-Strings/src/main/resources/LicenseInfo");
    }

}
