package com.company.frames;


import com.company.Profesor;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author erika/ Erika Rubi Robles Ramos.
 */
public class PersonaTablaModelo extends  AbstractTableModel {
    private String[] columnNames = {"Nombre","ApellidoP","ApellidoM","Fecha","Sexo","Estado","Peso","HorasT","Id","Estatura","Materia","Tutoria","Salario","ClasesXSemana","EstadoCivil","T.Alumnos","AlumnosA","AlumnosR"};
    private List<Profesor> profesores;

    // Constructor
    public PersonaTablaModelo(List<Profesor> profesores) {
        this.profesores = profesores;
    }


    public int getColumnCount() {
        return columnNames.length;
    }
    public int getRowCount() {
        int size;
        if (profesores == null) {
            size = 0;
        }
        else {
            size = profesores.size();
        }
        return size;
    }
    public Object getValueAt(int row, int col) {
        Object temp = null;
        if (col == 0) {
            temp = profesores.get(row).getNombre();
        }
        else if (col == 1) {
            temp = profesores.get(row).getApellidoPaterno();
        }
        else if (col == 2) {
            temp = profesores.get(row).getApellidoMaterno();
        }
        else if (col == 3){
            temp = (profesores.get(row).getAño())+"/"+(profesores.get(row).getMes())+"/"+(profesores.get(row).getDia());
        }
        else if (col == 4){
            temp = profesores.get(row).getSexo();
        }
        else if (col == 5){
            temp = profesores.get(row).getEstado();
        }
        else if (col == 6){
            temp = profesores.get(row).getHoras();
        }
        else if (col == 7){
            temp = profesores.get(row).getId();
        }
        else if (col == 8){
            temp = profesores.get(row).getEstatura();
        }
        else if (col == 9){
            temp = profesores.get(row).getMateria();
        }
        else if (col == 10){
            temp = profesores.get(row).getTutoria();
        }
        else if (col == 11){
            temp = profesores.get(row).getSalario();
        }
        else if (col == 12){
            temp = profesores.get(row).getClasesPorSemana();
        }
        else if (col == 13){
            temp = profesores.get(row).getEstadoCivil();
        }
        else if (col == 14){
            temp = profesores.get(row).getTotalAlumnos();
        }
        else if (col == 15){
            temp = profesores.get(row).getAlumnosAprobados();
        }
        else if (col == 16){
            temp = profesores.get(row).getAlumnosReprobados();
        }
        return temp;
    }
    // needed to show column names in JTable
    public String getColumnName(int col) {
        return columnNames[col];
    }
    public Class getColumnClass(int col) {
        if (col == 2) {
            return String.class;
        }
        else {
            return String.class;
        }
    }

    public void setValueAt(Profesor profesor, int row, int column) {
        fireTableDataChanged();
        profesores.add(row, profesor );
        profesores.add(column, profesor);
        fireTableCellUpdated(row, column);
    }


    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }

    public void fireTableCellUpdated() {
        fireTableRowsUpdated(getRowCount(), getColumnCount());
    }


}