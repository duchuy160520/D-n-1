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
public class NSX {
    private String MaNSX, TenNSX;

    public NSX() {
    }

    public NSX(String MaNSX, String TenNSX) {
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }
    
}
