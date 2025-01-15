
public class Laptop{
    String merkLaptop;
    String vga         = "RTX 4060";
    String ram         = "12 GB";
    String processor   = "Intel Core i7 gen 13";
    String warnaLaptop;
    int    harga       = 20000000;

    void tampilSpek() {
        System.out.println("Laptop ini berwarna " + warnaLaptop + " dan bermerk " + merkLaptop +".");
        System.out.println("Berikut rincian spek dari laptop " + merkLaptop + " :");
        System.out.println("======== Rincian Spek ========");    
        System.out.println("Processor    : " + processor );
        System.out.println("Vga          : " + vga );
        System.out.println("Ram          : " + ram);
        System.out.println("Harga        : Rp." + harga);
        System.out.println("==============================");

    }
}