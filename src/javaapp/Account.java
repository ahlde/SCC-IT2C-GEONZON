package javaapp;

import java.util.Scanner;

public class Account {
    
    public static void acct(){
//        
//        Accounts[] ac = new Accounts[100];
//        Scanner sc = new Scanner(System.in);
//        
//        int n, i;
//        
//        System.out.println("Enter no. of Accounts: ");
//        n = sc.nextInt();
//        
//        for (i = 0; i < n; i++){
//            
//            System.out.print("Enter ID: ");
//            int id = sc.nextInt();
//            
//            System.out.print("Enter First Name: ");
//            String fstName = sc.next();
//            
//            System.out.print("Enter Last Name: ");
//            String lstName = sc.next();
//            
//            do{
//                System.out.print("Enter Email: ");
//                String email = sc.next();
//            } while (!Accounts.checkEmail(email));
//            
//            do{
//                System.out.print("Enter Username: ");
//                String username = sc.next();
//            }while(!Accounts.checkUser(lstName))
//           
//            
//            System.out.print("Enter Password: ");
//            String password = sc.next();
//            
//            
//            
//        }
//    }
    
            Accounts[] ac = new Accounts[100];
            Scanner in = new Scanner(System.in);

            System.out.print("Enter no. of accounts: ");
            int acc = in.nextInt();
            System.out.println("\n");
        
        for(int i=0; i<acc; i++){
            
            int id;
            
            System.out.println("Details of Account "+(i+1)+"");
            do{
                System.out.print("ID: ");
                id = in.nextInt();

            }while(!Accounts.checkID(id));
            
            
            System.out.print("First Name: ");
            String fname = in.next();
           
            System.out.print("Last Name: ");
             String lname= in.next();
            
            String email;
            do{
                System.out.print("Email: ");
                email = in.next();
            }while(!Accounts.checkEmail(email));
            
                String uname;
            do{
                System.out.print("Username: ");
                uname = in.next();
            }while(!Accounts.checkUser(uname));
            System.out.println("\nPassword criteria:"
                        + "\n1. Must be above 8 characters"
                        + "\n2. Must have at least 1 upper & 1 lower case letters"
                        + "\n3. Must have at least 1 number"
                        + "\n4. Must have at least 1 special character"
                        + "\n5. Must not have common password names like 'admin', 'password', or '1234'");
             String pword;
            do {
                
                System.out.print("Password: ");
                pword = in.next();
            } while (!Accounts.passwordValidator(pword));
            
            new Accounts(id, fname, lname, email, uname, pword);

        }
                System.out.printf("\n%-15s %-15s %-15s %-20s %-20s %-20s\n",
                        "Account ID ","First Name ","Last Name ","Email ","Username ","Password ");
                    for(int i=0; i<Accounts.currentCount; i++){
                            Accounts.acct[i].viewAccounts();

                    }
         
    }
}
