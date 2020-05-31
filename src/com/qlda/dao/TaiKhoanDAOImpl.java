
package com.qlda.dao;

import com.qlda.model.DetailUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hienh
 */
public class TaiKhoanDAOImpl implements TaiKhoanDAO{

    @Override
    public List<DetailUser> getList() {
        try {
            Connection cons = BDConnect.getConnection();
            String sql = "SELECT * FROM DetailUser";
            List<DetailUser> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                DetailUser detailuser = new DetailUser();
                detailuser.setDetail_user_id(rs.getInt("detail_user_id"));
                detailuser.setFullname(rs.getString("fullname"));
                detailuser.setDob(rs.getDate("dob"));
                detailuser.setAddress(rs.getString("address"));
                detailuser.setPhone(rs.getString("phone"));
                detailuser.setCountry(rs.getString("country"));
                detailuser.setUser_id(rs.getInt("user_id"));
                detailuser.setGender(rs.getString("gender"));
                list.add(detailuser);
            }
            ps.close();
            rs.close();
            cons.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) {
        TaiKhoanDAO taiKhaonDAO = new TaiKhoanDAOImpl();
        System.out.println(taiKhaonDAO.getList());
    }
}
