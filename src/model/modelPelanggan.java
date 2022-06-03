/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import koneksi.koneksiDB;

/**
 *
 * @author ASUS
 */
public class modelPelanggan {

    public static String getLoginId_pelanggan() {
        return loginId_pelanggan;
    }

    public static void setLoginId_pelanggan(String aLoginId_pelanggan) {
        loginId_pelanggan = aLoginId_pelanggan;
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

    public static String getLoginNo_identitas() {
        return loginNo_identitas;
    }

    public static void setLoginNo_identitas(String aLoginNo_identitas) {
        loginNo_identitas = aLoginNo_identitas;
    }

    public static String getLoginNo_hp() {
        return loginNo_hp;
    }

    public static void setLoginNo_hp(String aLoginNo_hp) {
        loginNo_hp = aLoginNo_hp;
    }

    public static String getLoginAlamat() {
        return loginAlamat;
    }

    public static void setLoginAlamat(String aLoginAlamat) {
        loginAlamat = aLoginAlamat;
    }

    public static String getLoginPinjam() {
        return loginPinjam;
    }

    public static void setLoginPinjam(String aLoginPinjam) {
        loginPinjam = aLoginPinjam;
    }
    private koneksiDB koneksi;
    private ResultSet rsPelanggan;
    private String query;
    private boolean status;
//    private ResultSet rsStaff;
    
    public modelPelanggan(){
        koneksi = new koneksiDB();
        koneksi.getConn();
    }
    
    private String id_pelanggan, nama, jenkel, no_identitas, no_hp, alamat, pinjam;
    
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
    
    
    private static String loginId_pelanggan, loginNama,loginJenkel,loginNo_identitas, loginNo_hp, loginAlamat, loginPinjam;
    
    
    public ResultSet tampilPelanggan(){
        query = "SELECT * FROM tbl_pelanggan ";
        status = koneksi.eksekusiQuery(query, true);
        if(status){
            rsPelanggan = koneksi.getRs();
        }
        return rsPelanggan;
    }
    public boolean insertPelanggan(){
        query = "insert into tbl_karyawan (id_pelanggan, nama, jenkel, no_identitas, no_hp, alamat, pinjam) values ('"+id_pelanggan+"','"+nama+"','"+jenkel+"','"+no_identitas+"','"+no_hp+"','"+alamat+"','"+pinjam+"')";
        status= koneksi.eksekusiQuery(query, false);
        return status;
    }
   
    public boolean deletePelanggan(){
        query = "delete from tbl_pelanggan where id_pelanggan='"+id_pelanggan+"'";
        status= koneksi.eksekusiQuery(query, false);
        return status;
    }
    
    public boolean updatePelanggan(){
        query = "update tbl_pelanggan set nama='"+nama+"',jenkel='"+jenkel+"',no_identitas='"+no_identitas+"',no_hp='"+no_hp+"',alamat='"+alamat+"',pinjam='"+pinjam+"' where id_pelanggan='"+id_pelanggan+"'";
        status= koneksi.eksekusiQuery(query, false);
        return status;
    }
    
    public ResultSet tampilPelangganAktif(){
        query = "SELECT * FROM tbl_pelanggan where id_pelanggan='"+id_pelanggan+"'";
        status = koneksi.eksekusiQuery(query, true);
        if(status){
            rsPelanggan = koneksi.getRs();
        }
        return rsPelanggan;
    }
}
