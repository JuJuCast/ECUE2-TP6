package net.lecnam.ecue2.tp6;

public class Division {
    public double division1(int a, int b) {
        return a / b;
    }
    public double division2(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro détectée");
            return 0.0; //
        }
    }


}
