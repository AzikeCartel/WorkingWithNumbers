package ITscoolMegacom;

import java.util.ArrayList;
import java.util.Collections;

public class Numbers10 {
    ArrayList<Integer>Numbers1 = new ArrayList<>();
    ArrayList<Integer>Numbers2 = new ArrayList<>();
    void uniqueValues() {
        int repeatNum = 0;
        int m =0;
        while(m<1){
            repeatNum++;

            int q=0;
            while (q<1) {
                q++;
                for (int i = 0; i < 10; i++) {
                    Numbers1.add((int)(Math.random()*100+1));
                     Numbers2.add((int)(Math.random()*100+1));
                }
            for (int i = 0; i < Numbers2.size(); i++) {
                int num1 = Numbers1.get(i);
                int num2 = Numbers2.get(i);
                if (Collections.frequency(Numbers1, num1) > 1 || Collections.frequency(Numbers2, num2) > 1) {
                    q=0;
                    for(int l=0;l<Numbers2.size();l++){
                        Numbers1.remove(0);
                        Numbers2.remove(0);
                        l=-1;
                    }
                }
            }

            }
            boolean disjoint = Collections.disjoint(Numbers1, Numbers2);
            if(disjoint==true){
                m++;
            }
            else if(disjoint==false){
                for(int l=0;l<Numbers2.size();l++){
                    Numbers1.remove(0);
                    Numbers2.remove(0);
                    l=-1;
                }
            }
        }

        System.out.println("first list: ");
        for(int i=0; i<10;i++){
            System.out.println(Numbers1.get(i));
        }
        System.out.println("Secondary list: ");
        for(int i=0; i<10;i++){
            System.out.println(Numbers2.get(i));
        }
        System.out.println("number of attempts: "+repeatNum);

    }
}
