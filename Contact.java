public class Contact {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String ADDRESS;
    private String CITY;
    private String STATE;
    private String zip;
    private String PHONE_NUMBER;
    private String EMAIL_ID;

    public Contact() {
    }

    public Contact(String FIRST_NAME, String LAST_NAME, String ADDRESS, String CITY, String STATE, String zip, String PHONE_NUMBER, String EMAIL_ID) {
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.ADDRESS = ADDRESS;
        this.CITY = CITY;
        this.STATE = STATE;
        this.zip = zip;
        this.PHONE_NUMBER = PHONE_NUMBER;
        this.EMAIL_ID = EMAIL_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public String getCITY() {
        return CITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public String getZip() {
        return zip;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public String getEMAIL_ID() {
        return EMAIL_ID;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public void setEMAIL_ID(String EMAIL_ID) {
        this.EMAIL_ID = EMAIL_ID;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", CITY='" + CITY + '\'' +
                ", STATE='" + STATE + '\'' +
                ", zip='" + zip + '\'' +
                ", PHONE_NUMBER='" + PHONE_NUMBER + '\'' +
                ", EMAIL_ID='" + EMAIL_ID + '\'' +
                '}';
    }
}