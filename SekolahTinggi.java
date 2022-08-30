public class SekolahTinggi extends Kampus{
    private String kementerian;

    public SekolahTinggi(String nama, String alamat, int tahun, String kementerian) {
        super(nama, alamat, tahun);
        this.kementerian = kementerian;
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

    public void setKementerian(String x){
        kementerian = x;
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

    public String getKementerian(){
        return kementerian;
    }
}