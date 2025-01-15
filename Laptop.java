
public class Laptop{
    String merekLaptop;
    String vga         = "RTX 4060";
    String ram         = "12 GB";
    String processor   = "Intel Core i7 gen 13";
    String warnaLaptop;
    int    harga       = 20000000;

    void tampilSpek() {
        System.out.println("======== Rincian Spek Laptop ========");    
        System.out.println("Merek Laptop : " + merekLaptop);
        System.out.println("Warna        : " + warnaLaptop);
        System.out.println("Processor    : " + processor );
        System.out.println("Vga          : " + vga );
        System.out.println("Ram          : " + ram);
        System.out.println("Harga Laptop : Rp." + harga);
        System.out.println("=====================================");

    }
}