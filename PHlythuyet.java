/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author LENOVO
 */
public class PHlythuyet extends phonghoc{
    private boolean maychieu;

    public PHlythuyet(boolean maychieu) {
        this.maychieu = maychieu;
    }

    public PHlythuyet(boolean maychieu, String maphong, String daynha, double dientich, int sobongden) {
        super(maphong, daynha, dientich, sobongden);
        this.maychieu = maychieu;
    }

    public boolean isMaychieu() {
        return maychieu;
    }

    public void setMaychieu(boolean maychieu) {
        this.maychieu = maychieu;
    }
    

    @Override
    public String toString() {
        return "PHlythuyet{" + "maychieu=" + maychieu + '}';
    }  
}
