package tugas3;
import java.util.Scanner;


public class TesLinearEquation {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Input\t: ");
        Scanner Angka = new Scanner(System.in);
        double X1 = Angka.nextDouble();
        double Y1 = Angka.nextDouble();
        double X2 = Angka.nextDouble();
        double Y2 = Angka.nextDouble();
        double Z1 = Angka.nextDouble();
        double Z2 = Angka.nextDouble();

        LinearEquation PL1 = new LinearEquation();
        PL1.Keluarannya();
        PL1.getPersamaanLinear(X1, Y1, Z1);
        PL1.getPersamaanLinear(X2, Y2, Z2);
        PL1.setA(X1);
        PL1.setB(Y1);
        PL1.setC(X2);
        PL1.setD(Y2);
        PL1.setE(Z1);
        PL1.setF(Z2);
        PL1.Hasilnya();
        PL1.cekSolusi();
        
    }
}
    

