package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class main adalah class yang pertama dijalankan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        
        double saldoAwal = 3500000;
        
        tabungan.persenBunga = 0.08;
        tabungan.saldoTarget = 6000000;
        
        tabungan.tampilkanTargetSaldoTabungan(saldoAwal);
        
        System.out.println("\nDeveloped by : Agung Nurhamidan");
    }
    
}
