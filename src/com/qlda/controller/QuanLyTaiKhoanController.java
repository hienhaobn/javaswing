
package com.qlda.controller;

import com.qlda.model.DetailUser;
import com.qlda.service.TaiKhoanService;
import com.qlda.service.TaiKhoanServiceImpl;
import com.qlda.ultity.ClassTableModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javafx.scene.control.TableRow;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hienh
 */
public class QuanLyTaiKhoanController {
    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;

    private TaiKhoanServiceImpl taiKhoanService = new TaiKhoanServiceImpl();
    
    private String[] listColumn = {"STT", "Họ và tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Địa chỉ", "Quê quán"};
    
    private TableRow<TableModel> rowSorter = null;
    
    public QuanLyTaiKhoanController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;
    } 
    public void setDateToTable() {
        List<DetailUser> listItem = taiKhoanService.getList();
        DefaultTableModel model = new ClassTableModel().setTableTaiKhoan(listItem, listColumn);
        JTable table = new JTable(model);
        
        
      table.getColumnModel().getColumn(1).setMinWidth(80);
       table.getColumnModel().getColumn(1).setMaxWidth(80);
      table.getColumnModel().getColumn(1).setPreferredWidth(80);
       
        table.getTableHeader().setFont(new Font("Arrial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.validate();
        table.repaint();
        
        JScrollPane scrollPane = new JScrollPane();
        
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(1300, 400));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
;    }
}
