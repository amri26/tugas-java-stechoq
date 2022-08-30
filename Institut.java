public class Institut extends Kampus{
    private String yayasan;

    public Institut(String nama, String alamat, int tahun, String yayasan) {
        super(nama, alamat, tahun);
        this.yayasan = yayasan;
    }

    @Override
    public void diesnatalis() {
        System.out.println("Sedang ada konser tahunan " + nama);
    }

    @Override
    public void setNama(String x){
        nama = x;
    }

    @Override
    public void setAlamat(String x){
        alamat = x;
    }

    @Override
    public void setTahun(int x){
        tahun = x;
    }

    public void setYayasan(String x){
        yayasan = x;
    }

    @Override
    public String getNama(){
        return nama;
    }

    @Override
    public String getAlamat(){
        return alamat;
    }

    @Override
    public int getTahun(){
        return tahun;
    }

    public String getYayasan(){
        return yayasan;
    }
}