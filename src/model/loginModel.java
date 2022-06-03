package model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import koneksi.koneksiDB;
public class loginModel {

    
    private koneksiDB koneksi;
    private ResultSet rsLogin;
    private String query;
    private boolean status;
//    private ResultSet rsStaff;
    
    public loginModel(){
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
    
     public boolean login(){
        query = "SELECT * "
                + "FROM tbl_karyawan "
                + "WHERE id_karyawan = '"+id_karyawan+"' AND password = '"+password+"'";
        status = koneksi.eksekusiQuery(query, true);

        if(status){
            rsLogin = koneksi.getRs();
            try {
                rsLogin.next();
                loginId_karyawan = rsLogin.getString(1);
                loginNama = rsLogin.getString(2);
                loginJenkel = rsLogin.getString(3);
                loginNohp = rsLogin.getString(4);
                loginAlamat = rsLogin.getString(5);
                loginPassword = rsLogin.getString(6);
                loginAkses = rsLogin.getString(7);
                
            } catch (SQLException se) {
                status = false;
            }
        }
        return status;
    }
}