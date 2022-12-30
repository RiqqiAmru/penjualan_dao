package model;

public class Barang {

  private String kode;
  private String nama;
  private String satuan;
  private Integer jumlah;
  private Integer harga;

  public String getKode() {
    return kode;
  }

  public void setKode(String kode) {
    this.kode = kode;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getSatuan() {
    return satuan;
  }

  public void setSatuan(String satuan) {
    this.satuan = satuan;
  }

  public Integer getJumlah() {
    return jumlah;
  }

  public void setJumlah(Integer jumlah) {
    this.jumlah = jumlah;
  }

  public Integer getHarga() {
    return harga;
  }

  public void setHarga(Integer harga) {
    this.harga = harga;
  }
}
