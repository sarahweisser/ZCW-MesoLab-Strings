/**
 * Created by sarahweisser on 5/21/17.
 */

/* LAST_NAME,FIRST_NAME,ADDR,STATE,LICENSE_NUMBER,D.O.B.,ISS_D,EXP_D,SEX,EYES,HGT,ORGANDONOR,CLASS*/
public class DriversLicense {

    private String lastName;
    private String firstName;
    private String address;
    private String state;
    private String licenseNumber;
    private String dateOfBirth;
    private String issueDate;
    private String expirationDate;
    private String sex;
    private String eyeColor;
    private String height;
    private String organDonor;
    private String licenseClass;

    public DriversLicense() {

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    public String getIssueDate() {
        return issueDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public String getEyeColor() {
        return eyeColor;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    public String getHeight() {
        return height;
    }

    public void setOrganDonor(String organDonor) {
        this.organDonor = organDonor;
    }
    public String getOrganDonor() {
        return organDonor;
    }

    public void setLicenseClass(String licenseClass) {
        this.licenseClass = licenseClass;
    }
    public String getLicenseClass() {
        return licenseClass;
    }



}
