package Entity;

import java.util.Date;

/**
 * Created by ASUS on 2020/9/6.
 */
public class User {
    private int Userid;        //用户ID
    private String Account;    //用户账号
    private String password;   //用户密码
    private int Sex;           //用户性别,1为男，0为女
    private String Email;      //用户邮箱
    private String Telephone;  //用户手机号码

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
