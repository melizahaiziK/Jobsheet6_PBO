public class Persegi extends Geometris {
    private double sisi;
    public Persegi() {
    }
    public Persegi(String nama, String warna, int tebalGaris, double sisi) {
        super(nama, warna, tebalGaris);
        this.sisi = sisi;
    }
    public double getSisi() { 
        return sisi; 
    }
    public void setSisi(double sisi) { 
        this.sisi = sisi; 
    }
    public double hitungLuas() {
        return sisi * sisi;
    }
}