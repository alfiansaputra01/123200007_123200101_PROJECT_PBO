package control;

import model.modelPelanggan;
import view.form_pelanggan;
import java.sql.ResultSet;

public class controlPelanggan {
    private form_pelanggan view;
    private modelPelanggan model;

    private String id_pelanggan,nama,jenkel,no_identitas,no_hp, alamat, pinjam;
    public controlPelanggan(form_pelanggan view){
        this.view = view;
        model = new modelPelanggan();
    }
   
    public  ResultSet tampilPelanggan(){
        return model.tampilPelanggan();
    }
    
    public  ResultSet tampilPelangganAktif(){
        return model.tampilPelangganAktif();
    }

   
   public void pelangganAktif(String id_pelanggan){
       model.setId_pelanggan(id_pelanggan);
   }
   public void inputPelanggan(String id_pelanggan, String nama,String jenkel, String no_identitas, String no_hp, String alamat, String pinjam){
       model.setId_pelanggan(id_pelanggan);
       model.setNama(nama);
       model.setJenkel(jenkel);
       model.setNo_identitas(no_identitas);
       model.setNo_hp(no_hp);
       model.setAlamat(alamat);
       model.setPinjam(pinjam);
   }
    
    public boolean insertPelanggan(){
        return model.insertPelanggan();
    }
    
    public void hapusPelanggan(String id_pelanggan){
        model.setId_pelanggan(id_pelanggan);
    }
    public boolean deletePelanggan(){
        return model.deletePelanggan();
    }
    
    public void ubahKaryawan(String id_pelanggan,String nama, String jenkel, String no_identitas, String no_hp, String alamat, String pinjam){
        model.setId_pelanggan(id_pelanggan);
        model.setNama(nama);
        model.setJenkel(jenkel);
        model.setNo_identitas(no_identitas);
        model.setNo_hp(no_hp);
        model.setPinjam(pinjam);
        
    }
    public boolean updatePelanggan(){
        return model.updatePelanggan();
    }

    public String getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(String id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenkel() {
        return jenkel;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    public String getNo_identitas() {
        return no_identitas;
    }

    public void setNo_identitas(String no_identitas) {
        this.no_identitas = no_identitas;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPinjam() {
        return pinjam;
    }

    public void setPinjam(String pinjam) {
        this.pinjam = pinjam;
    }
}
