package Entity;

/**
 * Created by ASUS on 2020/9/14.
 */
public class WTS {
    private int Sellid;                 //求卖ID
    private String Wtsdata;             //求卖信息
    private int Wprice;                 //预期价格
    private int Userid;                 //求卖用户ID
    private int Adiministor_agree;     //管理员确认，1同意，0不同意

    public int getSellid(){ return this.Sellid; }
    public void setSellid(int SID){ this.Sellid=SID; }

    public String getWtsdata(){ return this.Wtsdata; }
    public void  setWtsdata(String WD){ this.Wtsdata=WD; }

    public int getWprice(){ return this.Wprice; }
    public void setWprice(int WP){ this.Wprice=WP; }

    public int getUserid(){ return this.Userid; }
    public void setUserid(int UID){ this.Userid=UID; }

    public int getAdiministor_agree(){ return this.Adiministor_agree; }
    public void setAdiministor_agree(int AA){ this.Adiministor_agree=AA; }
}
