public class Contact {
    private String email,phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String email, String phoneNumber){
        this.email = email;
        this.phoneNumber = phoneNumber;

    }
}
