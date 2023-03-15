import java.util.LinkedList;
import java.util.Scanner;

public class ContactList_ghai {
    public static void main(String[] args){
        LinkedList<String> name = new LinkedList<String>();
        LinkedList<String> email = new LinkedList<String>();
        LinkedList<Integer> number = new LinkedList<Integer>();
        while(true){
            System.out.println("******************************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mal Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("******************************");
            Scanner comand = new Scanner(System.in);
            System.out.println("please input command letter ");
            Character com = comand.next().toLowerCase().charAt(0);

            if (com == 'a') {
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("please input name ");
                    String x = input.nextLine();
                    Scanner in = new Scanner(System.in);
                    System.out.println("please input email ");
                    String y = in.nextLine();
                    Scanner put = new Scanner(System.in);
                    System.out.println("please input number ");
                    int z = put.nextInt();
                    int indexname = name.indexOf(x);
                    if(x != "" && y != ""){
                        if(indexname == -1){
                            name.add(x);
                            email.add(y);
                            number.add(z);
                            System.out.println("contact added");
                        }else{System.out.println("contact name already exist");}}
                    else{System.out.println("please enter non empty name or email");}
                }catch (Exception e){System.out.println("an error occurred");}
            }
            else if (com == 'd') {
                Scanner remove = new Scanner(System.in);
                System.out.println("please input name ");
                String rem = remove.nextLine();
                int index1 = name.indexOf(rem);
                if (index1 != -1) {
                    name.remove(index1);
                    email.remove(index1);
                    number.remove(index1);
                    System.out.println("contact removed");
                } else {
                    System.out.println("the contact does not exist");
                }
            }
            else if (com == 'e') {
                Scanner emailsearch = new Scanner(System.in);
                System.out.println("please input name ");
                String esrch = emailsearch.nextLine();
                int index2 = email.indexOf(esrch);
                if (index2 != -1) {
                    System.out.println("the contact name is " +name.get(index2));
                    System.out.println("the contact email is " +email.get(index2));
                    System.out.println("the contact number is " +number.get(index2));
                } else {
                    System.out.println("email nonexistent");
                }
            }
            else if (com == 's') {
                Scanner namesearch = new Scanner(System.in);
                System.out.println("please input name ");
                String nsrch = namesearch.nextLine();
                int index3 = email.indexOf(nsrch);
                if (index3 != -1) {
                    System.out.println("the contact name is " +name.get(index3));
                    System.out.println("the contact email is " +email.get(index3));
                    System.out.println("the contact number is " +number.get(index3));
                } else {
                    System.out.println("contact nonexistent");
                }
            }
            else if (com == 'p') {
                if(name.size()>0){
                    for (int i = 0; i < name.size(); i++) {
                        System.out.println((i+1) + ") contact");
                        System.out.println("the contact name is " +name.get(i));
                        System.out.println("the contact email is " +email.get(i));
                        System.out.println("the contact number is " +number.get(i));
                        System.out.println(" ");
                    }
                }else{System.out.println("No contact listed");}
            }
            else if (com == 'q') {
                break;
            }
            else{System.out.println("unknown command");}
        }
    }
}