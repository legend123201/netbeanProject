/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanghoa;

import doituongtest.DoiTuongTest1;

/**
 *
 * @author legen
 */
public class HangDienMay extends HangHoa {

    private int thoiGianBaoHanh;
    private int dienAp;
    private int congSuat;
    private DoiTuongTest1 dtt1 = new DoiTuongTest1();

    public HangDienMay() {
    }

    public HangDienMay(int thoiGianBaoHanh, int dienAp, int congSuat, String maHang, String tenHang, long donGia) {
        super(maHang, tenHang, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap thoi gian bao hanh: ");
        thoiGianBaoHanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dien ap: ");
        dienAp = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap cong suat: ");
        congSuat = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh);
        System.out.println("Dien ap: " + dienAp);
        System.out.println("Cong suat: " + congSuat);
    }

    public DoiTuongTest1 getDtt1() {
        return dtt1;
    }

    public void setDtt1(DoiTuongTest1 dtt1) {
        this.dtt1 = dtt1;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getDienAp() {
        return dienAp;
    }

    public void setDienAp(int dienAp) {
        this.dienAp = dienAp;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

}
