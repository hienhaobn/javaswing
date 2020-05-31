
package com.qlda.ultity;

import com.qlda.model.DetailUser;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hienh
 */
public class ClassTableModel {
    public DefaultTableModel setTableTaiKhoan(List<DetailUser> listItem, String[] listColumn) {
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
          
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        System.out.println(listItem);
        int rows = listItem.size();
        if(rows > 0){
            for(int i = 0; i< rows; i++) {
                DetailUser detailUser = listItem.get(i);
                obj = new Object[columns];
                obj[0] = (i +1);
                obj[1] = detailUser.getFullname();
                obj[2] = detailUser.getGender();
                obj[3] = detailUser.getDob();
                obj[4] = detailUser.getPhone();
                obj[5] = detailUser.getAddress();
                obj[6] = detailUser.getCountry();
                dtm.addRow(obj);
            }
        }
        
        return dtm;
    }
}
