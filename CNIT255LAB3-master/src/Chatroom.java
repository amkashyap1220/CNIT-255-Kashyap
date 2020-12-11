public class Chatroom {
    private Person CurrentPerson;
    private String CurrentMessage,CurrentQuestion;

    public Chatroom(){

    }

    public Person getCurrentPerson() {
        return CurrentPerson;
    }

    public  void setCurrentPerson(Person currentPerson) {
        CurrentPerson = currentPerson;
    }
}
