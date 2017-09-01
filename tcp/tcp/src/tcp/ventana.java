/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class ventana extends JFrame implements ActionListener {
    JButton obtener;
    JLabel resultado;
    JTextField numx,numy;
    JLabel titulo,info;
    
    public ventana(){
        setBounds(100, 100, 450, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        numx=new JTextField();
        numx.setBounds(50, 50, 100, 30);
        add(numx);
        
        numy=new JTextField();
        numy.setBounds(150, 50, 100, 30);
        add(numy);

        info=new JLabel("Escribe ambos terminos para desarrollar el trinomio cuadrado perfecto");
        info.setBounds(10, 25, 420, 30);
        add(info);
        
        obtener=new JButton("Calcular");
        obtener.setBounds(150, 200, 100, 45);
        add(obtener);
        obtener.addActionListener(this);
        
        resultado=new JLabel("");
        resultado.setBounds(20, 220, 350, 300);
        add(resultado);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Calcular")){
            resultado.setText("");
            proceso ob=new proceso(Integer.parseInt(numx.getText()),Integer.parseInt(numy.getText()));
            resultado.setText(ob.operacion());
           
        }
    }
    
}
