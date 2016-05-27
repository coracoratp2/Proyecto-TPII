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
public class Secretaria {
    static JFrame f;
    static JInternalFrame arbol;
    static Bienvenida f1;
    static RegistraSancion f15;
    static Toolkit t = Toolkit.getDefaultToolkit();
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   

    public static void main() {
    f = new JFrame();
    JDesktopPane dp = new JDesktopPane();
    f.getContentPane().add(dp);
    arbol =new  JInternalFrame();
    f1 = new Bienvenida();
    f1.pack();
    f1.setSize(screenSize.width*2/3, screenSize.height);
    //f1.setPreferredSize(new java.awt.Dimension(screenSize.width*2/3, screenSize.height));
    f1.setLocation(screenSize.width/3, 0);
    f15 = new RegistraSancion();
    f15.pack();
    f15.setSize(screenSize.width*2/3, screenSize.height);
    //f1.setPreferredSize(new java.awt.Dimension(screenSize.width*2/3, screenSize.height));
    f15.setLocation(screenSize.width/3, 0);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setUndecorated(true);
    arbol.add(new JTreeEventssecre());
    arbol.pack();
    arbol.setSize(screenSize.width/3, screenSize.height);
    dp.add(arbol);
    dp.add(f1);
    dp.add(f15);
    f.setSize(screenSize.width, screenSize.height);
//    f.setLocation(300, 150);
    f.setVisible(true);
    arbol.setVisible(true);
    f1.setVisible(true);
    interfaznomovibleRicarditoedition();
    }
    
    static private void interfaznomovibleRicarditoedition(){
 
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) Secretaria.arbol.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) Secretaria.arbol.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) Secretaria.arbol.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) Secretaria.f1.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) Secretaria.f1.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) Secretaria.f1.getUI()).getNorthPane().remove(0);
    }
    for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) Secretaria.f15.getUI()).getNorthPane().getMouseListeners()){
    ((javax.swing.plaf.basic.BasicInternalFrameUI) Secretaria.f15.getUI()).getNorthPane().removeMouseListener(listener);
    ((javax.swing.plaf.basic.BasicInternalFrameUI) Secretaria.f15.getUI()).getNorthPane().remove(0);
    }
    }

}

class JTreeEventssecre extends JPanel {
  JTree tree;

  JTextField jtf;

  public JTreeEventssecre() {
    setLayout(new BorderLayout());
    DefaultMutableTreeNode top = new DefaultMutableTreeNode("Opciones - Secretaria");
    
    DefaultMutableTreeNode g = new DefaultMutableTreeNode("Gestionar Sanciones");
    top.add(g);
    
    DefaultMutableTreeNode e = new DefaultMutableTreeNode("Cerrar Sesion");
    top.add(e);
    
    DefaultMutableTreeNode f = new DefaultMutableTreeNode("Salir del Sistema");
    top.add(f);

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
          
          if(jtf.getText().equals("[Opciones - Secretaria, Gestionar Sanciones]")){
              Secretaria.f1.setVisible(false);
              Secretaria.f15.setVisible(true);
          }
          
          if(jtf.getText().equals("[Opciones - Secretaria, Cerrar Sesion]")){
              int resp = JOptionPane.showConfirmDialog(null, "Esta seguro que desea cerrar sesion?","Cerrar Sesion", JOptionPane.YES_NO_OPTION);
              if(resp==JOptionPane.YES_OPTION){
                  LOGIN log = new LOGIN();
                 Secretaria.f.setVisible(false);
                 //Inicio.f.dispose();    //ojo! NO LIBERAR RECURSOS!!
                 log.setVisible(true);
              }
              
          }
          
          if(jtf.getText().equals("[Opciones - Secretaria, Salir del Sistema]")){
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
      return 4;
  }
}

