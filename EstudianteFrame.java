package com.company.frames;


import com.company.Estudiante;
import com.company.MyCallback;
import com.company.Persona;
import com.company.Profesor;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public class EstudianteFrame extends JFrame {
    private Estudiante estudiante;
    private  int posicion = -1;
    //JLabels
    private JLabel lblTitulo;
    private JLabel lblNombre;
    private JLabel lblApellidoPaterno;
    private JLabel lblApellidoMaterno;
    private JLabel lblSexo;
    private JLabel lblEstado;
    private JLabel lblEdad;
    private JLabel lblPeso;
    private JLabel lblId;
    private JLabel lblEstatura;
    private JLabel lblTurno;
    private JLabel lblCarrera;
    private JLabel lblHobby;
    private JLabel lblMateriasAprobadas;
    private JLabel lblMateriasReprobadas;
    private JLabel lblPromedio;
    private JLabel lblTaller;
    private JLabel lblActExtra;
    private JLabel lblHorasEstudio;
    private JLabel lblPaginaEstudios;
    private JLabel lblResultado;
    //JText
    private JTextField txtNombre;
    private JTextField txtApellidoPaterno;
    private JTextField txtApellidoMaterno;
    private JTextField txtId;
    private JTextField txtMateriasAprobadas;
    private JTextField txtMateriasReprobadas;
    private JTextField txtPromedio;
    private JTextField txtHorasEstudio;
    private JTextField txtPaginaEstudios;
    //JButton
    private JButton btnAgregar;
    private JButton btnBuscarMostrar;
    private JButton btnActualizar;
    private JButton btnEliminar;
    private JButton btnListarDatos;
    private JButton btnRegresar;
    private JButton btnLimpiar;
    //Radio  Button
    private JRadioButton rbnHombre;
    private JRadioButton rbnMujer;
    private ButtonGroup sexoButtonGroup;
    //ComboBox
    private JComboBox cbxEstado;
    private JComboBox cbxEdad;
    private JComboBox cbxTurno;
    private JComboBox cbxCarrera;
    private JComboBox cbxHobby;
    private JComboBox cbxTaller;
    private JComboBox cbxActExtra;
    //JSpinner
    private JSpinner jspnrEstatura;
    // JSlider
    private JSlider jslPeso;
    //formatM
    private DateFormat format;
    private JFormattedTextField txfNacimiento;
    private DatosTablaEstudiante tablaDatos;

    private List<Estudiante> estudiantes ;
    private List<Profesor> profesores;

    public EstudianteFrame(List<Profesor> profesores,List<Estudiante> estudiantes ){
        this.estudiantes = estudiantes;
        this.profesores = profesores;

        this.setVisible(true);//Ventana visible
        this.setSize(800, 500);//Tamaño ventana
        this.setLocation(20, 40);//Posicion de la ventana (x,y)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Al cerrar la ventana
        this.setTitle("Test Proyecto  <3");//Titulo ventana
        this.getContentPane().setBackground(new Color(51, 0, 16));//Background color RGB CTRL+Espacio
        this.setLayout(null);
        this.setDefaultLookAndFeelDecorated(true);
        //Jlabels

        lblTitulo = new JLabel("Alumno");
        lblTitulo.setBounds(250, 5, 350, 50);
        lblTitulo.setFont(new Font("DejaVu Sans",Font.BOLD, 30));
        lblTitulo.setForeground(new Color(255, 255, 255));
        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 50, 250, 50);
        lblNombre.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblNombre.setForeground(new Color(255, 255, 255));
        lblApellidoPaterno = new  JLabel("Apellido Paterno:");
        lblApellidoPaterno.setBounds(50,110,250,50);
        lblApellidoPaterno.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblApellidoPaterno.setForeground(new Color(255, 255, 255));
        lblApellidoMaterno = new JLabel("Apellido Materno:");
        lblApellidoMaterno.setBounds(50,170,250,50);
        lblApellidoMaterno.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblApellidoMaterno.setForeground(new Color(255, 255, 255));
        lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(50,220,250,50);
        lblSexo.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblSexo.setForeground(new Color(255, 255, 255));
        lblEdad = new JLabel("Año/Mes/Dia:");
        lblEdad.setBounds(50,250,250,50);
        lblEdad.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblEdad.setForeground(new Color(255, 255, 255));
        lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(50,280,250,50);
        lblEstado.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblEstado.setForeground(new Color(255, 255, 255));
        lblPeso = new JLabel("Peso:");
        lblPeso.setBounds(250,50,250,50);
        lblPeso.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblPeso.setForeground(new Color(255, 255, 255));
        lblEstatura = new JLabel("Estatura:");
        lblEstatura.setBounds(250,120,250,50);
        lblEstatura.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblEstatura.setForeground(new Color(255, 255, 255));
        lblId = new JLabel("Matrícula:");
        lblId.setBounds(250,220,250,50);
        lblId.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblId.setForeground(new Color(255, 255, 255));
        lblTurno = new JLabel("Turno:");
        lblTurno.setBounds(250,300,250,50);
        lblTurno.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblTurno.setForeground(new Color(255, 255, 255));
        lblCarrera = new JLabel("Carrera:");
        lblCarrera.setBounds(500,50,250,50);
        lblCarrera.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblCarrera.setForeground(new Color(255, 255, 255));
        lblHobby = new JLabel("Hobby:");
        lblHobby.setBounds(500,110,250,50);
        lblHobby.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblHobby.setForeground(new Color(255, 255, 255));
        lblTaller = new JLabel("Taller:");
        lblTaller.setBounds(500,170,250,50);
        lblTaller.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblTaller.setForeground(new Color(255, 255, 255));
        lblMateriasAprobadas = new JLabel("Materias Aprobadas:");
        lblMateriasAprobadas.setBounds(500,240,250,50);
        lblMateriasAprobadas.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblMateriasAprobadas.setForeground(new Color(255, 255, 255));
        lblMateriasReprobadas = new JLabel("Materias Reprobadas:");
        lblMateriasReprobadas.setBounds(500,290,250,50);
        lblMateriasReprobadas.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblMateriasReprobadas.setForeground(new Color(255, 255, 255));
        lblPromedio = new JLabel("Promedio");
        lblPromedio.setBounds(500,350,250,50);
        lblPromedio.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblPromedio.setForeground(new Color(255, 255, 255));
        lblActExtra = new JLabel("Actividad Extracurricular:");
        lblActExtra.setBounds(700,50,250,50);
        lblActExtra.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblActExtra.setForeground(new Color(255, 255, 255));
        lblHorasEstudio = new JLabel("Horas de Estudio:");
        lblHorasEstudio.setBounds(700,110,250,50);
        lblHorasEstudio.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblHorasEstudio.setForeground(new Color(255, 255, 255));
        lblPaginaEstudios = new JLabel("Página de estudios favorita:");
        lblPaginaEstudios.setBounds(700,220,255,50);
        lblPaginaEstudios.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblPaginaEstudios.setForeground(new Color(255, 255, 255));
        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(950,50,400,400);
        lblResultado.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblResultado.setForeground(new Color(255, 255, 255));
        //TextFields
        txtNombre = new JTextField();
        txtNombre.setBounds(50,90,150,20);
        txtNombre.setToolTipText("Favor de ingresar su nombre:");
        txtNombre.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

                System.out.println("" + ke.getKeyChar() + "-->" + ke.getKeyCode());
                if (!(ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) && !(ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) && !(ke.getKeyChar() == 32) && !(ke.getKeyChar() == 'ñ') && !(ke.getKeyChar() == 'Ñ')) {
                    System.out.println("Cáracter inválido.!!");
                    ke.consume();
                    return;
                }
                System.out.println("Cáracter válido!.");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("Saludos desde el pressed.");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("Saludos desde el released.");
            }
        });
        txtApellidoPaterno = new JTextField();
        txtApellidoPaterno.setBounds(50,150,150,20);
        txtApellidoPaterno.setToolTipText("Favor de ingresar su apellido Paterno:");
        txtApellidoPaterno.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

                System.out.println("" + ke.getKeyChar() + "-->" + ke.getKeyCode());
                if (!(ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) && !(ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) && !(ke.getKeyChar() == 32) && !(ke.getKeyChar() == 'ñ') && !(ke.getKeyChar() == 'Ñ')) {
                    System.out.println("Cáracter inválido.!!");
                    ke.consume();
                    return;
                }
                System.out.println("Cáracter válido!.");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("Saludos desde el pressed.");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("Saludos desde el released.");
            }
        });
        txtApellidoMaterno = new JTextField();
        txtApellidoMaterno.setBounds(50,210,150,20);
        txtApellidoMaterno.setToolTipText("Favor de ingresar su apellido Materno:");
        txtApellidoMaterno.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

                System.out.println("" + ke.getKeyChar() + "-->" + ke.getKeyCode());
                if (!(ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) && !(ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) && !(ke.getKeyChar() == 32) && !(ke.getKeyChar() == 'ñ') && !(ke.getKeyChar() == 'Ñ')) {
                    System.out.println("Cáracter inválido.!!");
                    ke.consume();
                    return;
                }
                System.out.println("Cáracter válido!.");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("Saludos desde el pressed.");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("Saludos desde el released.");
            }
        });
        //Identificación
        txtId = new JTextField();
        txtId.setBounds(250,260,100,20);
        txtId.setToolTipText("Favor de ingresar su Matrícula:");
        txtId.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

                System.out.println("" + ke.getKeyChar() + "-->" + ke.getKeyCode());
                if (!(ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)&& !(ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90)) {
                    System.out.println("Cáracter inválido.!!");
                    ke.consume();
                    return;
                }
                System.out.println("Cáracter válido!.");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("Saludos desde el pressed.");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("Saludos desde el released.");
            }
        });
        //Materias Aprobadas y Reprobadas
        txtMateriasAprobadas = new JTextField();
        txtMateriasAprobadas.setBounds(500,280,40,20);
        txtMateriasAprobadas.setToolTipText("Favor de ingresar las materias aprobadas que tenga.");
        txtMateriasAprobadas.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

                System.out.println("" + ke.getKeyChar() + "-->" + ke.getKeyCode());
                if (!(ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
                    System.out.println("Cáracter inválido.!!");
                    ke.consume();
                    return;
                }
                System.out.println("Cáracter válido!.");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("Saludos desde el pressed.");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("Saludos desde el released.");
            }
        });
        txtMateriasReprobadas = new JTextField();
        txtMateriasReprobadas.setBounds(500,330,40,20);
        txtMateriasReprobadas.setToolTipText("Favor de ingresar las materias Reprobadas que tenga.");
        txtMateriasReprobadas.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

                System.out.println("" + ke.getKeyChar() + "-->" + ke.getKeyCode());
                if (!(ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
                    System.out.println("Cáracter inválido.!!");
                    ke.consume();
                    return;
                }
                System.out.println("Cáracter válido!.");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("Saludos desde el pressed.");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("Saludos desde el released.");
            }
        });
        //Promedio
        txtPromedio = new JTextField();
        txtPromedio.setBounds(500,400,40,20);
        txtPromedio.setToolTipText("Favor de ingresar su promedio.");
        txtPromedio.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

                System.out.println("" + ke.getKeyChar() + "-->" + ke.getKeyCode());
                if (!(ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
                    System.out.println("Cáracter inválido.!!");
                    ke.consume();
                    return;
                }
                System.out.println("Cáracter válido!.");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("Saludos desde el pressed.");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("Saludos desde el released.");
            }
        });
        txtHorasEstudio = new JTextField();
        txtHorasEstudio.setBounds(700,150,40,20);
        txtHorasEstudio.setToolTipText("Favor de ingresar sus horas de estudio.");
        txtHorasEstudio.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

                System.out.println("" + ke.getKeyChar() + "-->" + ke.getKeyCode());
                if (!(ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
                    System.out.println("Cáracter inválido.!!");
                    ke.consume();
                    return;
                }
                System.out.println("Cáracter válido!.");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("Saludos desde el pressed.");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("Saludos desde el released.");
            }
        });
        txtPaginaEstudios = new JTextField();
        txtPaginaEstudios.setBounds(700,270,100,20);
        txtPaginaEstudios.setToolTipText("Favor de ingresar su página favorita de estudio.");
        txtPaginaEstudios.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

                System.out.println("" + ke.getKeyChar() + "-->" + ke.getKeyCode());
                if (!(ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) && !(ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) && !(ke.getKeyChar() == 32) && !(ke.getKeyChar() == 'ñ') && !(ke.getKeyChar() == 'Ñ')) {
                    System.out.println("Cáracter inválido.!!");
                    ke.consume();
                    return;
                }
                System.out.println("Cáracter válido!.");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("Saludos desde el pressed.");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("Saludos desde el released.");
            }
        });
        //Sexo
        rbnHombre = new JRadioButton("H");
        rbnHombre.setBounds(100,240,40,20);
        rbnMujer = new JRadioButton("M");
        rbnMujer.setBounds(140,240,40,20);
        sexoButtonGroup = new ButtonGroup();
        sexoButtonGroup.add(rbnHombre);
        sexoButtonGroup.add(rbnMujer);
        //fecha
        format = new SimpleDateFormat("yyyy/MM/dd");
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("####/##/##");
            //mask.setPlaceholderCharacter('');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        txfNacimiento = new JFormattedTextField(mask);
        txfNacimiento.setToolTipText("Ingresar fecha. EJ: 1995/07/23");
        txfNacimiento.setBounds(110,270,50,20);
        //Estado
        cbxEstado = new JComboBox();
        cbxEstado.setBounds(110,300,100,20);
        cbxEstado.addItem(null);
        cbxEstado.addItem("AGUASCALIENTES");
        cbxEstado.addItem("BC NORTE");
        cbxEstado.addItem("BC SUR");
        cbxEstado.addItem("CAMPECHE");
        cbxEstado.addItem("CHIAPAS");
        cbxEstado.addItem("CHIHUAHA");
        cbxEstado.addItem("COAHUILA");
        cbxEstado.addItem("COLIMA");
        cbxEstado.addItem("CDMX");
        cbxEstado.addItem("DURANGO");
        cbxEstado.addItem("ESTADO DE MEXICO");
        cbxEstado.addItem("GUANAJUATO");
        cbxEstado.addItem("GUERRERO");
        cbxEstado.addItem("HIDALGO");
        cbxEstado.addItem("JALISCO");
        cbxEstado.addItem("MICHOACAN");
        cbxEstado.addItem("MORELOS");
        cbxEstado.addItem("NAYARIT");
        cbxEstado.addItem("NUEVO LEON");
        cbxEstado.addItem("OAXACA");
        cbxEstado.addItem("PUEBLA");
        cbxEstado.addItem("QUERETARO");
        cbxEstado.addItem("QUINTANA ROO");
        cbxEstado.addItem("SAN LUIS POTOSI");
        cbxEstado.addItem("SINALOA");
        cbxEstado.addItem("SONORA");
        cbxEstado.addItem("TABASCO");
        cbxEstado.addItem("TAMAULIPAS");
        cbxEstado.addItem("TLAXCALA");
        cbxEstado.addItem("YUCATAN");
        cbxEstado.addItem("ZACATECAS");


        //Turno
        cbxTurno = new JComboBox();
        cbxTurno.setBounds(250,340,100,20);
        cbxTurno.addItem(null);
        cbxTurno.addItem("Matutino");
        cbxTurno.addItem("Vespertino");
        //Carera
        cbxCarrera = new JComboBox();
        cbxCarrera.setBounds(500,90,100,20);
        cbxCarrera.addItem(null);
        cbxCarrera.addItem("Ing.En Software");
        cbxCarrera.addItem("Arquitectura");
        cbxCarrera.addItem("Diseño");
        //Hobby
        cbxHobby = new JComboBox();
        cbxHobby.setBounds(500,150,100,20);
        cbxHobby.addItem(null);
        cbxHobby.addItem("Pintar");
        cbxHobby.addItem("Dibujar");
        cbxHobby.addItem("VideoJuegos");
        cbxHobby.addItem("Leer");
        cbxHobby.addItem("Dormir");
        //Talleres
        cbxTaller = new JComboBox();
        cbxTaller.setBounds(500,210,100,20);
        cbxTaller.addItem(null);
        cbxTaller.addItem("Yoga");
        cbxTaller.addItem("Dibujo");
        cbxTaller.addItem("Baile");
        cbxTaller.addItem("Ajedrez");
        //Act.Extra
        cbxActExtra = new JComboBox();
        cbxActExtra.setBounds(700,90,100,20);
        cbxActExtra.addItem(null);
        cbxActExtra.addItem("Conferencias");
        cbxActExtra.addItem("Rallys");
        JTextField[] txtFieldA = new JTextField[8];
        txtNombre.setName("Nombre ");
        txtFieldA[0] = txtNombre;
        txtApellidoPaterno.setName("Apellido Paterno. ");
        txtFieldA[1] = txtApellidoPaterno;
        txtApellidoMaterno.setName("Apellido Materno. ");
        txtFieldA[2] = txtApellidoMaterno;
        txtId.setName("Identificación.");
        txtFieldA[3] = txtId;
        txtMateriasAprobadas.setName("Materia.");
        txtFieldA[4] = txtMateriasAprobadas;
        txtMateriasReprobadas.setName("Clases a la semana.");
        txtFieldA[5] = txtMateriasReprobadas;
        txtPromedio.setName("Horas que trabaja.");
        txtFieldA[6] = txtPromedio;
        txtHorasEstudio.setName("Salario");
        txtFieldA[7] = txtHorasEstudio;

        //Peso
        jslPeso = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        jslPeso.setMajorTickSpacing(20);
        jslPeso.setMinorTickSpacing(0);
        jslPeso.setPaintLabels(true);
        jslPeso.setPaintTicks(true);
        jslPeso.setPaintTrack(true);
        jslPeso.setAutoscrolls(true);
        jslPeso.setPreferredSize(new Dimension(500, 500));
        jslPeso.setBounds(250, 90, 220, 40);
        //SPinner
        SpinnerModel lm = new SpinnerNumberModel(0, 0, 3, 0.01);
        jspnrEstatura = new JSpinner(lm);
        jspnrEstatura.setBounds(250,160,50,20);
        //Botón Agregar
        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(50,350,100, 20);
        btnAgregar.setToolTipText("Se agregará un estudiante.");
        btnAgregar.setEnabled(true);
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Saludos desde el button.");
                for (JTextField txtField : txtFieldA) {
                    if (txtField.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, txtField.getName() + "se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                        //break
                        return;
                    }
                }
                if (sexoButtonGroup.getSelection() == null) {
                    JOptionPane.showMessageDialog(null, "Sexo se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Vacio.");
                    return;
                }
                if (cbxEstado.getSelectedItem() == null) {
                    JOptionPane.showMessageDialog(null, "Estado se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Vacio.");
                    return;
                }


                if (cbxTurno.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "Estado civil se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxCarrera.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "Tutorias se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxHobby.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "La guía se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxTaller.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "La guía se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxActExtra.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "La guía se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }

                if (jspnrEstatura.getValue().toString().equals(0)){
                    JOptionPane.showMessageDialog(null, "Estatura se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Estatura vacío.");
                    return;
                }
                if (jslPeso.getValue() <= 0 ){
                    JOptionPane.showMessageDialog(null, "Peso se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Peso vacío.");
                    return;
                }
                String nombre = txtNombre.getText().trim();
                String apellidoPaterno = txtApellidoPaterno.getText().trim();
                String apellidoMaterno = txtApellidoMaterno.getText().trim();
                String sexo = "";
                if (rbnHombre.isSelected()) {
                    sexo = rbnHombre.getText();
                } else {
                    sexo = rbnMujer.getText();
                }
                String estado = cbxEstado.getSelectedItem().toString();
                String fecha = txfNacimiento.getText();
                String año = fecha.substring(0,4);
                String mes = fecha.substring(5,7);
                String dia = fecha.substring(8,10);
                String peso = ((Integer) jslPeso.getValue()).toString();
                String carrera  = cbxCarrera.getSelectedItem().toString();
                String id = txtId.getText().trim();
                String estatura = ((Double) jspnrEstatura.getValue()).toString();
                String hobby = cbxHobby.getSelectedItem().toString();
                String taller = cbxTaller.getSelectedItem().toString();
                String actExtra = cbxActExtra.getSelectedItem().toString();
                String materiaAp = txtMateriasAprobadas.getText().trim();
                String materiaRep =  txtMateriasReprobadas.getText().trim();
                String prom = txtPromedio.getText().trim();
                String horasEstudio  = txtHorasEstudio.getText().trim();
                String paginaF = txtPaginaEstudios.getText().trim();
                String turno  = cbxTurno.getSelectedItem().toString();;

                estudiante = new Estudiante();
                estudiante.setNombre(nombre);
                estudiante.setApellidoPaterno(apellidoPaterno);
                estudiante.setApellidoMaterno(apellidoMaterno);
                estudiante.setSexo(sexo);
                estudiante.setEstado(estado);
                estudiante.setAño(año);
                estudiante.setMes(mes);
                estudiante.setDia(dia);
                estudiante.setPeso(peso);
                estudiante.setEstatura(estatura);
                estudiante.setCarrera(carrera);
                estudiante.setId(id);
                estudiante.setHobbie(hobby);
                estudiante.setTaller(taller);
                estudiante.setAf(actExtra);
                estudiante.setMatAprob(materiaAp);
                estudiante.setMatRep(materiaRep);
                estudiante.setProm(prom);
                estudiante.setHoes(horasEstudio);
                estudiante.setPf(paginaF);
                estudiante.setTurno(turno);
                estudiantes.add(estudiante);
                lblResultado.setText(estudiante.getHtmlPersona() + estudiante.personaCompleta() + estudiante.getHtmlEstudiante() + estudiante.personaEstudiante() );
                btnBuscarMostrar.setEnabled(true);
                btnListarDatos.setEnabled(true);
            }
        });

        //Buscar y Mostrar
        btnBuscarMostrar = new JButton("Buscar");
        btnBuscarMostrar.setBounds(50,380,100,20);
        btnBuscarMostrar.setToolTipText("Se buscará un profesor.");
        btnBuscarMostrar.setEnabled(false);
        btnBuscarMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String id = JOptionPane.showInputDialog("Introducir Matricula o ID a buscar: ");
                //Validar al presionar cancelar o al darle en la x de la ventana.
                Estudiante estudianteBuscado = buscarPorId(id);
                if (estudianteBuscado  != null) {
                    txtNombre.setText(estudianteBuscado .getNombre());
                    txtApellidoPaterno.setText(estudianteBuscado .getApellidoPaterno());
                    txtApellidoMaterno.setText(estudianteBuscado .getApellidoMaterno());


                    switch (estudianteBuscado .getSexo()) {
                        case "Hombre":
                            rbnHombre.setSelected(true);
                            break;
                        case "Mujer":
                            rbnMujer.setSelected(true);
                            break;
                    }
                    cbxEstado.setSelectedItem(estudianteBuscado .getEstado());
                    btnActualizar.setEnabled(true);
                    btnEliminar.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningún dato en la lista.");
                    btnLimpiar.setEnabled(true);

                }
            }
        });
        //Actualizar
        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(50,410,100,20);
        btnActualizar.setToolTipText("Se editará un estudiante.");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Saludos desde el button.");
                for (JTextField txtField : txtFieldA) {
                    if (txtField.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, txtField.getName() + "se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                        //break
                        return;
                    }
                }
                if (sexoButtonGroup.getSelection() == null) {
                    JOptionPane.showMessageDialog(null, "Sexo se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Vacio.");
                    return;
                }
                if (cbxEstado.getSelectedItem() == null) {
                    JOptionPane.showMessageDialog(null, "Estado se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Vacio.");
                    return;
                }


                if (cbxTurno.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "Estado civil se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxCarrera.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "Tutorias se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxHobby.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "La guía se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxTaller.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "La guía se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxActExtra.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "La guía se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }

                if (jspnrEstatura.getValue().toString().equals(0)){
                    JOptionPane.showMessageDialog(null, "Estatura se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Estatura vacío.");
                    return;
                }
                if (jslPeso.getValue() <= 0 ){
                    JOptionPane.showMessageDialog(null, "Peso se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Peso vacío.");
                    return;
                }
                String nombre = txtNombre.getText().trim();
                String apellidoPaterno = txtApellidoPaterno.getText().trim();
                String apellidoMaterno = txtApellidoMaterno.getText().trim();
                String sexo = "";
                if (rbnHombre.isSelected()) {
                    sexo = rbnHombre.getText();
                } else {
                    sexo = rbnMujer.getText();
                }
                String estado = cbxEstado.getSelectedItem().toString();
                String fecha = txfNacimiento.getText();
                String año = fecha.substring(0,4);
                String mes = fecha.substring(5,7);
                String dia = fecha.substring(8,10);
                String peso = ((Integer) jslPeso.getValue()).toString();
                String carrera  = cbxCarrera.getSelectedItem().toString();
                String id = txtId.getText().trim();
                String estatura = ((Double) jspnrEstatura.getValue()).toString();
                String hobby = cbxHobby.getSelectedItem().toString();
                String taller = cbxTaller.getSelectedItem().toString();
                String actExtra = cbxActExtra.getSelectedItem().toString();
                String materiaAp = txtMateriasAprobadas.getText().trim();
                String materiaRep =  txtMateriasReprobadas.getText().trim();
                String prom = txtPromedio.getText().trim();
                String horasEstudio  = txtHorasEstudio.getText().trim();
                String paginaF = txtPaginaEstudios.getText().trim();
                String turno  = cbxTurno.getSelectedItem().toString();;

                estudiante = new Estudiante();
                estudiante.setNombre(nombre);
                estudiante.setApellidoPaterno(apellidoPaterno);
                estudiante.setApellidoMaterno(apellidoMaterno);
                estudiante.setSexo(sexo);
                estudiante.setEstado(estado);
                estudiante.setAño(año);
                estudiante.setMes(mes);
                estudiante.setDia(dia);
                estudiante.setPeso(peso);
                estudiante.setEstatura(estatura);
                estudiante.setCarrera(carrera);
                estudiante.setId(id);
                estudiante.setHobbie(hobby);
                estudiante.setTaller(taller);
                estudiante.setAf(actExtra);
                estudiante.setMatAprob(materiaAp);
                estudiante.setMatRep(materiaRep);
                estudiante.setProm(prom);
                estudiante.setHoes(horasEstudio);
                estudiante.setPf(paginaF);
                estudiante.setTurno(turno);
                estudiantes.add(estudiante);
                lblResultado.setText(estudiante.getHtmlPersona() + estudiante.personaCompleta() + estudiante.getHtmlEstudiante() + estudiante.personaEstudiante() );
                btnBuscarMostrar.setEnabled(true);
            }
        });
        //Eliminar
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(50,440,100,20);
        btnEliminar.setToolTipText("Eliminar estudiante generado anteriormente");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Confirmar con un showConfirmDialog si desea eliminar o no
                int n = JOptionPane.showConfirmDialog(null, "'Desea eliminar el registro?",
                        "¿Eliminar registro?", JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION) {
                    // Al presionar YES
                    String id = JOptionPane.showInputDialog("Introducir Matricula o ID a buscar: ");
                    Estudiante estudianteBuscado = buscarPorId(id);
                    if (estudianteBuscado != null) {
                        profesores.remove(estudianteBuscado);
                        JOptionPane.showMessageDialog(null, "Se ha eliminado el registro.");
                        btnBuscarMostrar.setEnabled(true);
                        btnEliminar.setEnabled(false);
                        btnActualizar.setEnabled(false);
                        limpiarDatos();
                    }
                } else if (n == JOptionPane.NO_OPTION) {
                    // Al presionar NO
                    btnEliminar.setEnabled(true);
                    btnActualizar.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "No se ha borrado el registro.");
                    System.out.println("Se presionó borrar.");
                }
            }
        }
        );
        //Listar
        btnListarDatos = new JButton("Listar");
        btnListarDatos.setBounds(50,470,100,20);btnListarDatos.setEnabled(true);
        btnListarDatos.setToolTipText("Listar estudiantes generados");
        btnListarDatos.setEnabled(false);
        btnListarDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablaDatos == null) {
                    tablaDatos = new DatosTablaEstudiante(estudiantes);
                    tablaDatos.setBounds(250, 470, 1200, 100);
                    tablaDatos.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
                    tablaDatos.repaint();
                    btnAgregar.setEnabled(true);
                    btnBuscarMostrar.setEnabled(true);
                    EstudianteFrame.this.add(tablaDatos);
                }

            }
        });

        //limpiar
        btnLimpiar = new JButton("Limpiar") ;
        btnLimpiar.setBounds(50,500,100,20);
        btnLimpiar.setEnabled(true);
        btnLimpiar.setToolTipText("Limpiar todos los campos");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarDatos();
            }
        });

        this.add(lblTitulo);
        this.add(lblNombre);
        this.add(lblApellidoPaterno);
        this.add(lblApellidoMaterno);
        this.add(lblSexo);
        this.add(lblEdad);
        this.add(lblEstado);
        this.add(lblPeso);
        this.add(lblEstatura);
        this.add(lblId);
        this.add(lblTurno);
        this.add(lblCarrera);
        this.add(lblHobby);
        this.add(lblTaller);
        this.add(lblPromedio);
        this.add(lblMateriasAprobadas);
        this.add(lblMateriasReprobadas);
        this.add(lblActExtra);
        this.add(lblHorasEstudio);
        this.add(lblPaginaEstudios);
        this.add(lblResultado);
        this.add(txtNombre);
        this.add(txtApellidoPaterno);
        this.add(txtApellidoMaterno);
        this.add(txtId);
        this.add(txtMateriasAprobadas);
        this.add(txtMateriasReprobadas);
        this.add(txtPromedio);
        this.add(txtHorasEstudio);
        this.add(txtPaginaEstudios);
        this.add(txfNacimiento);
        this.add(rbnHombre);
        this.add(rbnMujer);
        this.add(cbxEstado);
        this.add(cbxTurno);
        this.add(cbxCarrera);
        this.add(cbxHobby);
        this.add(cbxTaller);
        this.add(cbxActExtra);
        this.add(jslPeso);
        this.add(jspnrEstatura);
        this.add(btnAgregar);
        this.add(btnBuscarMostrar);
        this.add(btnActualizar);
        this.add(btnEliminar);
        this.add(btnListarDatos);
        this.add(btnLimpiar);

    }
    private void limpiarDatos(){
        txtNombre.setText(null);
        txtApellidoPaterno.setText(null);
        txtApellidoMaterno.setText(null);
        txfNacimiento.setText(null);
        sexoButtonGroup.clearSelection();
        cbxEstado.setSelectedItem(null);
        jspnrEstatura.setValue(0);
        jslPeso.setValue(0);
        txtId.setText(null);
        cbxTurno.setSelectedItem(null);
        cbxCarrera.setSelectedItem(null);
        txtMateriasAprobadas.setText(null);
        txtMateriasReprobadas.setText(null);
        txtPromedio.setText(null);
        cbxHobby.setSelectedItem(null);
        cbxTaller.setSelectedItem(null);
        cbxActExtra.setSelectedItem(null);
        txtHorasEstudio.setText(null);


    }

    public void setCallback(MyCallback callback) {
        //Regresar
        btnRegresar = new JButton("Regresar");
        btnRegresar.setBounds(700,470,100,20);
        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.onButtonPressed();
            }
        });

        this.add(btnRegresar);

    }
    private Estudiante buscarPorId(String id) {
        return  estudiantes.stream().filter(profesor -> id.equals(profesor.getId())).findAny().orElse(null);
    }
}
