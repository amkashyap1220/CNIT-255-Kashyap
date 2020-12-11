public class Person {
    private String first, middle, last;
    private String message,question;
    private String PUID;

    public Person(String first, String middle, String last, String PUID){
        this.first = first;
        this.middle = middle;
        this.last = last;
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

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

}
