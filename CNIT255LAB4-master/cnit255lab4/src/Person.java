public class Person {
    private Name nameInfo;
    private Address addressInfo;
    private Contact contactInfo;
    private String message,question;
    private String PUID;

    public Person(String first, String middle, String last, String PUID,
                  String streetAddress, String streetAddress2,String city,String state,
                  String zipCode,String country,String email, String phoneNumber){
        nameInfo = new Name(first, middle,last);
        contactInfo = new Contact(email,phoneNumber);
        addressInfo = new Address(streetAddress, streetAddress2, city, state, zipCode, country);
        this.PUID = PUID;
    }

    public void sendMessage(String message){
        this.message = message;
    }

    public String receiveMessage(){
        return message;
    }

    public void sendQuestion(String question){
        this.question = question;
    }

    public String receiveQuestion(){
        return question;
    }

    public String getPUID() {
        return PUID;
    }
    public void setPUID(String PUID) {
        this.PUID = PUID;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public Address getAddressInfo() {
        return addressInfo;
    }

    public Name getNameInfo() {
        return nameInfo;
    }
}
