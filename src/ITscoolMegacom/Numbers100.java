package ITscoolMegacom;
import java.util.ArrayList;
import java.util.Collections;

public class Numbers100 {
    ArrayList<Integer> Numbers = new ArrayList<>();
    void fillIn(){
        for(int i=0; i<100; i++){
            Numbers.add(i, (int) (Math.random()*100+1));
        }
    }
    void maxNumber(){
        int max = Collections.max(Numbers);
        System.out.println("maximum number in the list: "+max);
    }
    void minNumber(){
        int min = Collections.min(Numbers);
        System.out.println("minimum number in the list: "+min);
    }
    void repeatingNumber() {
        int numberMaxRepetitions = Numbers.get(0);
        int itRepeatsNumberMaxRepetitions = Collections.frequency(Numbers,numberMaxRepetitions);
        for (int i = 1; i < 100; i++) {
            int num = Numbers.get(i);
            int numberOfRepetitions = Collections.frequency(Numbers, num);

            if(itRepeatsNumberMaxRepetitions<numberOfRepetitions){
                numberMaxRepetitions=num;
                itRepeatsNumberMaxRepetitions = numberOfRepetitions;
            }
        }
        if(itRepeatsNumberMaxRepetitions<=0){
            System.out.println("no repeating numbers!");
            return;
        }
        System.out.println("The number that repeats the most on your list is "+numberMaxRepetitions);
        System.out.println("it repeats "+itRepeatsNumberMaxRepetitions+" times");

    }
    void sort(){
        Collections.sort(Numbers);
        for(int i: Numbers){
            System.out.println(i);
        }
    }
    void search(){
        int index5 = Collections.binarySearch(Numbers,5);
        int repeats5num = Collections.frequency(Numbers,5);
        if(index5<0){
            System.out.println("number 5 is not in the list");
        }
        else if(index5>=0){
            System.out.println("number 5 found at index "+index5);
            System.out.println("number 5 is repeated in the list "+repeats5num+ " times");
        }

        int index7 = Collections.binarySearch(Numbers,7);
        int repeats7num = Collections.frequency(Numbers,7);
        if (index7<0){
            System.out.println("number 7 is not in the list");
        }
        else if(index7>=0){
            System.out.println("number 7 found at index "+index7);
            System.out.println("number 7 is repeated in the list "+ repeats7num+" times");
        }
    }
}
