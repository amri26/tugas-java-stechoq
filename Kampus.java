public abstract class Kampus{
    protected String nama;
    protected String alamat;
    protected int tahun;

    public Kampus(String nama, String alamat, int tahun) {
        this.nama = nama;
        this.alamat = alamat;
        this.tahun = tahun;
    }

    abstract void diesnatalis();
    abstract void setNama(String x);
    abstract void setAlamat(String x);
    abstract void setTahun(int x);
    abstract String getNama();
    abstract String getAlamat();
    abstract int getTahun();
}