/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main1 {
    public static void main(String[]agrs){
        qlphonghoc qL = new qlphonghoc();
        Scanner sc = new Scanner(System.in);
        
        int menu;
        do{
            System.out.println("0. thoat");
            System.out.println("MENU");
            System.out.println("1. them phong hoc");
            System.out.println("2. tim kiem phong hoc theo ma");
            System.out.println("3. in toan danh sach phong hoc");
            System.out.println("4. in danh sach phong hoc dat chuan");
            System.out.println("5. sap xep danh sach tang giam dan theo day nha");
            System.out.println("6. sap xep danh sach giam dan theo dien tich");
            System.out.println("7. sap xep danh tang dan theo so bong den");
            System.out.println("8. cap nhat may tinh cho mot phong may tinh");
            System.out.println("9. xoa mot phong hoc");
            System.out.println("10. in tong so phong hoc");
            System.out.println("11. in danh sach phong may tinh co so may tinh");
            System.out.print("Nhập lựa chọn của bạn: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println(" Nhap ma phong");
                    String maphong = sc.nextLine();
                    
                    System.out.println("Nhap day nha");
                    String daynha = sc.nextLine();
                    
                    System.out.println("nhap dien tich");
                    int dientich = sc.nextInt();
                    
                    System.out.println("nhap so bong den");
                    int sobongden = sc.nextInt();
                    System.out.println("Loại phòng học:");
                    System.out.println("1. Phòng lý thuyết");
                    System.out.println("2. Phòng máy tính");
                    System.out.println("3. Phòng thí nghiệm");
                    System.out.print("Nhập lựa chọn của bạn: ");
                    int loaiPhong = sc.nextInt();

                    switch (loaiPhong) {
                        case 1:
                            System.out.print("Có máy chiếu ? (true/false): ");
                            boolean coMayChieu = sc.nextBoolean();
                            PHlythuyet phonglythuyet = new PHlythuyet(coMayChieu, maphong, daynha, dientich, sobongden);
                            if (qL.themphonghoc(phonglythuyet)) {
                                System.out.println("Thêm phòng học thành công!");
                            } else {
                                System.out.println("Mã phòng đã tồn tại!");
                            }
                            break;
                        case 2:
                            System.out.print("Nhấp số máy tính: ");
                            int soMayTinh = sc.nextInt();
                            phongmaytinh phongMayTinh = new phongmaytinh(soMayTinh, maphong, daynha, dientich, sobongden);
                            if (qL.themphonghoc(phongMayTinh)) {
                                System.out.println("Thêm phòng học thành công!");
                            } else {
                                System.out.println("Mã phòng đã tồn tại!");
                            }
                            break;
                        case 3:
                            System.out.print("Nhập chuyên ngành: ");
                            String chuyenNganh = sc.next();
                            System.out.print("Nhập sức chứa: ");
                            int sucChua = sc.nextInt();
                            System.out.print("Có bồn rửa? (true/false): ");
                            boolean coBonRua = sc.nextBoolean();
                            phongthinghiem phongThiNghiem = new phongthinghiem(chuyenNganh, daynha, coBonRua, maphong, daynha, dientich, sobongden);
                            if (qL.themphonghoc(phongThiNghiem)) {
                                System.out.println("Thêm phòng học thành công!");
                            } else {
                                System.out.println("Mã phòng đã tồn tại!");
                            }
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ!");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Nhập mã phòng cần tìm: ");
                    String maPhongTimKiem = sc.next();
                    phonghoc phongHocTimKiem = qL.timphongtheoma(maPhongTimKiem);
                    if (phongHocTimKiem != null) {
                        System.out.println(phongHocTimKiem);
                    } else {
                        System.out.println("Không tìm thấy phòng học!");
                    }
                    break;
                case 3:
                    qL.indsphong();
                    break;
                case 4:
                    qL.indsphongdatchuan();
                    break;
                case 5:
                    qL.sapXepTheoDayNhaTangDan();
                    System.out.println("Đã sắp xếp danh sách tăng dần theo dãy nhà!");
                    break;
                case 6:
                    qL.sapXepTheoDienTichGiamDan();
                    System.out.println("Đã sắp xếp danh sách giảm dần theo diện tích!");
                    break;
                case 7:
                    qL.sapXepTheoSoBongDenTangDan();
                    System.out.println("Đã sắp xếp danh sách tăng dần theo số bóng đèn!");
                    break;
                case 8:
                    System.out.print("Nhập mã phòng máy tính cần cập nhật: ");
                    String maPhongCapNhat = sc.next();
                    System.out.print("Nhập số máy tính mới: ");
                    int soMayTinhMoi = sc.nextInt();
                    qL.capNhatSoMayTinh(maPhongCapNhat, soMayTinhMoi);
                    System.out.println("Đã cập nhật số máy tính cho phòng học!");
                    break;
                case 9:
                    System.out.print("Nhập mã phòng học cần xóa: ");
                    String maPhongXoa = sc.next();
                    if (qL.xoaPhongHoc(maPhongXoa)) {
                        System.out.println("Đã xóa phòng học!");
                    } else {
                        System.out.println("Không tìm thấy phòng học!");
                    }
                    break;
                case 10:
                   qL.inTongSoPhongHoc();
                    break;
                case 11:
                    qL.inDanhSachPhongMayCoSoMayTinh(60);
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (menu != 0);

        sc.close();
    }
}
