/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.NSX;
import Util.JDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HuyAll
 */
public class QLTLService {
    public List<NSX> getAll(){
        List<NSX> ds = new ArrayList<>();
        try {
            String query = "select * from NhaSanXuat";
            PreparedStatement ps = Util.JDBC.prepa(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {                
                String Ma = rs.getString("MaNSX");
                String Ten = rs.getString("HangSX");
                NSX sx = new NSX(Ma, Ten);
                ds.add(sx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
}
