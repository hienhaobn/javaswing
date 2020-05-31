
package com.qlda.service;

import com.qlda.dao.TaiKhoanDAO;
import com.qlda.dao.TaiKhoanDAOImpl;
import com.qlda.model.DetailUser;
import java.util.List;

/**
 *
 * @author hienh
 */
public class TaiKhoanServiceImpl implements TaiKhoanService{

    private TaiKhoanDAO taiKhoanDAO = null;

    public TaiKhoanServiceImpl() {
        taiKhoanDAO = new TaiKhoanDAOImpl();
    }
    
    @Override
    public List<DetailUser> getList() {
        return taiKhoanDAO.getList();
    }
}
