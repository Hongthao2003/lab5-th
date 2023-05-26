/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

/**
 *
 * @author LENOVO
 */
public class qlphonghoc {
    private List<phonghoc> ql;
    public qlphonghoc(){
     ql = new ArrayList<>();
    }
    
    private boolean kiemtraTonTai(String maphong){
        for (phonghoc phongHoc : ql){
            if (phongHoc.getMaphong().equals(maphong)){
                return true;
            }
        }
        return false;
    }
    
    public boolean themphonghoc(phonghoc phongHoc){
        if(!kiemtraTonTai(phongHoc.getMaphong())){
            ql.add(phongHoc);
            return true;
        }
        return false;
        
    }
        public phonghoc timphongtheoma(String maphongString, phonghoc phonghoc){
            for (phonghoc phongHoc : ql){
                if( phonghoc.getMaphong().equals(maphongString)){
                    return phonghoc;
                }
            }
            return null;
        }
    public void indsphong(){
        for( phonghoc phonghoc : ql){
            System.out.println(phonghoc);
        }
    }
    public void indsphongdatchuan(){
        for (phonghoc phonghoc : ql){
            if (phonghoc instanceof PHlythuyet) {
                PHlythuyet phongLyThuyet = (PHlythuyet) phonghoc;
                if (phongLyThuyet.isMaychieu()&& phonghoc.getSobongden()>= phonghoc.getDientich()/ 10) {
                    System.out.println(phonghoc);
                }
            } else if (phonghoc instanceof phongmaytinh) {
                phongmaytinh phongmaytinh = (phongmaytinh) phonghoc;
                if (phongmaytinh.getBaonhieumaytinh() >= phonghoc.getDientich() / 1.5
                        && phonghoc.getSobongden() >= phonghoc.getDientich() / 10) {
                    System.out.println(phonghoc);
                }
            } else if (phonghoc instanceof phongthinghiem) {
                phongthinghiem phongThiNghiem = (phongthinghiem) phonghoc;
                if (phongThiNghiem.isBonruatay() && phonghoc.getSobongden() >= phonghoc.getDientich() / 10) {
                    System.out.println(phonghoc);
                }
            }
        }
    }

    public void sapXepTheoDayNhaTangDan() {
        ql.sort(Comparator.comparing(phonghoc::getDaynha));
    }

    public void sapXepTheoDienTichGiamDan() {
        ql.sort(Comparator.comparing(phonghoc::getDientich).reversed());
    }

    public void sapXepTheoSoBongDenTangDan() {
        ql.sort(Comparator.comparing(phonghoc::getSobongden));
    }

    public void capNhatSoMayTinh(String maPhong, int soMayTinhMoi) {
        for (phonghoc phonghoc : ql) {
            if (phonghoc instanceof phongmaytinh && phonghoc.getMaphong().equals(maPhong)) {
                phongmaytinh phongMayTinh = (phongmaytinh) phonghoc;
                phongMayTinh.setBaonhieumaytinh(soMayTinhMoi);
                break;
            }
        }
    }

    public boolean xoaPhongHoc(String maPhong) {
        for (phonghoc phonghoc : ql) {
            if (phonghoc.getMaphong().equals(maPhong)) {
                ql.remove(phonghoc);
                return true;
            }
        }
        return false;
    }

    public void inTongSoPhongHoc() {
        System.out.println("Tong so phong hoc: " + ql.size());
    }

    public void inDanhSachPhongMayCoSoMayTinh(int soMayTinh) {
        for (phonghoc phongHoc : ql) {
            if (phongHoc instanceof phongmaytinh) {
                phongmaytinh phongMayTinh = (phongmaytinh) phongHoc;
                if (phongMayTinh.getBaonhieumaytinh()== soMayTinh) {
                    System.out.println(phongHoc);
                }
            }
        }
    }

    private boolean kiemTraTonTai(String maPhong) {
        for (phonghoc phongHoc : ql) {
            if (phongHoc.getMaphong().equals(maPhong)) {
                return true;
            }
        }
        return false;
    }

}
