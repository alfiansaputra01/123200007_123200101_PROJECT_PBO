package control;

import model.loginModel;
import view.form_login;

public class loginControl {
    private form_login view;
    private loginModel model;

    private String id_karyawan,nama,jenkel,no_hp,alamat,password,akses;
    
    
    public loginControl(form_login view){
        this.view = view;
        model = new loginModel();
    }
    
    public boolean login(String id_karyawan, String password){
        model.setId_karyawan(id_karyawan);
        model.setPassword(password);
        return model.login();
    }
    public static String getAkses() {
        return loginModel.getLoginAkses();
    }
    public static String getNama() {
        return loginModel.getLoginNama();
    }
    public static String getPassword() {
        return loginModel.getLoginPassword();
    }
    public static String getLoginId_karyawan() {
        return loginModel.getLoginId_karyawan();
    }
}