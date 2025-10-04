package abstraction;

abstract class Kendaraan {
    abstract void berjalan();

    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}

interface BahanBakar {
    void isiBahanBakar();
}

class Mobil extends Kendaraan implements BahanBakar {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan di jalan raya.");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bensin untuk mobil.");
    }
}

class Motor extends Kendaraan implements BahanBakar {
    @Override
    void berjalan() {
        System.out.println("Motor sedang melaju di jalan.");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bensin untuk motor.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil();
        Kendaraan k2 = new Motor();

        k1.info();
        k1.berjalan();
        ((BahanBakar) k1).isiBahanBakar();

        k2.info();
        k2.berjalan();
        ((BahanBakar) k2).isiBahanBakar();
    }
}
