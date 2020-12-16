import java.util.Scanner;

public class Ganjil_Genap {
    public static void main(String[] args) {
        int angka;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka =  ");
        angka = scan.nextInt();
        if (angka % 2 == 0) {
            System.out.print("Angka " + angka + " adalah bilangan genap.\n");
        } else {
            System.out.print("Angka " + angka + " adalah bilangan ganjil.\n");
        }
    }
}

