/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmiage;

/**
 *
 * @author Seif
 */
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MonCellRenderer extends DefaultTableCellRenderer {

	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		Component cell = super.getTableCellRendererComponent(table, value,
				isSelected, hasFocus, row, column);

		if (row == 1 && column == 1)
			cell.setBackground(Color.BLUE);
		else
			cell.setBackground(Color.WHITE);
		return cell;
	}
}