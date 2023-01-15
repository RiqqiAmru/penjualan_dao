package main;

import config.Koneksi;
import java.sql.Connection;
import model.Barang;
import service.impl.KasirServiceImpl;
import view.MenuView;
import service.KasirService;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuView menu = new MenuView();
        menu.setVisible(true);
    }
}
