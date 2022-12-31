package main;

import view.MenuView;

public class App {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //<editor-fold defaultstate="collapsed" desc=" Look and feel">
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    MenuView menu = new MenuView();
    menu.setVisible(true);
  }
}
