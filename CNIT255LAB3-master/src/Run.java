import java.util.Scanner;
public class Run {

    public static void main(String[] args){
        Person p1 = new Person("Alex", "Mabry", "Kashyap", "0030555960");
        Person p2 = new Person("Maggie", "Lenora", "Sanborn", "1234567890");
        Chatroom room = new Chatroom();
        System.out.println("The people chatting are "+p1.getLast()+ " and "+p2.getLast());
        Scanner k = new Scanner(System.in);
        do{
            System.out.println("Please begin the chat!");
            System.out.print("Sender name: ");
            String name = k.next();
            if(name.toUpperCase().equals("KASHYAP")){
                room.setCurrentPerson(p1);
            }else if(name.toUpperCase().equals("SANBORN")){
                room.setCurrentPerson(p2);
            }else{
                System.out.println("That is not a valid name.");break;
            }

            System.out.print("\nReceiver name: ");
            String r =k.next();
            System.out.print("\nQuestion or Message: ");
            String type = k.next();
            System.out.print("\nText: ");
            if(type.equalsIgnoreCase("message")) {
                k.nextLine();
                room.getCurrentPerson().sendMessage(k.nextLine());
                System.out.println(room.getCurrentPerson().getLast()+" said to " +r +": "+room.getCurrentPerson().receiveMessage());
            }else{
                k.nextLine();
                room.getCurrentPerson().sendQuestion(k.nextLine());
                System.out.println(room.getCurrentPerson().getLast()+" said to " +r +": "+room.getCurrentPerson().receiveQuestion());
            }




        }while(k.next().toUpperCase().equals("Y"));
    }
}
