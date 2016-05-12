package lab4.epam;

/**
 * Created by virtuoz on 12.05.16.
 */
public class Book {
    //
    public String firstName;
    public String secondName;
    public String thirdName;
    public StringBuilder fio;
    public String nickName;
    public String comment;
    public String group;
    public String homePhoneNumber;
    public String cellPhoneNumber;
    public String email;
    public String skype;
    public StringBuilder address;
    public String index, city, street, houseNumber, flatNumber;
    public String addDate;
    public String lastUpdate;
    private boolean recorded;

    public void record(){ this.recorded = true; }

    public boolean isRecorded(){ return this.recorded; }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public void setAddress(StringBuilder address) {
        this.address = address;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    String regexFio = "[A-Z][a-z]+";
    String regexNickName = "[A-Za-z0-9]+[\\._-]?[A-Za-z0-9]*";
    String regexComment = ".*";
    String regexHomePhoneNumber = "\\+38044\\d{7}";
    String regexCellPhoneNumber = "\\+380\\d{9}";
    String regexEmail = "[A-Za-z0-9]+[\\._-]?[A-Za-z0-9]*\\@[a-z]+\\.[a-z]+";
    String regexSkype = regexNickName;
    String regexIndex = "\\d{5}";
    String regexCity = regexFio;
    String regexStreet = "[A-Z][a-z]+\\s[a-z]+";
    String regexHouseNumber = "\\d{1,4}";
    String regexFlatNumber = regexHouseNumber;
    String regexDates = "\\d{2}\\.\\d{2}\\.\\d{4}";

    void concatFullAddress(){
        address = null;
        address.append(index).append(" ,").append(city).append(" ,").append(street).append(" ,").append(houseNumber).append(" ,").append(flatNumber);
    }
    void concatShortAddress(){
        address = null;
        address.append(city).append(" ,").append(street).append(" ,").append(houseNumber);
    }
    void concatFio(){
        fio = null;
        fio.append(secondName).append(" ").append(firstName.charAt(0)).append("\\. ").append(thirdName.charAt(0)).append("\\.");
    }
}
