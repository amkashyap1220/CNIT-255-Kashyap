/**
 * Alexander Kashyap
 * 2/8/19
 * CNIT 25501
 **/

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
class TextHandler {

    public static boolean palindrome(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString().toLowerCase().equals(text.toLowerCase());
    }

    public static Stack findAllPalindrome(String text) {
        Stack<String> palindromes = new Stack();
        String newText = text.toLowerCase();
        for(int start = 0; start < newText.length(); start++){
            for(int look = start +2;look< newText.length();look++){
                if(newText.substring(start,look).equals(reverseText(newText.substring(start,look)))){
                    palindromes.push(newText.substring(start,look));
                }
            }
        }
        return palindromes;
        //this is a test
    }

    public static Stack searchText(String text, String search) {
        Stack<Integer> instances = new Stack();
        String tempText = text.toLowerCase();
        while (tempText.indexOf(search.toLowerCase()) != -1) {
            if (!instances.isEmpty()) {
                instances.push(tempText.indexOf(search) + instances.peek()+1);
            }else{
                instances.push(tempText.indexOf(search));
            }
            //System.out.println(instances.peek() + 1);
            tempText = text.substring(instances.peek() + 1);

        }

        return instances;
        //System.out.println(search + " showed up at index's:");
        //printText(instances);
    }

    public static String removeText(String remove,String text) {
        if(text.indexOf(remove) == -1){
            return remove + " is not in this string.";
        }
        return text.replace(remove, "");
    }
    public static String addText(String text,String add, int index){
        if (text.charAt(index)==' '){
            return text.substring(0, index)+" "+add+text.substring(index);
        }else if(text.charAt(index - 1)==' '){
            return text.substring(0, index)+add+" "+text.substring(index);}

        return text.substring(0, index)+" "+add+ " "+text.substring(index);
    }
    public static String reverseText(String text) {
        StringBuilder sb = new StringBuilder(text);

        return sb.reverse().toString();
    }

    public static String reverseEachWord(String text) {
        String newText = text;
        Queue<String> words = new LinkedList<>();

        while(newText.indexOf(" ") != -1){

            words.add(reverseText(newText.substring(0, newText.indexOf(" "))));
            newText = newText.substring(newText.indexOf(" ")+1);
        }
        words.add(reverseText(newText));

        String finalString ="";
        while(!words.isEmpty()){
            finalString += words.remove() + " ";
        }
        return finalString;
    }

    public static void printText(String str) {
        System.out.println(str);
    }

    public static void printText(Stack stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter any string: ");
        String text = scanner.nextLine();
        boolean go = true;
        do{

            System.out.println("\n-----------------------\n1. Is Palindrome\n2. Find all palindromes\n3. Search a text\n4. Remove a text\n5. Add a text\n6. Reverse the text\n7. Reverse each word\n8. Print the text\n-----------------------\n9. Change the input text\n10. Quit the program");
            System.out.print("\nOption: ");
            int choice = scanner.nextInt();
            if(choice ==1) {
                if (palindrome(text)) {
                    System.out.println(text + ", is a palindrome.");
                } else {
                    System.out.println(text + ", is NOT a palindrome.");
                }
            }else if(choice == 2) {
                printText(findAllPalindrome(text));
            }else if(choice ==3) {
                System.out.print("Please enter a search term: ");
                String search = scanner.next();
                System.out.println(search + " showed up at index's:");
                printText(searchText(text, search));
            }else if(choice ==4) {
                System.out.print("Please enter a remove term: ");
                String remove = scanner.next();
                printText(removeText(remove, text));
            }else if(choice ==5) {
                System.out.print("What do you want to add: ");
                String add = scanner.next();
                System.out.print("Where: ");
                int spot = scanner.nextInt();
                printText(addText(text,add,spot));
            }else if(choice ==6) {
                printText(reverseText(text));
            }else if(choice ==7) {
                printText(reverseEachWord(text));
            }else if(choice ==8) {
                printText(text);
            }else if(choice ==9) {
                System.out.print("Please enter any string: ");
                scanner.nextLine();
                text = scanner.nextLine();
            }else if(choice ==10) {
                go = false;
            }


        }while(go);
    }
}