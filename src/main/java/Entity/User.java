package Entity;

import java.util.Date;

/**
 * Created by ASUS on 2020/9/6.
 */
public class User {
    private int Userid;        //�û�ID
    private String Account;    //�û��˺�
    private String password;   //�û�����
    private int Sex;           //�û��Ա�,1Ϊ�У�0ΪŮ
    private String Email;      //�û�����
    private String Telephone;  //�û��ֻ�����

    public void setUserid(int uid){
        this.Userid=uid;
    }
    public int getUserid(){
        return Userid;
    }

    public void setAccount(String account){
        this.Account=account;
    }
    public String getAccount(){
        return Account;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String pw){
        this.password=pw;
    }

    public void setSex(int sex) {
        this.Sex = sex;
    }
    public int getSex(){
        return this.Sex;
    }

    public void setEmail(String email){
        this.Email=email;
    }
    public String getEmail(){
        return this.Email;
    }

    public void setTelephone(String telephone){
        this.Telephone=telephone;
    }
    public String getTelephone(){
        return this.Telephone;
    }
}
