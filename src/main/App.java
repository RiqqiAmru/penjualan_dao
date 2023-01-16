package main;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import model.Barang;
import model.Penjualan;
import model.PenjualanDetail;
import service.KasirService;
import service.impl.KasirServiceImpl;
import view.MenuView;

public class App {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // <editor-fold defaultstate="collapsed" desc=" Look and feel">
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
        | javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>
    MenuView menu = new MenuView();
    menu.setVisible(true);

    // KasirService k = new KasirServiceImpl();
    //// cari semua data
    // List<Barang> listBarang = k.getAll();
    // System.out.println("DATA SEMUA BARANG");
    //
    //// Cari berdasarkan apa
    //// List<Barang> listBarang = k.getCariNama("BERAS");
    //// System.out.println("BARANG BERNAMA BERAS");
    // for (Barang temp : listBarang) {
    // System.out.println("==================");
    // System.out.println("Kode: " + temp.getKode());
    // System.out.println("Nama: " + temp.getNama());
    // System.out.println("Satuan: " + temp.getSatuan());
    // System.out.println("Jumlah: " + temp.getJumlah());
    // System.out.println("Harga: " + temp.getHarga());
    // System.out.println("==================");
    // }
    // / cari semua data
    // List<Pelanggan> listPelanggan = k.getAllPelanggan();
    // System.out.println("DATA SEMUA PELANGGAN");
    //
    //// Cari berdasarkan apa
    // List<Pelanggan> listPelanggan = k.getPelangganByNama("riqqi");
    // System.out.println("PELANGGAN BERNAMA RIQQI");
    // for (Pelanggan temp : listPelanggan) {
    // System.out.println("==================");
    // System.out.println("Kode: " + temp.getKode());
    // System.out.println("Nama: " + temp.getNama());
    // System.out.println("Email: " + temp.getEmail());
    // System.out.println("Alamat: " + temp.getAlamat());
    // System.out.println("==================");
    // }
    // Penjualan p = new Penjualan();
    // Date date = new Date();
    //
    // p.setKodePenjualan("T001");
    // p.setTanggalPenjualan(new Timestamp(date.getTime()));
    // p.setTotalTransaksi(150000.00);
    // k.simpanPenjualan(p);
    //// simpan
    //
    // List<Barang> listBarang = k.getCariNama("BERAS");
    // for (Barang b : listBarang) {
    // PenjualanDetail pd = new PenjualanDetail();
    // pd.setBarang(b);
    // pd.setHarga(b.getHarga());
    // pd.setJumlah(5);
    // pd.setSubtotal(b.getHarga() * 5);
    // pd.setPenjualan(p);
    // k.simpanPenjualanDetail(pd);
    // }
  }
}
