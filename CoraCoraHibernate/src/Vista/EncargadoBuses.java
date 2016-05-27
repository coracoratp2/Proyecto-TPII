/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author RicardoManuél
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;
public class EncargadoBuses{
    static JFrame f;
    static JInternalFrame arbol;
    static Bienvenida f1;
    static RegistrarSalida f6;
    static MapaPaginaWeb f10;
    static ComprobantePago f13;
    static Toolkit t = Toolkit.getDefaultToolkit();
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    /**
     *
     */
    public static void main() {
//    ConexionOracle Oracle=new ConexionOracle();
//    Oracle.Conectar();
    f = new JFrame();
    JDesktopPane dp = new JDesktopPane();
    f.getContentPane().add(dp);
    arbol =new  JInternalFrame();
    f1 = new Bienvenida();
    f1.pack();
    f1.setSize(screenSize.width*2/3, screenSize.height);
    f1.setLocation(screenSize.width/3, 0);
    f6 = new RegistrarSalida();
    f6.pack();
    f6.setSize(screenSize.width*2/3, screenSize.height);
    f6.setLocation(screenSize.width/3, 0);
    f13 = new ComprobantePago();
    f13.pack();
    f13.setSize(screenSize.width*2/3, screenSize.height);
    f13.setLocation(screenSize.width/3, 0);
    f10 = new MapaPaginaWeb();
    f10.setSize(screenSize.width*2/3, screenSize.height);
    f10.setLocation(screenSize.width/3, 0);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setUndecorated(true);
    arbol.add(new JTreeEventsEB());
    arbol.pack();
    arbol.setSize(screenSize.width/3, screenSize.height);
    dp.add(arbol);
    dp.add(f1);
    dp.add(f6);
    dp.add(f10);
    dp.add(f13);
    f.setSize(screenSize.width, screenSize.height);
//    f.setLocation(300, 150);
    f.setVisible(true);
    arbol.setVisible(true);
    f1.setVisible(true);
    f10.setVisible(false);
    interfaznomovibleRicarditoedition();
  }
    
  static private void interfaznomovibleRicarditoedition(){
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.arbol.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.arbol.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.arbol.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f1.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f1.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f1.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f6.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f6.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f6.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f10.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f10.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f10.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f13.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f13.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) EncargadoBuses.f13.getUI()).getNorthPane().remove(0);
    }
  }

}

class JTreeEventsEB extends JPanel {
  JTree tree;

  JTextField jtf;

  public JTreeEventsEB() {
    setLayout(new BorderLayout());
    DefaultMutableTreeNode top = new DefaultMutableTreeNode("Opciones - Encargado de Buses");

    DefaultMutableTreeNode b = new DefaultMutableTreeNode("Gestion de Salidas");
    top.add(b);
    
    b.add(new DefaultMutableTreeNode("Registrar Salida"));
    b.add(new DefaultMutableTreeNode("Realizar Seguimiento"));
    
    DefaultMutableTreeNode d = new DefaultMutableTreeNode("Cerrar Sesion");
    top.add(d);
    
    DefaultMutableTreeNode e = new DefaultMutableTreeNode("Salir del Sistema");
    top.add(e);

    tree = new JTree(top);
    DefaultTreeCellRenderer render= (DefaultTreeCellRenderer)tree.getCellRenderer();
    render.setLeafIcon(new ImageIcon(getClass().getResource("/Imagenes/ok.png")));
    render.setOpenIcon(new ImageIcon(getClass().getResource("/Imagenes/folder.png")));
    render.setClosedIcon(new ImageIcon(getClass().getResource("/Imagenes/folder.png")));
    render.setFont(new java.awt.Font("Tahoma", 0, 16));
    tree.setRowHeight(30);
    
    
    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    JScrollPane jsp = new JScrollPane(tree, v, h);

    add(jsp, BorderLayout.CENTER);

    jtf = new JTextField("", 20);
    add(jtf, BorderLayout.SOUTH);

    tree.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        doMouseClicked(me);
      }
    });
  }

  void doMouseClicked(MouseEvent me) {
    TreePath tp = tree.getPathForLocation(me.getX(), me.getY());
    if (tp != null)
      jtf.setText(tp.toString());
    
      if(me.getClickCount()==2){
          if(jtf.getText().equals("[Opciones - Encargado de Buses, Gestion de Salidas, Registrar Salida]")){  
              EncargadoBuses.f1.setVisible(false);
              EncargadoBuses.f6.setnumero(3);
              EncargadoBuses.f6.setVisible(true);
              EncargadoBuses.f10.setVisible(false);
          }
          if(jtf.getText().equals("[Opciones - Encargado de Buses, Gestion de Salidas, Realizar Seguimiento]")){   
              EncargadoBuses.f1.setVisible(false);
              EncargadoBuses.f6.setVisible(false);
              EncargadoBuses.f10.setVisible(true);
          }
          
          if(jtf.getText().equals("[Opciones - Encargado de Buses, Cerrar Sesion]")){
              int resp = JOptionPane.showConfirmDialog(null, "Esta seguro que desea cerrar sesion?","Cerrar Sesion", JOptionPane.YES_NO_OPTION);
              if(resp==JOptionPane.YES_OPTION){
                 LOGIN log = new LOGIN();
                 EncargadoBuses.f.setVisible(false);
                 EncargadoBuses.f.dispose();
                 log.setVisible(true);
              }
          }
          
          if(jtf.getText().equals("[Opciones - Encargado de Buses, Salir del Sistema]")){
              int resp = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?","Salir del Sistema", JOptionPane.YES_NO_OPTION);
              if(resp==JOptionPane.YES_OPTION){
                 System.exit(0); 
              }
          }
      }
    else
      jtf.setText("");
  }
  boolean selectorinterfaz(boolean entrada){
      return entrada;
  }
  
  int numerointerfaz(){
      return 3;
  }
}