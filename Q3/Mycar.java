/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PE.Q3;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Lenovo T460s
 */
public class Mycar implements ICar{

    @Override
    public int f1(List<Car> t) {
        double sum = 0;
        int carCount =t.size();
        for(int i=0;i<carCount;i++){
            sum += t.get(i).getRate();
        }
        return (int ) sum / carCount;
    }

    @Override
    public void f2(List<Car> t) {
        int indexMin = MinRate(t);
        int indexMax = MaxRate(t);
         Car tmp = t.get(indexMin);
         // swap elements 
         t.set(indexMin, t.get(indexMax));
         t.set(indexMax, tmp);
    }

    @Override
    public void f3(List<Car> t) {
        Comparator<Car> cpt = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int compare = o1.getMaker().compareTo(o2.getMaker());
                if(compare==0){
                    if(o1.getRate() > o2.getRate()){
                        return -1;
                    }else if( o1.getRate()== o2.getRate()){
                        return 0;
                    }else{
                        return 1;
                    }
                }else{
                    return compare;
                }
            }
        };
        Collections.sort(t, cpt);
    }

    private int MinRate(List<Car> t) {
        int valueMin = t.get(0).getRate();
        int indexMin = 0;
        for(int i=1;i<t.size();i++){
            if(t.get(i).getRate() < valueMin){
                valueMin=t.get(i).getRate();
                indexMin=i;
            }
        }
        return indexMin;
    }

    private int MaxRate(List<Car> t) {
        int valueMax = t.get(0).getRate();
        int indexMax = 0;
        for(int i=1;i<t.size();i++){
            if(t.get(i).getRate() < valueMax){
                valueMax = t.get(i).getRate();
                indexMax=i;
            }
        }
        return indexMax;
    }

    
    
}
