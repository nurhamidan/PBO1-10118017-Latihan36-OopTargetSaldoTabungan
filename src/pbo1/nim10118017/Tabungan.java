package pbo1.nim10118017;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Perhitungan lama tabungan sampai mencapai saldo target.
 * 
 */
public class Tabungan {
    public double persenBunga;
    public double saldoTarget;
    
    
    public void tampilkanTargetSaldoTabungan(double saldoAwal) {
        //Mengatur simbol format untuk mata uang Indonesia.
        DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols();
        formatSymbols.setCurrencySymbol("Rp. ");
        formatSymbols.setDecimalSeparator('.');
        
        //Menerapkan simbol format ke bilangan desimal serta mengatur digit pembulatannya.
        DecimalFormat format = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        format.setDecimalFormatSymbols(formatSymbols);
        format.setMaximumFractionDigits(0);
        //Menampilkan perulangan hingga mencapai saldo target.
        for (int i = 0; saldoAwal <= saldoTarget; i++) {
            saldoAwal = saldoAwal + (saldoAwal * persenBunga);
            System.out.println("Saldo di bulan ke-" + (i+1) + " " + format.format(saldoAwal));
        }
    }
}
