package com.company.frames;
import com.company.Estudiante;



import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
public class DatosTablaEstudiante extends JPanel{
    private final JTable tableEstudiante;
    private PersonaEstudianteTablaModelo modelEstudiante;
public DatosTablaEstudiante(List<Estudiante> estudiantes){
    super(new GridLayout(1,0));
    modelEstudiante = new PersonaEstudianteTablaModelo(estudiantes);

    tableEstudiante = new JTable(modelEstudiante);
    tableEstudiante.setPreferredScrollableViewportSize(new Dimension(600, 100));
    tableEstudiante.setFillsViewportHeight(true);
    tableEstudiante.repaint();
    tableEstudiante.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

    for (int column = 0; column < tableEstudiante.getColumnCount(); column++)
    {
        TableColumn tableColumn = tableEstudiante.getColumnModel().getColumn(column);
        int preferredWidth = tableColumn.getMinWidth();
        int maxWidth = tableColumn.getMaxWidth();

        for (int row = 0; row < tableEstudiante.getRowCount(); row++)
        {
            TableCellRenderer cellRenderer = tableEstudiante.getCellRenderer(row, column);
            Component c = tableEstudiante.prepareRenderer(cellRenderer, row, column);
            int width = c.getPreferredSize().width + tableEstudiante.getIntercellSpacing().width;
            preferredWidth = Math.max(preferredWidth, width);

            // Exceso maximo de ancho, no necesario checar otras filas
            if (preferredWidth >= maxWidth)
            {
                preferredWidth = maxWidth;
                break;
            }
        }
        tableColumn.setPreferredWidth( preferredWidth );
    }
    // Crear scroll pane y añade a la tabla
    JScrollPane scrollPaneEstudiante = new JScrollPane(tableEstudiante);
    //Añadir scroll al panel
    add(scrollPaneEstudiante);
}

}
