package service;

import java.util.List;
import model.Barang;

public interface KasirService {

  Barang simpanBarang(Barang b);

  Barang updateBarang(Barang b);

  Barang deleteBarang(Barang b);

  List<Barang> getAll();

  List<Barang> getCariNama(String nama);

}
