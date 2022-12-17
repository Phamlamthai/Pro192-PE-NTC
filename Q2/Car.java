/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PE.Q2;

public class Car {
    public String marker;
    public int price;

    public Car() {
    }

    public Car(String marker, int price) {
        this.marker = marker;
        this.price = price;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
   public String toString(){
       return this.marker + " , " + this.price;
   }
}
