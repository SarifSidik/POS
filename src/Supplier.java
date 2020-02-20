public class Supplier {

//    inisialisasi variabel
    int id_supplier;
    String Nama_Supplier;
    String Alamat;
    String Instansi;

    public int getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getNama_supplier() {
        return Nama_Supplier;
    }

    public void setNama_supplier(String nama_supplier) {
        this.Nama_Supplier = nama_supplier;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public String getInstansi() {
        return Instansi;
    }

    public void setInstansi(String instansi) {
        this.Instansi = instansi;
    }

    public Supplier(int id_supplier, String nama, String alamat, String instansi) {
        this.id_supplier = id_supplier;
        Nama_Supplier = nama;
        this.Alamat = alamat;
        this.Instansi = instansi;
    }
}
