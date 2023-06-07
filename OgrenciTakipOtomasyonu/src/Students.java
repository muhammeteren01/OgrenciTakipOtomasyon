public class Students {
    private String ogrenci_no;
    private String ogrenci_adi;
    private String ogrenci_soyadi;
    private String ogrenci_bolum;
    
     public Students(String ogrenci_no, String ogrenci_adi, String ogrenci_soyadi, String ogrenci_bolum) {
        this.ogrenci_no = ogrenci_no;
        this.ogrenci_adi = ogrenci_adi;
        this.ogrenci_soyadi = ogrenci_soyadi;
        this.ogrenci_bolum = ogrenci_bolum;
    }
   
    
    public String getOgrenci_no() {
        return ogrenci_no;
    }

    public void setOgrenci_no(String ogrenci_no) {
        this.ogrenci_no = ogrenci_no;
    }

    public String getOgrenci_adi() {
        return ogrenci_adi;
    }

    public void setOgrenci_adi(String ogrenci_adi) {
        this.ogrenci_adi = ogrenci_adi;
    }

    public String getOgrenci_soyadi() {
        return ogrenci_soyadi;
    }

    public void setOgrenci_soyadi(String ogrenci_soyadi) {
        this.ogrenci_soyadi = ogrenci_soyadi;
    }

    public String getOgrenci_bolum() {
        return ogrenci_bolum;
    }

    public void setOgrenci_bolum(String ogrenci_bolum) {
        this.ogrenci_bolum = ogrenci_bolum;
    }         
}
