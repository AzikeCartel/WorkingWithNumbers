package ITscoolMegacom;

public class Main {

    public static void main(String[] args) {
	    Numbers100 operation = new Numbers100();
	    operation.fillIn();
	    operation.maxNumber();
	    operation.minNumber();
	    operation.repeatingNumber();
	    operation.sort();
        System.out.println();
	    operation.search();
        System.out.println();
	    Numbers10 numbers10 = new Numbers10();
        System.out.println();
	    numbers10.uniqueValues();
        System.out.println();
        Numbers5 numbers5 = new Numbers5();
        System.out.println();
        numbers5.listCopy();
        System.out.println();
        numbers5.shuffleRandom();

    }
}
