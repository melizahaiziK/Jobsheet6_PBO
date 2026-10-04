public class Geometris {
    private String nama;
    private String warna;
    private int tebalGaris;

    public Geometris() {
    }

    public Geometris(String nama, String warna, int tebalGaris) {
        this.nama = nama;
        this.warna = warna;
        this.tebalGaris = tebalGaris;
    }

    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) {
        this.nama = nama; 
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) { 
        this.warna = warna; 
    }
    public int getTebalGaris() {
        return tebalGaris;
    }
    public void setTebalGaris(int tebalGaris) { 
        this.tebalGaris = tebalGaris; 
    }
}
