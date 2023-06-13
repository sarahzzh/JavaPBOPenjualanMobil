/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package penjualan;

/**
 *
 * @author budi
 */
import barang.Mobil;
import java.util.ArrayList;
import java.util.List;

public class PenjualanMobil {
    private double modal;
    private double nilaiAsset;
    
    private final List<Mobil> daftarMobil;

    public PenjualanMobil() {
        this.nilaiAsset = 0.0;
        this.modal = 10000000000.0;
        daftarMobil = new ArrayList<>();
    }

    public void beliMobil(Mobil mobil) {
        daftarMobil.add(mobil);
        modal -= mobil.getHarga();
        nilaiAsset += mobil.getHarga();
    }

    public void JualMobil(Mobil mobil, double hargaJual) {
        daftarMobil.remove(mobil);
        modal += hargaJual;
        nilaiAsset -= mobil.getHarga();
    }

    public List<Mobil> cariMobilBerdasarkanMerek(String merek) {
        List<Mobil> hasilPencarian = new ArrayList<>();
        for (Mobil mobil : daftarMobil) {
            if (mobil.getMerek().equalsIgnoreCase(merek)) {
                hasilPencarian.add(mobil);
            }
        }
        return hasilPencarian;
    }
    
    public void jualMobil(Mobil yangdiJual){
        
    }
}

