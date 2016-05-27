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
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javax.swing.JInternalFrame;


public class MapaPaginaWeb extends JInternalFrame{
    static JInternalFrame jFrame;
    static JFXPanel jfxPanel;
    
    public MapaPaginaWeb(){
        jfxPanel = new JFXPanel();
        add(jfxPanel);
        Platform.runLater(() -> {
        WebView webView = new WebView();
        jfxPanel.setScene(new Scene(webView));
        webView.getEngine().load("https://www.google.com/android/devicemanager?hl=es_419");
        });
        pack();
        setResizable(false);
        setSize(540, 400);
        setVisible(true);
    }
}
