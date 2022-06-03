package control;

import model.modelKaryawan;
import view.form_karyawan;
import java.sql.ResultSet;


public class controlKaryawan {
    private form_karyawan view;
    private modelKaryawan model;

    private String id_karyawan,nama,jenkel,no_hp,alamat,password,akses;
    public controlKaryawan(form_karyawan view){
        this.view = view;
        model = new modelKaryawan();
    }
   
    public  ResultSet tampilKaryawan(){
        return model.tampilKaryawan();
    }
    
    public  ResultSet tampilKaryawanAktif(){
        return model.tampilKaryawanAktif();
    }

   
   public void karyawanAktif(String id_karyawan){
       model.setId_karyawan(id_karyawan);
   }
   public void inputKaryawan(String nama, String jenkel, String no_hp, String alamat, String password, String akses){
       model.setNama(nama);
       model.setJenkel(jenkel);
       model.setNo_hp(no_hp);
       model.setAlamat(alamat);
       model.setPassword(password);
       model.setAkses(akses);
   }
    
    public boolean insertKaryawan(){
        return model.insertKaryawan();
    }
    
    public void hapusKaryawan(String id_karyawan){
        model.setId_karyawan(id_karyawan);
    }
    public boolean deleteKaryawan(){
        return model.deleteKaryawan();
    }
    
    public void ubahKaryawan(String id_karyawan,String nama, String jenkel, String no_hp, String alamat, String password, String akses){
        model.setId_karyawan(id_karyawan);
        model.setNama(nama);
        model.setJenkel(jenkel);
        model.setNo_hp(no_hp);
        model.setAlamat(alamat);
        model.setPassword(password);
        model.setAkses(akses);
        
    }
    public boolean updateKaryawan(){
        return model.updateKaryawan();
    }
}