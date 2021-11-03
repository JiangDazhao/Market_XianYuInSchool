package Entity;

/**
 * Created by ASUS on 2020/9/14.
 */
public class Administrator {
    private int Userid;        //管理员ID
    private String Account;    //管理员账号
    private String password;   //管理员密码
    public void setUserid(int uid){
        this.Userid=uid;
    }
    public void setAccount(String account){
        this.Account=account;
    }
    public void setPassword(String pw){
        this.password=pw;
    }
    public int getUserid(){
        return this.Userid;
    }
    public String getAccount(){
        return this.Account;
    }
    public String getPassword(){ return this.password;}
}
