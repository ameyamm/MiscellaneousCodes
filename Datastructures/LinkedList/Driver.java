import java.util.Scanner;

public class Driver
{
    private static Scanner reader = new Scanner(System.in) ; 

    public static void main(String [] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        
        boolean quit = false ; 
        while(!quit)
        {
            displayMenu() ; 

            String choice = reader.nextLine() ; 

            switch(choice.charAt(0))
            {
                case 'a': 
                    processAdd(linkedList) ; 
                    break ;
                case 'r':
                    processReverse(linkedList) ; 
                    break ;
                case 'p':
                    processPrint(linkedList) ; 
                    break ;
                case 'q':
                    quit = true ; 
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    private static void displayMenu()
    {
        System.out.println("Menu:");
        System.out.println("(a)dd ");
        System.out.println("(r)everse");
        System.out.println("(p)rint");
        System.out.println("(q)uit");
        System.out.print("Enter Choice: ");
    }

    private static void processAdd(LinkedList<Integer> list)
    {
        Integer i = null ; 
        while(true)
        {
            System.out.print("Enter an integer to add: ");
            String input = reader.nextLine() ; 
            try 
            {
                i = Integer.parseInt(input);
                break ;
            }
            catch(NumberFormatException exception)
            {
                System.out.println("Enter an integer");
            }
        }
        list.add(i) ; 
        System.out.println("Integer added to list");
    }
    
    private static void processReverse(LinkedList<?> list)
    {
        list.reverse() ; 
        System.out.println("List reversed!");
    }

    private static void processPrint(LinkedList<?> list)
    {
        System.out.println("Linked List:");
        list.print() ; 
    }

}
