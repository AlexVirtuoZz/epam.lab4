package lab4.epam;

/**
 * Created by virtuoz on 12.05.16.
 */
public class Book {
    //All needed values declare
    private String firstName;
    private String secondName;
    private String thirdName;
    private String fio;
    private String nickName;
    private String comment;
    private String group;
    private String homePhoneNumber;
    private String cellPhoneNumber;
    private String email;
    private String skype;
    private String address;
    private String index, city, street, houseNumber, flatNumber;
    private String createDate;
    private String lastUpdate;

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

    public String getFio() { return this.fio; }

    String regexFio = "[A-Z][a-z]+";
    String regexNickName = "[A-Za-z0-9]+[\\._-]?[A-Za-z0-9]*";
    String regexComment = ".*";
    String regexPhoneNumber = "\\+380\\d{9}";
    String regexEmail = "[A-Za-z0-9]+[\\._-]?[A-Za-z0-9]*\\@[a-z]+\\.[a-z]+";
    String regexSkype = regexNickName;
    String regexIndex = "\\d{5}";
    String regexCity = regexFio;
    String regexStreet = "[A-Z][a-z]+\\s[a-z]+";
    String regexHouseNumber = "\\d{1,4}";
    String regexFlatNumber = regexHouseNumber;
    String regexDates = "\\d{2}\\.\\d{2}\\.\\d{4}";

    public void concatFullAddress(){
        address = null;
        address = new StringBuilder().append(index).append(" ,").append(city).append(" ,").append(street).append(" ,").append(houseNumber).append(" ,").append(flatNumber).toString();
    }
    public void concatShortAddress(){
        address = null;
        address = new StringBuilder().append(city).append(" ,").append(street).append(" ,").append(houseNumber).toString();
    }
    public void concatFio(){
        fio = null;
        fio = new StringBuilder().append(secondName).append(" ").append(firstName.charAt(0)).append(". ").append(thirdName.charAt(0)).append(".").toString();
    }
    @Override
    public String toString(){
        return new StringBuilder(fio.toString()).append("\n"+nickName).append("\n"+skype).append("\n"+address).append("\n"+email).append("\n"+cellPhoneNumber).toString();
    }
}
