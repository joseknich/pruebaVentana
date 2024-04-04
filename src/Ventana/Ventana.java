package Ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



/**
 *
 * @author jose enrique zuñiga
 */
public class Ventana extends JFrame{
    
    
    
    public Ventana(){
        //500 largo , 400 ancho
    this.setSize(500, 400);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Credenciales");//titula de la ventana
   // this.setLocation(800, 400);//posicion inicial de la ventana
   //this.setBounds(800, 400, 500, 500);// incluye ambos metodos setsize y setlocation
    this.setLocationRelativeTo(null);//centro de pantalla
    this.setCursor(2); //cursor palito
    this.setResizable(false); //impide redimencionar la ventana
    //this.getContentPane().setBackground(Color.blue);//establecer color de pantalla
    InicioDeSesion();
    }
    
    private void InicioDeSesion(){
    
        JPanel panel=new JPanel();//creacion de un panel
        //panel.setBackground(Color.gray); //pintar panel
        this.getContentPane().add(panel);
        JLabel eti=new JLabel("Inicio De Sesion",SwingConstants.CENTER);
        //etiqueta.setText("Inicio De Sesion");
        panel.add(eti);//agregamos etioqueta a panel
        //panel.setLayout(null); desactiva en diseño por defecto
        eti.setForeground(Color.white);//color etiqueta
        eti.setOpaque(true);
        eti.setBackground(Color.black);
    }
}