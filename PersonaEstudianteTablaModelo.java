package com.company.frames;
import com.company.Estudiante;
import com.company.Profesor;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PersonaEstudianteTablaModelo  extends  AbstractTableModel{
    private String[] columnNames = {"Nombre", "ApellidoP", "ApellidoM", "Fecha", "Sexo", "Estado", "Peso", "Estatura", "Carrera", "Id", "Hobby", "Taller", "Act.Extra", "Materias.Ap", "Materias.Rep", "Promedio", "HorasEstudio", "Pág.Favorita","Turno"};
    private List<Estudiante> estudiantes;
    //Constructor
    public PersonaEstudianteTablaModelo(List<Estudiante> estudiantes){
        this.estudiantes = estudiantes;
    }
    public int getColumnCount() {
        return columnNames.length;
    }
    @Override
    public int getRowCount() {
        int size;
        if (estudiantes == null) {
            size = 0;
        }
        else {
            size = estudiantes.size();
        }
        return size;
    }

    public Object getValueAt(int row, int col) {
        Object temp = null;
        if (col == 0) {
            temp = estudiantes.get(row).getNombre();
        }
        else if (col == 1) {
            temp = estudiantes.get(row).getApellidoPaterno();
        }
        else if (col == 2) {
            temp = estudiantes.get(row).getApellidoMaterno();
        }
        else if (col == 3){
            temp = (estudiantes.get(row).getAño())+"/"+(estudiantes.get(row).getMes())+"/"+(estudiantes.get(row).getDia());
        }
        else if (col == 4){
            temp = estudiantes.get(row).getSexo();
        }
        else if (col == 5){
            temp = estudiantes.get(row).getEstado();
        }
        else if (col == 6){
            temp = estudiantes.get(row).getEstatura();
        }
        else if (col == 7){
            temp = estudiantes.get(row).getCarrera();
        }
        else if (col == 8){
            temp = estudiantes.get(row).getId();
        }
        else if (col == 9){
            temp = estudiantes.get(row).getHobbie();
        }
        else if (col == 10){
            temp = estudiantes.get(row).getTaller();
        }
        else if (col == 11){
            temp = estudiantes.get(row).getAf();
        }
        else if (col == 12){
            temp = estudiantes.get(row).getMatAprob();
        }
        else if (col == 13){
            temp = estudiantes.get(row).getMatRep();
        }
        else if (col == 14){
            temp = estudiantes.get(row).getProm();
        }
        else if (col == 15){
            temp = estudiantes.get(row).getHoes();
        }
        else if (col == 16){
            temp = estudiantes.get(row).getPf();
        }
        else if (col == 17){
            temp = estudiantes.get(row).getTurno();
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
    public void setValueAt(Estudiante estudiante, int row, int column) {
        fireTableDataChanged();
        estudiantes.add(row, estudiante );
        estudiantes.add(column, estudiante);
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
