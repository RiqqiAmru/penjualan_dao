package service.impl;

import dao.BarangDAO;
import dao.PelangganDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import config.Koneksi;
import dao.PenjualanDAO;
import dao.PenjualanDetailDAO;
import java.util.ArrayList;
import java.util.List;
import model.Barang;
import model.Pelanggan;
import model.Penjualan;
import model.PenjualanDetail;
import service.KasirService;

public class KasirServiceImpl implements KasirService {

<<<<<<< HEAD
    private BarangDAO barangDao;
    private Connection connection;

    public KasirServiceImpl() {
        try {
            connection = Koneksi.getKoneksi();
            barangDao = new BarangDAO();
            barangDao.setConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
=======
  private BarangDAO barangDao;
  private PelangganDAO pelangganDao;
  private PenjualanDAO penjualanDao;
  private PenjualanDetailDAO penjualanDetailDao;

  private Connection connection;

  public KasirServiceImpl() {
    try {
      connection = Koneksi.getKoneksi();

      barangDao = new BarangDAO();
      barangDao.setConnection(connection);

      pelangganDao = new PelangganDAO();
      pelangganDao.setConnection(connection);

      penjualanDao = new PenjualanDAO();
      penjualanDao.setConnection(connection);

      penjualanDetailDao = new PenjualanDetailDAO();
      penjualanDetailDao.setConnection(connection);
    } catch (SQLException ex) {
      Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
>>>>>>> 3a9a71976a5c02969051fc0f6cdc4b9e9b1c58a8
    }

<<<<<<< HEAD
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
=======
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
>>>>>>> 3a9a71976a5c02969051fc0f6cdc4b9e9b1c58a8
    }

<<<<<<< HEAD
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
                Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
=======
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

>>>>>>> 3a9a71976a5c02969051fc0f6cdc4b9e9b1c58a8
    }

<<<<<<< HEAD
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
=======
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
>>>>>>> 3a9a71976a5c02969051fc0f6cdc4b9e9b1c58a8
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
<<<<<<< HEAD

    @Override
    public List<Barang> getCariNama(String nama) {
        try {
            return barangDao.getByNama(nama);
        } catch (SQLException ex) {
            Logger.getLogger(KasirServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
=======
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

//  tabel penjualan
  @Override
  public Penjualan simpanPenjualan(Penjualan p) {
    try {
      connection.setAutoCommit(false);
      penjualanDao.save(p);
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
  public PenjualanDetail simpanPenjualanDetail(PenjualanDetail p) {
    try {
      connection.setAutoCommit(false);
      penjualanDetailDao.save(p);
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
>>>>>>> 3a9a71976a5c02969051fc0f6cdc4b9e9b1c58a8
}
