import java.util.Scanner;

public class ObjekLaptop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Laptop l = new Laptop();
        System.out.println("Masukkan Merk Laptop");
        l.merekLaptop = input.nextLine();
        System.out.println("Masukkan Warna Laptop");
        l.warnaLaptop = input.nextLine();

        l.tampilSpek();
    }
}