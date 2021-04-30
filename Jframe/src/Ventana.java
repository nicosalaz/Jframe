/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/**
 *
 * @author Nicolás Salazar
 */
public class Ventana extends JFrame{
    
    public JPanel panel;
    JButton bHarina;
    JButton bTrigo;
    boolean estado ;
    
    
    
    public Ventana(){
        setSize(400,400);//establecemos tamaño de ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cierra la consola y la ventana
        //setLocation(450, 150);//modifica la ubicacion
        //setBounds(450, 150, 500, 500);//reune size y location
        setLocationRelativeTo(null);//colocamos la ventana en la mitad
        setTitle("Ing Alimentos");//agrega titulos
        iniciarComponentes();//invocar el panel
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        etiquetas();
        colocarBotones();
        botonTrigo();
        
    }
    
    private void colocarPaneles(){
        panel = new JPanel();//Creacion de un panel
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);//color del panel
        this.getContentPane().add(panel);//agrega un panel
    }
    
    private void etiquetas(){
        JLabel etiqueta = new JLabel();//msj
        JLabel eti_dos = new JLabel();//msj
        ImageIcon imagenHT = new ImageIcon("Ht.jpg");//imagen
        ImageIcon imagenT = new ImageIcon("Tr.jpg");//imagen
        JLabel trigo = new JLabel(imagenT);//eiqueta de imagen
        JLabel Htrigo = new JLabel(imagenHT);//eiqueta de imagen
        
        
        etiqueta.setText("Bienvenido");
        eti_dos.setText("Escoja un producto: ");
        //etiqueta.setSize(300, 200);
        etiqueta.setBounds(200, 3, 110, 70);//Da el tamaño y la ubicacion
        etiqueta.setForeground(Color.BLACK);//Color de letra
        etiqueta.setFont(new Font("Times New Roman",Font.PLAIN,20));//modifica la fuente y el tamaño
        eti_dos.setBounds(30,40, 180, 70);
        eti_dos.setForeground(Color.BLACK);
        eti_dos.setFont(new Font("Times New Roman",0,20));
        Htrigo.setBounds(60, 150, 100, 100);
        Htrigo.setIcon(new ImageIcon(
                imagenHT.getImage().
                getScaledInstance(Htrigo.getWidth(), Htrigo.getHeight() , Image.SCALE_SMOOTH)));//modifico el tamaño de la imagen
        trigo.setBounds(300, 150, 100, 100);
        trigo.setIcon(new ImageIcon(
                imagenT.getImage().
                getScaledInstance(trigo.getWidth(), trigo.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta);//agrega una etiqueta
        panel.add(eti_dos);
        panel.add(Htrigo);
        panel.add(trigo);
    }
    
    private void colocarBotones(){
        bHarina = new JButton("Harina");
        
        
        bHarina.setBounds(60, 265, 100, 20);//establecemos tamaño y ubcacion del boton
       
        /*
        Nota: si quiero cambiar la fuente y el tamaño a la letra se hace igual qu
        que con las etiquetas, las funcion setForeground() y setFont()
        */
        panel.add(bHarina);
        
    }
    
    public void botonTrigo(){
        bTrigo = new JButton("Trigo");
        bTrigo.setBounds(300, 265, 100, 20);//establecemos tamaño y ubicacion del boton
        panel.add(bTrigo);
        
        mouse();
    }
    private void mouse(){
        MouseListener accion = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                estado = true;
            }

            @Override
            public void mousePressed(MouseEvent me) {

            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {

            }

            @Override
            public void mouseExited(MouseEvent me) {

            }
        };
        bTrigo.addMouseListener(accion);
    }
}
