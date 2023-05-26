/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author LENOVO
 */
public class phongmaytinh extends phonghoc{
    private int baonhieumaytinh;

    public phongmaytinh(int baonhieumaytinh) {
        this.baonhieumaytinh = baonhieumaytinh;
    }

    public phongmaytinh(int baonhieumaytinh, String maphong, String daynha, double dientich, int sobongden) {
        super(maphong, daynha, dientich, sobongden);
        this.baonhieumaytinh = baonhieumaytinh;
    }

    public int getBaonhieumaytinh() {
        return baonhieumaytinh;
    }

    public void setBaonhieumaytinh(int baonhieumaytinh) {
        this.baonhieumaytinh = baonhieumaytinh;
    }

    @Override
    public String toString() {
        return "phongmaytinh{" + "baonhieumaytinh=" + baonhieumaytinh + '}';
    }
    
}
