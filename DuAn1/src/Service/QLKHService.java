/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Util.JDBC;
import Model.KhachHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class QLKHService {

    public List<KhachHang> getAll() {
        List<KhachHang> khachhang = new ArrayList<>();
        try {
            String query = "SELECT * FROM KhachHang";
            PreparedStatement ps = JDBC.prepare(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                String masv = rs.getString("MaKH");
                String hoTen = rs.getString("TenKH");
                int sdt = rs.getInt("sdt");
                String gioiTinh = rs.getString("GioiTinh");
                Date ngaySinh = rs.getDate("NgaySinh");
                String maNV = rs.getString("MaNV");

                KhachHang khang = new KhachHang(masv, hoTen, maNV, gioiTinh, sdt, (java.sql.Date) ngaySinh);
                khachhang.add(khang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return khachhang;
    }

    public KhachHang insert(KhachHang kh) {
        try {

            String query = "INSERT INTO KhachHang VALUES (? ,? ,? , ?, ?, ?)";

            PreparedStatement ps = JDBC.prepare(query);
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTenKH());
            ps.setInt(3, kh.getSdt());
            ps.setString(4, kh.getGioiTinh());
            ps.setDate(5, new java.sql.Date(kh.getNgaySinh().getTime()));
            ps.setString(6, kh.getMaNV());

            ps.execute();
            ResultSet rs = ps.getResultSet();
            rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return kh;
    }

    public boolean delete(String MaKH) {
        try {

            String query = "DELETE FROM KhachHang WHERE MaKH=?";
            PreparedStatement ps = JDBC.prepare(query);
            ps.setString(1, MaKH);

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean update(KhachHang kh) {
        try {
            String query = "UPDATE KhachHang SET TenKH=?,SDT=?,GioiTinh=?,NgaySinh=?,MaNV=? WHERE MaKH=?";
            PreparedStatement ps = JDBC.prepare(query);

            ps.setString(1, kh.getTenKH());
            ps.setInt(2, kh.getSdt());
            ps.setString(3, kh.getGioiTinh());
            ps.setDate(4, new java.sql.Date(kh.getNgaySinh().getTime()));
             ps.setString(5, kh.getMaNV());
            ps.setString(6, kh.getMaKH());
            ps.execute();
            ResultSet rs = ps.getResultSet();
            rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
