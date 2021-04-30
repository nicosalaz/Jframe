import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolás Salazar
 */
public class Ventana_dos extends JFrame {

    private JPanel panel;
    
    public Ventana_dos(){ 
            setSize(500,500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);//colocamos la ventana en la mitad
            setTitle("Ing Alimentos");
            componentes();

    }
    
    private void componentes(){
        colocarPanel();
        etiquetas();
        botones();
        textBox();
    }
    
    private void colocarPanel(){
        panel = new JPanel();//Creacion de un panel
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);//color del panel
        this.getContentPane().add(panel);//agrega un panel
    }
    
    private void etiquetas(){
        JLabel msjUno = new JLabel();
        JLabel msjDos = new JLabel();
        //---------------mejUno-----------
        msjUno.setText("Ingrese los valores:");
        msjUno.setForeground(Color.BLACK);
        msjUno.setBounds(150,10, 200,50);
        msjUno.setFont(new Font("Times New Roman",0,20));
        //------------------------------------
        
        panel.add(msjUno);
        panel.add(msjDos);
    }
    
    private void botones(){
        JButton bInfo = new JButton();
        bInfo.setBounds(170,420, 100, 20);
        bInfo.setText("Ejecutar");
        panel.add(bInfo);
    }
    
    private void textBox(){
        JTextField velMinBox = new JTextField();
        velMinBox.setBounds(170,100,100, 20);
        panel.add(velMinBox);
    }
    
    
    
}
