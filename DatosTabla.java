package com.company.frames;
import com.company.Estudiante;
import com.company.Persona;
import com.company.Profesor;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class DatosTabla extends JPanel {


    private final JTable table;

    private PersonaTablaModelo model;

    public DatosTabla(List<Profesor>  profesores) {

        super(new GridLayout(1,0));

        model = new PersonaTablaModelo(profesores);




        table = new JTable(model);

        table.setPreferredScrollableViewportSize(new Dimension(600, 100));
        table.setFillsViewportHeight(true);
        table.repaint();
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        for (int column = 0; column < table.getColumnCount(); column++)
        {
            TableColumn tableColumn = table.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            for (int row = 0; row < table.getRowCount(); row++)
            {
                TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                Component c = table.prepareRenderer(cellRenderer, row, column);
                int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
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
        JScrollPane scrollPane = new JScrollPane(table);

        //Añadir scroll al panel
        add(scrollPane);

    }

}
