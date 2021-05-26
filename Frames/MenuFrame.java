package com.company.frames;

import com.company.Estudiante;
import com.company.MyCallback;
import com.company.Profesor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MenuFrame extends JFrame {
    //JLabels
    private JLabel lblTitulo;

    //JButton
    private JButton btnProfesor;
    private JButton btnAlumno;

    private MyCallback onProfesorPressed;
    private MyCallback onAlumnoPressed;



    public MenuFrame(){

        this.setVisible(true);//Ventana visible
        this.setSize(1000, 800);//Tamaño ventana
        this.setLocation(20, 40);//Posicion de la ventana (x,y)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Al cerrar la ventana
        this.setTitle("Test Proyecto  <3");//Titulo ventana
        this.getContentPane().setBackground(new Color(51, 0, 16));//Background color RGB CTRL+Espacio
        this.setLayout(null);
        this.setDefaultLookAndFeelDecorated(true);
        //Jlabels
        lblTitulo = new JLabel("My Oreo Academia");
        lblTitulo.setBounds(250, 5, 350, 50);
        lblTitulo.setFont(new Font("DejaVu Sans",Font.BOLD, 30));
        lblTitulo.setForeground(new Color(255, 255, 255));

        //Botón Agregar
        btnProfesor = new JButton("Profesor");
        btnProfesor.setBounds(350,150,100, 20);

        //Buscar y Mostrar
        btnAlumno = new JButton("Alumno");
        btnAlumno.setBounds(350,315,100,20);

        this.add(lblTitulo);

    }

    public void setCallbacks(MyCallback onProfesorPressed, MyCallback onAlumnoPressed) {
        this.onProfesorPressed = onProfesorPressed;
        this.onAlumnoPressed = onAlumnoPressed;
        btnProfesor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onProfesorPressed.onButtonPressed();
            }
        });
        btnAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onAlumnoPressed.onButtonPressed();
            }
        });
        this.add(btnProfesor);
        this.add(btnAlumno);

    }
}
