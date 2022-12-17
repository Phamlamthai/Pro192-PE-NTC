/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PE.Q1;

import PE.Q1.Book;
import com.sun.source.tree.ContinueTree;
import java.util.Scanner;
public class Main {
    public static void Menu(){
        System.out.println("--------------------");
        System.out.println("1. Test getTitle ");
        System.out.println("2. Test setPrice ");
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Book bk = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your title : ");
        String title = sc.nextLine();
        //bk.setTitle(title);
        System.out.println("Enter you price : ");
        int price = sc.nextInt();
       // bk.setPrice(price);
        int choice =0;
        Menu();
                   
           System.out.println("Enter TC (1 or 2 ) : ");
           choice = sc.nextInt();
           switch(choice){
               case 1:
                   System.out.println("OUTPUT: ");
                   bk.setTitle(title);
                   System.out.println(bk.getTitle());
                  break;
              case 2:
                  System.out.println("enter your new price: ");
                  int newPrice =sc.nextInt();
                  System.out.println("OUTPUT: ");
                  bk.setPrice(newPrice);
                  System.out.println(bk.getPrice());
                  break;
           }
       
        
        
    }
}
