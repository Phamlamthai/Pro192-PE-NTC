/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PE.Q2;

import PE.Q2.Car;

/**
 *
 * @author Lenovo T460s
 */
public class SpecCar extends Car{
    public int type;

    public SpecCar() {
    }

    public SpecCar(int type) {
        this.type = type;
    }
    public SpecCar(int type, String marker, int price){
        super();
        this.type=type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return "Marker : "+getMarker() 
                + " Price : " + getPrice()
                +"Type : " + getType();
    }
    public void setData(){
        super.setMarker("XZ" + super.getMarker());
        System.out.println(super.getMarker());
        super.setPrice(super.getPrice()+20);
        System.out.println(super.toString());
    }
    public int getValue(){
        int inc,result;
        if(this.type < 7){
            inc=10;
            result=inc+price;
            System.out.println(result);
        }else{
            inc=15;
            result=inc+price;
            System.out.println(result);
        }
        return result;
    }
}
