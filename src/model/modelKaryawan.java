package model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import koneksi.koneksiDB;

public class modelKaryawan {
    private koneksiDB koneksi;
    private ResultSet rsKaryawan;
    private String query;
    private boolean status;
//    private ResultSet rsStaff;
    
    public modelKaryawan(){
        koneksi = new koneksiDB();
        koneksi.getConn();
    }
    
    private String id_karyawan, nama, jenkel, no_hp, alamat, password, akses;

    public String getId_karyawan() {
        return id_karyawan;
    }

    public void setId_karyawan(String id_karyawan) {
        this.id_karyawan = id_karyawan;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAkses() {
        return akses;
    }

    public void setAkses(String akses) {
        this.akses = akses;
    }
    
    private static String loginId_karyawan, loginNama,loginJenkel,loginNohp,loginAlamat, loginPassword, loginAkses;
    public static String getLoginId_karyawan() {
        return loginId_karyawan;
    }

    public static void setLoginId_karyawan(String aLoginId_karyawan) {
        loginId_karyawan = aLoginId_karyawan;
    }

    public static String getLoginNama() {
        return loginNama;
    }

    public static void setLoginNama(String aLoginNama) {
        loginNama = aLoginNama;
    }

    public static String getLoginJenkel() {
        return loginJenkel;
    }

    public static void setLoginJenkel(String aLoginJenkel) {
        loginJenkel = aLoginJenkel;
    }

    public static String getLoginNohp() {
        return loginNohp;
    }

    public static void setLoginNohp(String aLoginNohp) {
        loginNohp = aLoginNohp;
    }

    public static String getLoginAlamat() {
        return loginAlamat;
    }

    public static void setLoginAlamat(String aLoginAlamat) {
        loginAlamat = aLoginAlamat;
    }

    public static String getLoginPassword() {
        return loginPassword;
    }

    public static void setLoginPassword(String aLoginPassword) {
        loginPassword = aLoginPassword;
    }

    public static String getLoginAkses() {
        return loginAkses;
    }

    public static void setLoginAkses(String aLoginAkses) {
        loginAkses = aLoginAkses;
    }
    
    public ResultSet tampilKaryawan(){
        query = "SELECT * FROM tbl_karyawan ";
        status = koneksi.eksekusiQuery(query, true);
        if(status){
            rsKaryawan = koneksi.getRs();
        }
        return rsKaryawan;
    }
    public boolean insertKaryawan(){
        query = "insert into tbl_karyawan (id_karyawan, nama, jenkel, no_hp, alamat, password, akses) values ('"+id_karyawan+"','"+nama+"','"+jenkel+"','"+no_hp+"','"+alamat+"','"+password+"','"+akses+"')";
        status= koneksi.eksekusiQuery(query, false);
        return status;
    }
   
    public boolean deleteKaryawan(){
        query = "delete from tbl_karyawan where id_karyawan='"+id_karyawan+"'";
        status= koneksi.eksekusiQuery(query, false);
        return status;
    }
    
    public boolean updateKaryawan(){
        query = "update tbl_karyawan set nama='"+nama+"',jenkel='"+jenkel+"',no_hp='"+no_hp+"',alamat='"+alamat+"',password='"+password+"',akses='"+akses+"' where id_karyawan='"+id_karyawan+"'";
        status= koneksi.eksekusiQuery(query, false);
        return status;
    }
    
    public ResultSet tampilKaryawanAktif(){
        query = "SELECT * FROM tbl_karyawan where id_karyawan='"+id_karyawan+"'";
        status = koneksi.eksekusiQuery(query, true);
        if(status){
            rsKaryawan = koneksi.getRs();
        }
        return rsKaryawan;
    }
}