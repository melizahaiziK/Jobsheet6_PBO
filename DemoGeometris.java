public class DemoGeometris {
     public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran("Lingkaran", "Merah", 2, 7);
        Persegi persegi1 = new Persegi("Persegi", "Biru", 1, 5);

        System.out.println("nama : " + lingkaran1.getNama()
        + "\nwarna : " + lingkaran1.getWarna()
        + "\ntebal garis : " + lingkaran1.getTebalGaris()
        + "\nluas : " + lingkaran1.hitungLuas() + "\n");

        System.out.println("nama : " + persegi1.getNama()
        + "\nwarna : " + persegi1.getWarna()
        + "\ntebal garis : " + persegi1.getTebalGaris()
        + "\nluas : " + persegi1.hitungLuas() + "\n");

        //modifikasi
        System.out.println("Modifikasi");
        persegi1.setSisi(10);
        persegi1.getSisi();
        System.out.println("nama : " + persegi1.getNama()
        + "\nwarna : " + persegi1.getWarna()
        + "\ntebal garis : " + persegi1.getTebalGaris()
        + "\nluas : " + persegi1.hitungLuas() + "\n");

    }
}
