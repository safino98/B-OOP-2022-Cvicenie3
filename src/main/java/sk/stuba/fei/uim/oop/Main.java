package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        Auto bmv = new Auto();
        bmv.model = "x3";
        bmv.rokVyroby = 1998;
        System.out.println("BMW, " + bmv.model + " " + bmv.rokVyroby);
        System.out.println("zadaj nazov auta, model, rok vyroby");
        String nazov = KeyboardInput.readString("Nazov:");
        //Auto nazov = new Auto();
        System.out.println(nazov);


    }
}
