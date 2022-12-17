/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PE.Q2;

import PE.Q2.Car;
import java.util.Scanner;

/**
 *
 * @author Lenovo T460s
 */
public class MainCar {
    public static void Menu(){
        System.out.println("----------------------");
        System.out.println("1. Test ToString");
        System.out.println("2. Test getData");
        System.out.println("3. Test getValue");
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maker: ");
        String maker = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        System.out.print("Enter type: ");
        int type = sc.nextInt();
        Car car = new Car(maker, 0);
        SpecCar scar = new SpecCar(0, maker, 0);
        System.out.println("1. Test toString()");
        System.out.println("2. Test setDate");
        System.out.println("2. Test getValue()");
        System.out.print("Enter TC (1, 2, 3): ");
        int choice = 0;
        choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("OUTPUT: ");
                System.out.println(car.toString());
                System.out.println(scar.toString());
                break;
            case 2:
                scar.setData();
                break;
            case 3:
                System.out.println(scar.getValue());
                break;
        }
    }
}
