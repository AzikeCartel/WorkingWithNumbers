package ITscoolMegacom;

import java.util.ArrayList;
import java.util.Collections;

public class Numbers5 {

    ArrayList<Integer> Numbers = new ArrayList<>();
    ArrayList<Integer> NumbersCopy = new ArrayList<>();

    void listCopy() {
        System.out.println("original numbers list: ");
        for (int i = 0; i < 5; i++) {
            Numbers.add((int) (Math.random() * 100 + 1));
            System.out.println(Numbers.get(i));
        }
        NumbersCopy.addAll(Numbers);
        int k=0;
        int m=0;
        while(k<5){
            k=0;
            Collections.shuffle(NumbersCopy);
            m++;
            for(int i=0;i<NumbersCopy.size();i++){
                if(Numbers.get(i)==NumbersCopy.get(i)){
                    k++;
                }
            }
        }
        System.out.println("Copy numbers list: ");
        for (int i=0;i<NumbersCopy.size();i++){
            System.out.println(NumbersCopy.get(i));
        }
        System.out.println("number of stirring: "+m);
    }
    void shuffleRandom(){
        System.out.println("numbers list: ");
        for (int i = 0; i < Numbers.size(); i++) {
            System.out.println(Numbers.get(i));
        }
        Collections.sort(NumbersCopy);
        int m =0;
        int l =0;
        while (m<5){
            l++;
            m=0;
            Collections.shuffle(Numbers);
            for(int i=0;i<Numbers.size();i++) {
                if (Numbers.get(i) == NumbersCopy.get(i)){
                    m++;
                }
            }
        }
        System.out.println("in ascending order: ");
        for (int i = 0; i < Numbers.size(); i++) {
            System.out.println(Numbers.get(i));
        }
        System.out.println("number of stirring: "+l);
    }
}
