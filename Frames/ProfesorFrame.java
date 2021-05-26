package com.company.frames;


import com.company.Estudiante;
import com.company.MyCallback;
import com.company.Persona;
import com.company.Profesor;
import com.sun.jdi.IntegerValue;

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
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public class ProfesorFrame extends JFrame {
    private Profesor profesor;

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
    private JLabel lblHorasTrabajo;
    private JLabel lblId;
    private JLabel lblEstatura;
    private JLabel lblMateria;
    private JLabel lblTutoria;
    private JLabel lblSalario;
    private JLabel lblClasesSemana;
    private JLabel lblEstadoCivil;
    private JLabel lblGuia;
    private JLabel lblTotalAlumnos;
    private JLabel lblAlumnosAprobados;
    private JLabel lblAlumnosReprobados;
    private JLabel lblResultado;

    //JText
    private JTextField txtNombre;
    private JTextField txtApellidoPaterno;
    private JTextField txtApellidoMaterno;
    private JTextField txtId;
    private JTextField txtMateria;
    private JTextField txtClasesSemana;
    private JTextField txtHorasTrabajo;
    private JTextField txtSalario;
    private JTextField txtTotalAlumnos;
    private JTextField txtAlumnosAprobados;
    private JTextField txtAlumnosReprobados;
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
    //Format
    private DateFormat format;
    private JFormattedTextField txfNacimiento;
    //ComboBox
    private JComboBox cbxEstado;
    private JComboBox cbxEstadoCivil;
    private JComboBox cbxTutoria;
    private JComboBox cbxGuia;

    //JSpinner
    private JSpinner jspnrEstatura;
    // JSlider
    private JSlider jslPeso;

    //Docentes Tabla
    private DatosTabla tablaDatos;

    private List<Estudiante> estudiantes ;
    private List<Profesor> profesores;


    public ProfesorFrame(List<Profesor> profesores, List<Estudiante> estudiantes){
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
        //

        //Jlabel


        lblTitulo = new JLabel("Profesor");
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
        lblId = new JLabel("Identificación:");
        lblId.setBounds(250,220,250,50);
        lblId.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblId.setForeground(new Color(255, 255, 255));
        lblEstadoCivil = new JLabel("Estado Civil");
        lblEstadoCivil.setBounds(500,50,250,50);
        lblEstadoCivil.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblEstadoCivil.setForeground(new Color(255, 255, 255));
        lblMateria = new JLabel("Materia que imparte:");
        lblMateria.setBounds(500,110,250,50);
        lblMateria.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblMateria.setForeground(new Color(255, 255, 255));
        lblClasesSemana = new JLabel("Clases a la semana:");
        lblClasesSemana.setBounds(500,170,250,50);
        lblClasesSemana.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblClasesSemana.setForeground(new Color(255, 255, 255));
        lblHorasTrabajo = new JLabel("Horas de trabajo a la semana:");
        lblHorasTrabajo.setBounds(500,250,250,50);
        lblHorasTrabajo.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblHorasTrabajo.setForeground(new Color(255, 255, 255));
        lblSalario = new JLabel("Salario.");
        lblSalario.setBounds(700,50,250,50);
        lblSalario.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblSalario.setForeground(new Color(255, 255, 255));
        lblTutoria = new JLabel("Tutorias:");
        lblTutoria.setBounds(700,110,250,50);
        lblTutoria.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblTutoria.setForeground(new Color(255, 255, 255));
        lblGuia = new JLabel("Guías de estudio:");
        lblGuia.setBounds(700,170,250,50);
        lblGuia.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblGuia.setForeground(new Color(255, 255, 255));
        lblTotalAlumnos = new JLabel("Total de Alumnos:");
        lblTotalAlumnos.setBounds(900,50,250,50);
        lblTotalAlumnos.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblTotalAlumnos.setForeground(new Color(255, 255, 255));
        lblAlumnosAprobados = new JLabel("Alumnos Aprobados:");
        lblAlumnosAprobados.setBounds(900,110,250,50);
        lblAlumnosAprobados.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblAlumnosAprobados.setForeground(new Color(255, 255, 255));
        lblAlumnosReprobados = new JLabel("Alumnos Reprobados:");
        lblAlumnosReprobados.setBounds(900,170,250,50);
        lblAlumnosReprobados.setFont(new Font("Helvetica",Font.BOLD, 15));
        lblAlumnosReprobados.setForeground(new Color(255, 255, 255));
        lblResultado = new JLabel("Resultado");
        lblResultado.setBounds(1200,50,400,400);
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
        txtMateria = new  JTextField();
        txtMateria.setBounds(500,150,100,20);
        txtMateria.setToolTipText("Favor de ingresar la materia que imparte.");
        txtMateria.addKeyListener(new KeyListener() {
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
        txtClasesSemana = new JTextField();
        txtClasesSemana.setBounds(500,210,50,20);
        txtClasesSemana.setToolTipText("Favor de ingresar las clases a la semana que da clases.");
        txtClasesSemana.addKeyListener(new KeyListener() {
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
        txtHorasTrabajo = new JTextField();
        txtHorasTrabajo.setBounds(500,300,50,20);
        txtHorasTrabajo.setToolTipText("Favor de ingresar las horas que trabaja.");
        txtHorasTrabajo.addKeyListener(new KeyListener() {
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
        txtSalario = new JTextField();
        txtSalario.setBounds(700,90,70,20);
        txtSalario.setToolTipText("Favor de ingresar su salario.");
        txtSalario.addKeyListener(new KeyListener() {
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
        txtTotalAlumnos = new JTextField();
        txtTotalAlumnos.setBounds(900,100,50,20);
        txtTotalAlumnos.setToolTipText("Favor de ingresar el total de alumnos.");
        txtTotalAlumnos.addKeyListener(new KeyListener() {
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
        txtAlumnosAprobados = new JTextField();
        txtAlumnosAprobados.setBounds(900,150,50,20);
        txtAlumnosAprobados.setToolTipText("Favor de ingresar el total de alumnos aprobados.");
        txtAlumnosAprobados.addKeyListener(new KeyListener() {
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
        txtAlumnosReprobados = new JTextField();
        txtAlumnosReprobados.setBounds(900,210,50,20);
        txtAlumnosReprobados.setToolTipText("Favor de ingresar el total de alumnos reprobados.");
        txtAlumnosReprobados.addKeyListener(new KeyListener() {
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
        //Botón
        JTextField[] txtFieldA = new JTextField[11];
        txtNombre.setName("Nombre ");
        txtFieldA[0] = txtNombre;
        txtApellidoPaterno.setName("Apellido Paterno. ");
        txtFieldA[1] = txtApellidoPaterno;
        txtApellidoMaterno.setName("Apellido Materno. ");
        txtFieldA[2] = txtApellidoMaterno;
        txtId.setName("Identificación.");
        txtFieldA[3] = txtId;
        txtMateria.setName("Materia.");
        txtFieldA[4] = txtMateria;
        txtClasesSemana.setName("Clases a la semana.");
        txtFieldA[5] = txtClasesSemana;
        txtHorasTrabajo.setName("Horas que trabaja.");
        txtFieldA[6] = txtHorasTrabajo;
        txtSalario.setName("Salario");
        txtFieldA[7] = txtSalario;
        txtTotalAlumnos.setName("Total de alumnos.");
        txtFieldA[8] = txtTotalAlumnos;
        txtAlumnosAprobados.setName("Alumnos aprobados.");
        txtFieldA[9] = txtAlumnosAprobados;
        txtAlumnosReprobados.setName("Alumnos Reprobados.");
        txtFieldA[10] = txtAlumnosReprobados;

        cbxEstadoCivil = new JComboBox();
        cbxEstadoCivil.setBounds(500,90,100,20);
        cbxEstadoCivil.addItem(null);
        cbxEstadoCivil.addItem("Casado");
        cbxEstadoCivil.addItem("Soltero");
        cbxEstadoCivil.addItem("Viud@");

        cbxTutoria = new JComboBox();
        cbxTutoria.setBounds(700,150,100,20);
        cbxTutoria.addItem(null);
        cbxTutoria.addItem("Si");
        cbxTutoria.addItem("no");

        cbxGuia = new JComboBox();
        cbxGuia.setBounds(700,220,100,20);
        cbxGuia.addItem(null);
        cbxGuia.addItem("Internet");
        cbxGuia.addItem("Libros");
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
        btnAgregar.setToolTipText("Se agregará un profesor.");
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


                if (cbxEstadoCivil.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "Estado civil se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxTutoria.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "Tutorias se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxGuia.getSelectedItem()== null){
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
                String horasTrabajo = txtHorasTrabajo.getText().trim();
                String id = txtId.getText().trim();
                String estatura = ((Double) jspnrEstatura.getValue()).toString();
                String materia = txtMateria.getText().trim();
                String tutoria = cbxTutoria.getSelectedItem().toString();
                String salario = txtSalario.getText().trim();
                String clasesSemana = txtClasesSemana.getText().trim();
                String estadoCivil =  cbxEstadoCivil.getSelectedItem().toString();
                String totalAlumnos = txtTotalAlumnos.getText().trim();
                String alumnosAprobados  = txtAlumnosAprobados.getText().trim();
                String alumnosReprobados = txtAlumnosReprobados.getText().trim();
                String guia = cbxGuia.getSelectedItem().toString();

                profesor = new Profesor();
                profesor.setNombre(nombre);
                profesor.setApellidoPaterno(apellidoPaterno);
                profesor.setApellidoMaterno(apellidoMaterno);
                profesor.setSexo(sexo);
                profesor.setEstado(estado);
                profesor.setAño(año);
                profesor.setMes(mes);
                profesor.setDia(dia);
                profesor.setPeso(peso);
                profesor.setEstatura(estatura);
                profesor.setHoras(horasTrabajo);
                profesor.setId(id);
                profesor.setMateria(materia);
                profesor.setTutoria(tutoria);
                profesor.setSalario(salario);
                profesor.setClasesPorSemana(clasesSemana);
                profesor.setEstadoCivil(estadoCivil);
                profesor.setTotalAlumnos(totalAlumnos);
                profesor.setAlumnosAprobados(alumnosAprobados);
                profesor.setAlumnosReprobados(alumnosReprobados);
                profesor.setGuia(guia);

                profesores.add(profesor);
                lblResultado.setText(profesor.getHtmlProfesor() + profesor.personaCompleta() + profesor.personaProfesor());
                btnListarDatos.setEnabled(true);
                btnBuscarMostrar.setEnabled(true);

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
                Profesor profesorBuscado = buscarPorId(id);
                if (profesorBuscado != null) {
                    txtNombre.setText(profesorBuscado.getNombre());
                    txtApellidoPaterno.setText(profesorBuscado.getApellidoPaterno());
                    txtApellidoMaterno.setText(profesorBuscado.getApellidoMaterno());


                    switch (profesorBuscado.getSexo()) {
                        case "Hombre":
                            rbnHombre.setSelected(true);
                            break;
                        case "Mujer":
                            rbnMujer.setSelected(true);
                            break;
                    }
                    cbxEstado.setSelectedItem(profesorBuscado.getEstado());
                    btnActualizar.setEnabled(true);
                    btnEliminar.setEnabled(true);


                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningún dato en la lista.");
                    btnLimpiar.setEnabled(true);
                    limpiarDatos();
                }
            }
        });

            //Actualizar
        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(50,410,100,20);
        btnActualizar.setToolTipText("Se editará un profesor.");
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


                if (cbxEstadoCivil.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "Estado civil se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxTutoria.getSelectedItem()== null){
                    JOptionPane.showMessageDialog(null, "Tutorias se encuentra vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Lista vacío.");
                    return;
                }
                if (cbxGuia.getSelectedItem()== null){
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
                String horasTrabajo = txtHorasTrabajo.getText().trim();
                String id = txtId.getText().trim();
                String estatura = ((Double) jspnrEstatura.getValue()).toString();
                String materia = txtMateria.getText().trim();
                String tutoria = cbxTutoria.getSelectedItem().toString();
                String salario = txtSalario.getText().trim();
                String clasesSemana = txtClasesSemana.getText().trim();
                String estadoCivil =  cbxEstadoCivil.getSelectedItem().toString();
                String totalAlumnos = txtTotalAlumnos.getText().trim();
                String alumnosAprobados  = txtAlumnosAprobados.getText().trim();
                String alumnosReprobados = txtAlumnosReprobados.getText().trim();

                //p = new Persona("");
                profesor = new Profesor();
                profesor.setNombre(nombre);
                profesor.setApellidoPaterno(apellidoPaterno);
                profesor.setApellidoMaterno(apellidoMaterno);
                profesor.setSexo(sexo);
                profesor.setEstado(estado);
                profesor.setAño(año);
                profesor.setMes(mes);
                profesor.setDia(dia);
                profesor.setPeso(peso);
                profesor.setEstatura(estatura);
                profesor.setHoras(horasTrabajo);
                profesor.setId(id);
                profesor.setMateria(materia);
                profesor.setTutoria(tutoria);
                profesor.setSalario(salario);
                profesor.setClasesPorSemana(clasesSemana);
                profesor.setEstadoCivil(estadoCivil);
                profesor.setTotalAlumnos(totalAlumnos);
                profesor.setAlumnosAprobados(alumnosAprobados);
                profesor.setAlumnosReprobados(alumnosReprobados);
                lblResultado.setText(profesor.getHtmlPersona() + profesor.personaCompleta()+ profesor.getHtmlProfesor()+ profesor.personaProfesor());
                btnBuscarMostrar.setEnabled(true);
            }
        });

        //Eliminar
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(50,440,100,20);
        btnEliminar.setEnabled(false);
        btnEliminar.setToolTipText("Eliminar profesor generado anteriormente");
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Confirmar con un showConfirmDialog si desea eliminar o no
                int n = JOptionPane.showConfirmDialog(null, "'Desea eliminar el registro?",
                        "¿Eliminar registro?", JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION) {
                    // Al presionar YES
                    String id = JOptionPane.showInputDialog("Introducir Matricula o ID a buscar: ");
                    Profesor profesorBuscado = buscarPorId(id);
                    if (profesorBuscado != null) {
                        profesores.remove(profesorBuscado);
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
        btnListarDatos.setBounds(50,470,100,20);
        btnListarDatos.setEnabled(false);
        btnListarDatos.setToolTipText("Listar profesores generados");
        btnListarDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablaDatos == null) {
                    tablaDatos = new DatosTabla(profesores);
                    tablaDatos.setBounds(250, 470, 1200, 100);
                    tablaDatos.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
                    tablaDatos.repaint();
                    btnAgregar.setEnabled(true);
                    btnBuscarMostrar.setEnabled(true);
                    ProfesorFrame.this.add(tablaDatos);
                }

            }
        });
        //Limpiar
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
        this.add(lblEstadoCivil);
        this.add(lblId);
        this.add(lblMateria);
        this.add(lblClasesSemana);
        this.add(lblHorasTrabajo);
        this.add(lblSalario);
        this.add(lblTutoria);
        this.add(lblGuia);
        this.add(lblTotalAlumnos);
        this.add(lblAlumnosAprobados);
        this.add(lblAlumnosReprobados);
        this.add(lblResultado);
        this.add(txtNombre);
        this.add(txtApellidoPaterno);
        this.add(txtApellidoMaterno);
        this.add(txfNacimiento);
        this.add(txtId);
        this.add(txtMateria);
        this.add(txtClasesSemana);
        this.add(txtHorasTrabajo);
        this.add(txtSalario);
        this.add(txtTotalAlumnos);
        this.add(txtAlumnosAprobados);
        this.add(txtAlumnosReprobados);
        this.add(rbnHombre);
        this.add(rbnMujer);
        this.add(cbxEstado);
        this.add(cbxEstadoCivil);
        this.add(cbxTutoria);
        this.add(cbxGuia);
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
        txtMateria.setText(null);
        cbxTutoria.setSelectedItem(null);
        txtSalario.setText(null);
        txtClasesSemana.setText(null);
        cbxEstadoCivil.setSelectedItem(null);
        cbxGuia.setSelectedItem(null);
        txtTotalAlumnos.setText(null);
        txtAlumnosAprobados.setText(null);
        txtAlumnosReprobados.setText(null);
        txtHorasTrabajo.setText(null);

    }
    public void setCallback(MyCallback callback) {
        //Regresar
        btnRegresar = new JButton("Regresar");
        btnRegresar.setBounds(900,470,100,20);
        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.onButtonPressed();
            }
        });

        this.add(btnRegresar);

    }

    private Profesor buscarPorId(String id) {
        return  profesores.stream().filter(profesor -> id.equals(profesor.getId())).findAny().orElse(null);
    }
}
