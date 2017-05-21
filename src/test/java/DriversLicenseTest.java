import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/21/17.
 */
public class DriversLicenseTest {

    DriversLicense suspended;

    @Before
    public void createTestLicense() {
        suspended = new DriversLicense();
        suspended.setLastName("Doe");
        suspended.setFirstName("Joan");
        suspended.setAddress("1105 North Market Street");
        suspended.setCity("Wilmington");
        suspended.setState("DE");
        suspended.setLicenseNumber("7654321");
        suspended.setDateOfBirth("07/02/1947");
        suspended.setIssueDate("10/23/2015");
        suspended.setExpirationDate("08/25/2023");
        suspended.setSex("F");
        suspended.setEyeColor("Hazel");
        suspended.setHeight("5'11");
        suspended.setOrganDonor("Y");
        suspended.setLicenseClass("D");
    }

    @Test
    public void licenseInfoTest() {
        // given
        String expected = "Doe,Joan,1105 North Market Street,Wilmington,DE,7654321,07/02/1947,10/23/2015,08/25/2023,F,Hazel,5'11,Y,D";

        // when
        String actual = suspended.showInfo();

        // then
        Assert.assertEquals(expected, actual);
    }
}
