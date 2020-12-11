package lab6kashyap;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class Person implements BirthDateCalculator {
    private Name nameInfo;
    private Address addressInfo;
    private String Day,Month, Year;
    public Person(String first, String middle, String last,
                  String streetAddress, String streetAddress2,String city,String state,
                  String zipCode,String country,String Day,String Month, String Year){
        nameInfo = new Name(first, middle,last);
        //contactInfo = new Contact(email,phoneNumber);
        addressInfo = new Address(streetAddress, streetAddress2, city, state, zipCode, country);
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
        
    }

    public Long Calculate(){
        //Year, Month, Date
        
        int y =Integer.parseInt(Year);
        int m =Integer.parseInt(Month);
        int d =Integer.parseInt(Day);
       
        LocalDate birthDate = LocalDate.of(y, d,m);
        LocalDate currentDate = LocalDate.now();
        Long hi = ChronoUnit.YEARS.between(birthDate, currentDate);
    return hi;
    
    }

    public Address getAddressInfo() {
        return addressInfo;
    }

    public Name getNameInfo() {
        return nameInfo;
    }

    /**
     * @param addressInfo the addressInfo to set
     */
    public void setAddressInfo(Address addressInfo) {
        this.addressInfo = addressInfo;
    }

    /**
     * @return the Day
     */
    public String getDay() {
        return Day;
    }

    /**
     * @param Day the Day to set
     */
    public void setDay(String Day) {
        this.Day = Day;
    }

    /**
     * @return the Month
     */
    public String getMonth() {
        return Month;
    }

    /**
     * @param Month the Month to set
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * @return the Year
     */
    public String getYear() {
        return Year;
    }

    /**
     * @param Year the Year to set
     */
    public void setYear(String Year) {
        this.Year = Year;
    }
}
