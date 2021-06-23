package quanlydatdat;

public class GiaoDichDat extends GiaoDich{
    public GiaoDichDat() {
    }

    public GiaoDichDat(int maGiaoDich, String ngayGiaoDich, double donGia, String loai, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, loai, dienTich);
    }

    public double getThanhTien() {
        if (this.getLoai().equals("A"))
            return this.getDienTich() * this.getDonGia() * 1.5;
        else
            return this.getDienTich() * this.getDonGia();
    }



}
