public class Lingkaran extends Geometris {
    private double jariJari;
    public Lingkaran() {
    }
    public Lingkaran(String nama, String warna, int tebalGaris, double jariJari) {
        super(nama, warna, tebalGaris);
        this.jariJari = jariJari;
    }
    public double getJariJari() { 
        return jariJari; 
    }
    public void setJariJari(double jariJari) { 
        this.jariJari = jariJari; 
    }
    public double hitungLuas() {
        return 3.14 * jariJari * jariJari;
    }
}