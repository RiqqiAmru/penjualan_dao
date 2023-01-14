/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Kamelia
 */
public class PenjualanDetail {

  private Integer kodeDetail;
  private Integer jumlah;
  private Integer harga;
  private Integer subtotal;
  private Barang barang;
  private Penjualan penjualan;

  public Integer getKodeDetail() {
    return kodeDetail;
  }

  public void setKodeDetail(Integer kodeDetail) {
    this.kodeDetail = kodeDetail;
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

  public Integer getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Integer subtotal) {
    this.subtotal = subtotal;
  }

  public Barang getBarang() {
    return barang;
  }

  public void setBarang(Barang barang) {
    this.barang = barang;
  }

  public Penjualan getPenjualan() {
    return penjualan;
  }

  public void setPenjualan(Penjualan penjualan) {
    this.penjualan = penjualan;
  }
}
