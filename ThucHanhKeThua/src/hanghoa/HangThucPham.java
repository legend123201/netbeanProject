/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanghoa;

/**
 *
 * @author legen
 */
public class HangThucPham extends HangHoa {
    private int ngaySanXuat;
    private int ngayHetHan;

    public HangThucPham() {
    }

    public HangThucPham(int ngaySanXuat, int ngayHetHan, String maHang, String tenHang, long donGia) {
        super(maHang, tenHang, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap ngay san xuat: ");
        ngaySanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ngay het han: ");
        ngayHetHan = Integer.parseInt(scanner.nextLine());
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Ngay san xuat: " + ngaySanXuat);
        System.out.println("Ngay het han: " + ngayHetHan);
    }
    
    public int getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(int ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public int getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(int ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    
}
