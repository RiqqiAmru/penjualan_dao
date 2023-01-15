package service;

import java.util.List;
import model.Barang;
import model.Pelanggan;
import model.Penjualan;
import model.PenjualanDetail;

public interface KasirService {
//tabel barang

  Barang simpanBarang(Barang b);

  Barang updateBarang(Barang b);

  Barang deleteBarang(Barang b);

  List<Barang> getAll();

  List<Barang> getCariNama(String nama);

//  tabel pelanggan
  Pelanggan simpanPelanggan(Pelanggan p);

  Pelanggan updatePelanggan(Pelanggan p);

  Pelanggan deletePelanggan(Pelanggan p);

  List<Pelanggan> getAllPelanggan();

  List<Pelanggan> getPelangganByNama(String nama);
//  tabel penjualan/ detail

  Penjualan simpanPenjualan(Penjualan p);

  PenjualanDetail simpanPenjualanDetail(PenjualanDetail p);
}
