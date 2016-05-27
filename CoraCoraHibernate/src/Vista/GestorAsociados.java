/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
/**
 *
 * @author RicardoManuél
 */
public class GestorAsociados{
    static JFrame f;
    static JInternalFrame arbol;
    static Bienvenida f1;
    static AgregarAsociado f2;
    static GestionarAsociado f3;
    static SAT f4;
    static BuscarGeneral f5;
    static EditarAsociado f7;
    static EditarVehiculo f8;
    static AgregarVehiculo f9;
    static EditarChofer f11;
    static EditarCobrador f12;
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
    f2 = new AgregarAsociado();
    f2.pack();
    f2.setSize(screenSize.width*2/3, screenSize.height);
    f2.setLocation(screenSize.width/3, 0);
    f3 = new GestionarAsociado();
    f3.pack();
    f3.setSize(screenSize.width*2/3, screenSize.height);
    f3.setLocation(screenSize.width/3, 0);
    f4 = new SAT();
    f4.pack();
    f4.setSize(screenSize.width*2/3, screenSize.height);
    f4.setLocation(screenSize.width/3, 0);
    f5 = new BuscarGeneral();
    f5.pack();
    f5.setSize(screenSize.width*2/3, screenSize.height);
    f5.setLocation(screenSize.width/3, 0);
    f7 = new EditarAsociado();
    f7.pack();
    f7.setSize(screenSize.width*2/3, screenSize.height);
    f7.setLocation(screenSize.width/3, 0);
    f8 = new EditarVehiculo();
    f8.pack();
    f8.setSize(screenSize.width*2/3, screenSize.height);
    f8.setLocation(screenSize.width/3, 0);
    f9 = new AgregarVehiculo();
    f9.pack();
    f9.setSize(screenSize.width*2/3, screenSize.height);
    f9.setLocation(screenSize.width/3, 0);
    f11 = new EditarChofer();
    f11.pack();
    f11.setSize(screenSize.width*2/3, screenSize.height);
    f11.setLocation(screenSize.width/3, 0);
    f12 = new EditarCobrador();
    f12.pack();
    f12.setSize(screenSize.width*2/3, screenSize.height);
    f12.setLocation(screenSize.width/3, 0);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setUndecorated(true);
    arbol.add(new JTreeEventsGA());
    arbol.pack();
    arbol.setSize(screenSize.width/3, screenSize.height);
    dp.add(arbol);
    dp.add(f1);
    dp.add(f2);
    dp.add(f3);
    dp.add(f4);
    dp.add(f5);
    dp.add(f7);
    dp.add(f8);
    dp.add(f9);
    dp.add(f11);
    dp.add(f12);
    f.setSize(screenSize.width, screenSize.height);
//    f.setLocation(300, 150);
    f.setVisible(true);
    arbol.setVisible(true);
    f1.setVisible(true);
    f4.setVisible(false);
    interfaznomovibleRicarditoedition();
  }
    
  static private void interfaznomovibleRicarditoedition(){
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.arbol.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.arbol.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.arbol.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f1.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f1.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f1.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f2.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f2.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f2.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f3.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f3.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f3.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f4.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f4.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f4.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f5.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f5.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f5.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f7.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f7.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f7.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f8.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f8.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f8.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f9.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f9.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f9.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f11.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f11.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f11.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f12.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f12.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) GestorAsociados.f12.getUI()).getNorthPane().remove(0);
    }
  }

}

class JTreeEventsGA extends JPanel {
  JTree tree;

  JTextField jtf;

  public JTreeEventsGA() {
    setLayout(new BorderLayout());
    DefaultMutableTreeNode top = new DefaultMutableTreeNode("Opciones - Gestor de Asociados");
    DefaultMutableTreeNode a = new DefaultMutableTreeNode("Gestion de Asociados");
    top.add(a);
    
    a.add(new DefaultMutableTreeNode("Gestionar Asociados"));
    a.add(new DefaultMutableTreeNode("Buscar"));
    
    DefaultMutableTreeNode c = new DefaultMutableTreeNode("Datos del SAT");
    top.add(c);
    
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
          if(jtf.getText().equals("[Opciones - Gestor de Asociados, Datos del SAT]")){   
              GestorAsociados.f1.setVisible(false);
              GestorAsociados.f2.setVisible(false);
              GestorAsociados.f3.setVisible(false);
              GestorAsociados.f4.setVisible(true);
              GestorAsociados.f5.setVisible(false);
              GestorAsociados.f7.setVisible(false);
              GestorAsociados.f8.setVisible(false);
          }
          if(jtf.getText().equals("[Opciones - Gestor de Asociados, Gestion de Asociados, Gestionar Asociados]")){ 
              GestorAsociados.f1.setVisible(false);
              GestorAsociados.f2.setVisible(false);
              GestorAsociados.f3.setVisible(true);
              GestorAsociados.f3.setnumero(2);
              GestorAsociados.f4.setVisible(false);
              GestorAsociados.f5.setVisible(false);
              GestorAsociados.f7.setVisible(false);
              GestorAsociados.f8.setVisible(false);
              
          }
          if(jtf.getText().equals("[Opciones - Gestor de Asociados, Gestion de Asociados, Buscar]")){
              GestorAsociados.f1.setVisible(false);
              GestorAsociados.f2.setVisible(false);
              GestorAsociados.f3.setVisible(false);
              GestorAsociados.f4.setVisible(false);
              GestorAsociados.f5.setVisible(true);
              GestorAsociados.f7.setVisible(false);
              GestorAsociados.f8.setVisible(false);
          }
          
          if(jtf.getText().equals("[Opciones - Gestor de Asociados, Cerrar Sesion]")){
              int resp = JOptionPane.showConfirmDialog(null, "Esta seguro que desea cerrar sesion?","Cerrar Sesion", JOptionPane.YES_NO_OPTION);
              if(resp==JOptionPane.YES_OPTION){
                 LOGIN log = new LOGIN();
                 GestorAsociados.f.setVisible(false);
                 GestorAsociados.f.dispose();
                 log.setVisible(true);
              }
          }
          
          if(jtf.getText().equals("[Opciones - Gestor de Asociados, Salir del Sistema]")){
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
      return 2;
  }
}