/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author LENOVO
 */
public class phongthinghiem extends phonghoc{
    private String chuyennganh, succhua;
    private boolean bonruatay;

    public phongthinghiem(String chuyennganh, String succhua, boolean bonruatay) {
        this.chuyennganh = chuyennganh;
        this.succhua = succhua;
        this.bonruatay = bonruatay;
    }

    public phongthinghiem(String chuyennganh, String succhua, boolean bonruatay, String maphong, String daynha, double dientich, int sobongden) {
        super(maphong, daynha, dientich, sobongden);
        this.chuyennganh = chuyennganh;
        this.succhua = succhua;
        this.bonruatay = bonruatay;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public String getSucchua() {
        return succhua;
    }

    public void setSucchua(String succhua) {
        this.succhua = succhua;
    }

    public boolean isBonruatay() {
        return bonruatay;
    }

    public void setBonruatay(boolean bonruatay) {
        this.bonruatay = bonruatay;
    }

    @Override
    public String toString() {
        return "phongthinghiem{" + "chuyennganh=" + chuyennganh + ", succhua=" + succhua + ", bonruatay=" + bonruatay + '}';
    }
    
    
}
