// Polymorphism.java
class BangunDatar {
    void luas() {
        System.out.println("Menghitung luas bangun datar");
    }
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Overriding
    @Override
    void luas() {
        System.out.println("Luas Persegi: " + (sisi * sisi));
    }

    // Overloading
    void luas(double sisiLain) {
        System.out.println("Luas Persegi (overload): " + (sisiLain * sisiLain));
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        BangunDatar b = new BangunDatar();
        Persegi p = new Persegi(4);

        // Overriding
        b.luas();
        p.luas();

        // Overloading
        p.luas(5);
    }
}
