/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.BanHang;
import Util.JDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HuyAll
 */
public class QLBHService {

    public List<BanHang> show(String TheLoai) {
        List<BanHang> bh = new ArrayList<>();
        try {
            String query = "select MaSP, TenSP, HangSX, KichThuoc, ChatLieu, MauSac, SoLuong, GiaBan, TrangThai\n"
                    + "from SanPhamChiTiet inner join NhaSanXuat on SanPhamChiTiet.MaNSX=NhaSanXuat.MaNSX\n"
                    + "                    inner join KichThuoc on SanPhamChiTiet.MaKichThuoc=KichThuoc.MaKichThuoc\n"
                    + "					inner join MauSac on SanPhamChiTiet.MaMau=MauSac.MaMau";
            PreparedStatement ps = Util.JDBC.prepa(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                String MaSP = rs.getString("MaSP");
                String TenSP = rs.getString("TenSP");
                String Hang = rs.getString("HangSX");
                String KichThuoc = rs.getString("KichThuoc");
                String ChatLieu = rs.getString("ChatLieu");
                String Color = rs.getString("MauSac");
                int soLuong = rs.getInt("SoLuong");
                int Price = rs.getInt("GiaBan");
                int stt = rs.getInt("TrangThai");
                BanHang banh = new BanHang(MaSP, TenSP, Hang, KichThuoc, ChatLieu, Color, soLuong, Price, stt);
                bh.add(banh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bh;
    }
    
    public BanHang Them(BanHang bh){
        try {
            String query = "insert into SanPhamChiTiet(MaSP, TenSP, SoLuong, GiaBan) output inserted.id values(?, ?, ?, ?)";
            PreparedStatement ps = JDBC.prepa(query);
            ps.setString(1, bh.getMaSP());
            ps.setString(2, bh.getTenSP());
            ps.setInt(3, bh.getSoLuong());
            ps.setInt(4, bh.getPrice());
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bh;
    }
}
