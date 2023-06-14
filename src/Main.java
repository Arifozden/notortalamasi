import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fiz,kim;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mat : ");
        mat =inp.nextInt();

        System.out.print("Fiz : ");
        fiz =inp.nextInt();

        System.out.print("Kim : ");
        kim =inp.nextInt();

        double sonuc = (mat+fiz+kim)/3.0;
        System.out.println(sonuc);
    }
}