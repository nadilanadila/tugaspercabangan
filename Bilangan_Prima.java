import java.util.Scanner;

public class Bilangan_Prima {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int bilangan, cek=0;

        System.out.print("Masukan Bilangan yang akan di cek =  ");
        bilangan=scan.nextInt();

        for (int i=2; i<=bilangan; i++){
            if (bilangan%i==0){
                cek++;
            }
        }

        if (cek==1){
            System.out.println(bilangan+" Adalah Bilangan Prima");
        }else {
            System.out.println(bilangan+" BUKAN Bilangan Prima");
        }
    }
}

