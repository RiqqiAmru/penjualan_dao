/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Kamelia
 */
public class Penjualan {

  private String kodePenjualan;
  private Timestamp tanggalPenjualan;
  private Double totalTransaksi;
  private List<PenjualanDetail> penjualanDetails;

  public String getKodePenjualan() {
    return kodePenjualan;
  }

  public void setKodePenjualan(String kodePenjualan) {
    this.kodePenjualan = kodePenjualan;
  }

  public Timestamp getTanggalPenjualan() {
    return tanggalPenjualan;
  }

  public void setTanggalPenjualan(Timestamp tanggalPenjualan) {
    this.tanggalPenjualan = tanggalPenjualan;
  }

  public Double getTotalTransaksi() {
    return totalTransaksi;
  }

  public void setTotalTransaksi(Double totalTransaksi) {
    this.totalTransaksi = totalTransaksi;
  }

  public List<PenjualanDetail> getPenjualanDetails() {
    return penjualanDetails;
  }

  public void setPenjualanDetails(List<PenjualanDetail> penjualanDetails) {
    this.penjualanDetails = penjualanDetails;
  }

}
