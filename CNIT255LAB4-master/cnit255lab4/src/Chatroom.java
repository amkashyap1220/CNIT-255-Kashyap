public class Chatroom {
    private Person CurrentPerson;
    private Person p1, p2;
    private String CurrentMessage,CurrentQuestion;

    public Chatroom(){
        p1 = new Person("Alex", "M","Kashyap","0030555960",
                "17 Bunting Ln.", "n/a", "Napervile",
                "IL", "60565","USA","kashyap4@purdue.edu","6306217505");


        p2 = new Person("Maggie", "Lenora","Sanborn","0130235460",
                "14 Road st.", "Apt. 304", "Eilvrepan",
                "CA", "10555","USA","Sanborn4@purdue.edu","1234567890");

    }

    public String getCurrentQuestion() {
        return CurrentQuestion;
    }

    public void setCurrentQuestion(String currentQuestion) {
        CurrentQuestion = currentQuestion;
    }

    public String getCurrentMessage() {
        return CurrentMessage;
    }

    public void setCurrentMessage(String currentMessage) {
        CurrentMessage = currentMessage;
    }

    public Person getP2() {
        return p2;
    }

    public Person getP1() {
        return p1;
    }

    public Person getCurrentPerson() {
        return CurrentPerson;
    }

    public  void setCurrentPerson(Person currentPerson) {
        CurrentPerson = currentPerson;
    }
}
