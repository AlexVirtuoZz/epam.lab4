package lab4.epam;

/**
 * Created by virtuoz on 12.05.16.
 */
public class Book {
    //All needed values declare
    private int id;
    private String firstName;
    private String secondName;
    private String thirdName;
    private String abbreviation;
    private String nickName;
    private String comment;
    private String groupName;
    private String homePhoneNumber;
    private String cellPhoneNumber;
    private String email;
    private String skype;
    private String address;
    private String index, city, street, houseNumber, flatNumber;
    private String birthday;
    private String lastUpdate;
    private Group group;

    //All needed setters and getters
    public void setGroup(String groupName){ this.group = Group.valueOf(groupName); }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getComment() {
        return comment;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public String getIndex() {
        return index;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

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

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getAbbreviation() { return this.abbreviation; }

    //Regular expressions for correct data input
    //Regex for name, second name and middle name. Only letters with first letter uppercase
    String regexAbbreviation = "[A-Z][a-z]+";
    //Regex for nickname. Must start with letter or number and may contain one symbol
    String regexNickName = "[A-Za-z0-9]+[\\._-]?[A-Za-z0-9]*";
    //Regex for comment. Any input is available
    String regexComment = ".*";
    //Regex for phone numbers. Only digits. Must start with ukrainian phone code
    String regexPhoneNumber = "\\+380\\d{9}";
    //Regex for email
    String regexEmail = "[A-Za-z0-9]+[\\._-]?[A-Za-z0-9]*\\@[a-z]+\\.[a-z]+";
    //Regex for skype is the same with nickname's
    String regexSkype = regexNickName;
    //Regex for index. Consist of 5 digits.
    String regexIndex = "\\d{5}";
    //Regex for city is the same with name's
    String regexCity = regexAbbreviation;
    //Regex for street. Should contain 3 letter of description
    String regexStreet = "[A-Z][a-z]+\\s[a-z]{3}";
    //Regex for flat number. Can't start with 0
    String regexFlatNumber = "[1-9]\\d*";
    //Regex for house number. Can't start with 0. May contain 1 letter , '/' and more digits
    String regexHouseNumber = "[1-9]\\d*[A-Za-z]?/?[1-9]?" ;
    //Regex for group. Consist of Group class values.
    String regexGroup = "Family|Job|Friends";
    //Regex for date. Day can only start with 0-3. Month can only start with 0-1. Year can start with 1-2.
    String regexDates = "[0123]\\d{1}\\.[01]\\d{1}\\.[12][019]\\d{2}";

    //A method to set address with all available parameters
    public void concatFullAddress(){
        address = null;
        address = new StringBuilder().append(index).append(" ,").append(city).append(" ,").append(street).append(" ,").append(houseNumber).append(" ,").append(flatNumber).toString();
    }
    //A method to set address with only city, street and house number
    public void concatShortAddress(){
        address = null;
        address = new StringBuilder().append(city).append(" ,").append(street).append(" ,").append(houseNumber).toString();
    }
    //A method to set an abbreviation, including second name, and first letters of the first and middle name
    public void concatAbbreviation(){
        abbreviation = null;
        abbreviation = new StringBuilder().append(secondName).append(" ").append(firstName.charAt(0)).append(". ").append(thirdName.charAt(0)).append(".").toString();
    }
    //A method to display short information  (abbreviation, nickname, address, email and cellphone number)
    @Override
    public String toString(){
        return new StringBuilder(abbreviation).append("\n"+nickName).append("\n"+address).append("\n"+email).append("\n"+cellPhoneNumber).toString();
    }
}
