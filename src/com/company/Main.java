package com.company;

import java.util.Scanner;


      public class Main {

            public static void main (String[] args) {
                Scanner in = new Scanner(System.in);
                int choice;
                do
                    {
                    System.out.println("How Tired Are you, 1 Most and 5 Least Tired");
                    System.out.println("         Pick 1 to 5 to find your cost        ");
                    System.out.println("                                                  ");
                    System.out.println("1. Max tired, Coffee with 4 espresso shots");
                    System.out.println("2. Moderate tired, Coffee with 3 espresso shots");
                    System.out.println("3. Medium Tired, Coffee with 2 espresso shots");
                    System.out.println("4. Mildly Tired, Coffee with 1 espresso shots");
                    System.out.println("5. Just Woke up, Coffee only");
                    choice = in.nextInt();
                }

                while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
                switch (choice) {
                    case 1:
                        System.out.println("Coffee with 4 espresso shots is $11.00 dollars");
                        break;
                    case 2:
                        System.out.println("Moderate tired, Coffee with 3 espresso shots is $9.00 dollars");
                        break;
                    case 3:
                        System.out.println("Coffee with 2 espresso shots that is $7.00 dollars");
                        break;
                    case 4:
                        System.out.println("Coffee with 1 espresso shot is $5.00");
                        break;
                    case 5:
                        System.out.println("Coffee only is $1.99");
                        break;
                }
                }
            }


