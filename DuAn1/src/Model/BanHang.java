/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HuyAll
 */
public class BanHang {
    private String MaSP, MaNSX, MaMau, MaCL, MaKT, TenSP, ChatLieu;
    private int ID, soLuong, price, trangThai;

    public BanHang() {
    }

    public BanHang(String MaSP, String TenSP, int soLuong, int price) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.soLuong = soLuong;
        this.price = price;
    }

    public BanHang(String MaSP, String MaNSX, String MaMau, String MaKT, String TenSP, String ChatLieu, int soLuong, int price, int trangThai) {
        this.MaSP = MaSP;
        this.MaNSX = MaNSX;
        this.MaMau = MaMau;
        this.MaKT = MaKT;
        this.TenSP = TenSP;
        this.ChatLieu = ChatLieu;
        this.soLuong = soLuong;
        this.price = price;
        this.trangThai = trangThai;
    }
    
    public BanHang(String MaSP, String MaNSX, String MaMau, String MaCL, String MaKT, String TenSP, String ChatLieu, int ID, int soLuong, int price, int trangThai) {
        this.MaSP = MaSP;
        this.MaNSX = MaNSX;
        this.MaMau = MaMau;
        this.MaCL = MaCL;
        this.MaKT = MaKT;
        this.TenSP = TenSP;
        this.ChatLieu = ChatLieu;
        this.ID = ID;
        this.soLuong = soLuong;
        this.price = price;
        this.trangThai = trangThai;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getMaMau() {
        return MaMau;
    }

    public void setMaMau(String MaMau) {
        this.MaMau = MaMau;
    }

    public String getMaCL() {
        return MaCL;
    }

    public void setMaCL(String MaCL) {
        this.MaCL = MaCL;
    }

    public String getMaKT() {
        return MaKT;
    }

    public void setMaKT(String MaKT) {
        this.MaKT = MaKT;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    
   
    
}
