import java.util.Scanner;
public class Run {

    public static void main(String[] args){
        Chatroom room = new Chatroom();
        Person p1 = room.getP1();
        Person p2 = room.getP2();
        System.out.println("The people chatting are "+p1.getNameInfo().getL()+ " and "+p2.getNameInfo().getL());
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
                System.out.println(room.getCurrentPerson().getNameInfo().getL()+" said to " +r +": "+room.getCurrentPerson().receiveMessage());
            }else{
                k.nextLine();
                room.getCurrentPerson().sendQuestion(k.nextLine());
                System.out.println(room.getCurrentPerson().getNameInfo().getL()+" said to " +r +": "+room.getCurrentPerson().receiveQuestion());
            }




        }while(k.next().toUpperCase().equals("Y"));
    }
}
