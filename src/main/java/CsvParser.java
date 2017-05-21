import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;

/**
 * Created by sarahweisser on 5/21/17.
 */
public class CsvParser {

    private String fileInput;
    private ArrayList<String> licenseList = new ArrayList<String>();
    private ArrayList<DriversLicense> licenses = new ArrayList<DriversLicense>();

    public void readFile(String fileName) throws FileNotFoundException {
        BufferedReader reader = null;
        FileReader fileReader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException fnfe) {
            System.err.println(fnfe);
        }

        String input = "";
        String currentLine;
        try {
            while ((reader.readLine()) != null) {
                currentLine = reader.readLine();
                licenseList.add(currentLine);
            }
        }
        catch(IOException ioe){
            System.err.println(ioe);
        }
        fileInput = input;
    }

    public void createLicenses(String fileName) throws FileNotFoundException {
        readFile(fileName);
        for (int i = 0; i < licenseList.size(); i++) {
            String[] info = licenseList.get(i).split(",");
            DriversLicense dl = new DriversLicense();

            dl.setLastName(info[0]);
            dl.setFirstName(info[1]);
            dl.setAddress(info[2]);
            dl.setCity(info[3]);
            dl.setState(info[4]);
            dl.setLicenseNumber(info[5]);
            dl.setDateOfBirth(info[6]);
            dl.setIssueDate(info[7]);
            dl.setExpirationDate(info[8]);
            dl.setSex(info[9]);
            dl.setEyeColor(info[10]);
            dl.setHeight(info[11]);
            dl.setOrganDonor(info[12]);
            dl.setLicenseClass(info[13]);

            System.out.println(dl.showInfo());
        }
    }

}
