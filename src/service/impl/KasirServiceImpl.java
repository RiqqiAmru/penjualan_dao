package service.impl;

import dao.BarangDAO;
import dao.PelangganDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import config.Koneksi;
import java.util.ArrayList;
import java.util.List;
import model.Barang;
import model.Pelanggan;
import service.KasirService;

public class KasirServiceImpl implements KasirService {

  private BarangDAO barangDao;
  private PelangganDAO pelangganDao;

  private Connection connection;

  public KasirServiceImpl() {
    try {
      connection = Koneksi.getKoneksi();
      barangDao = new BarangDAO();
      pelangganDao = new PelangganDAO();
      barangDao.setConnection(connection);
      pelangganDao.setConnection(connection);
    } catch (SQLException ex) {
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

//  tabel barang
  @Override
  public Barang simpanBarang(Barang b) {
    try {
      connection.setAutoCommit(false);
      barangDao.save(b);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException ex) {
      try {
        connection.rollback();
      } catch (SQLException ex1) {
        Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex1);
      }
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return b;
  }

  @Override
  public Barang updateBarang(Barang b) {
    try {
      connection.setAutoCommit(false);
      barangDao.update(b);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException ex) {
      try {
        connection.rollback();
      } catch (SQLException ex1) {
        Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE,
                null, ex1);
      }
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);

    }
    return b;
  }

  @Override
  public Barang deleteBarang(Barang b) {
    try {
      connection.setAutoCommit(false);
      barangDao.delete(b);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException ex) {
      try {
        connection.rollback();
      } catch (SQLException ex1) {
        Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE,
                null, ex1);
      }
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);

    }
    return b;
  }

  @Override
  public List<Barang> getAll() {
    try {
      return barangDao.getAll();
    } catch (Exception ex) {
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return new ArrayList<Barang>();
  }

  @Override
  public List<Barang> getCariNama(String nama) {
    try {
      return barangDao.getByNama(nama);
    } catch (SQLException ex) {
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

//  tabel pelanggan
  @Override
  public Pelanggan simpanPelanggan(Pelanggan p) {
    try {
      connection.setAutoCommit(false);
      pelangganDao.save(p);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException ex) {
      try {
        connection.rollback();
      } catch (SQLException ex1) {
        Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex1);
      }
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return p;
  }

  @Override
  public Pelanggan updatePelanggan(Pelanggan p) {
    try {
      connection.setAutoCommit(false);
      pelangganDao.update(p);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException ex) {
      try {
        connection.rollback();
      } catch (SQLException ex1) {
        Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE,
                null, ex1);
      }
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);

    }
    return p;
  }

  @Override
  public Pelanggan deletePelanggan(Pelanggan p) {
    try {
      connection.setAutoCommit(false);
      pelangganDao.delete(p);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException ex) {
      try {
        connection.rollback();
      } catch (SQLException ex1) {
        Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE,
                null, ex1);
      }
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return p;
  }

  @Override
  public List<Pelanggan> getAllPelanggan() {
    try {
      return pelangganDao.getAllPelanggan();
    } catch (Exception ex) {
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return new ArrayList<Pelanggan>();
  }

  @Override
  public List<Pelanggan> getPelangganByNama(String nama) {
    try {
      return pelangganDao.getPelangganByNama(nama);

    } catch (Exception ex) {
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return new ArrayList<Pelanggan>();
  }
}
