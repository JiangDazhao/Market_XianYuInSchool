package Entity;

/**
 * Created by ASUS on 2020/9/14.
 */
public class WTB {
    private int Seekid;                 //��ID
    private String Wtbdata;             //����Ϣ
    private int Wprice;                 //Ԥ�ڼ۸�
    private int Userid;                 //���û�ID
    private int Adiministor_agree;     //����Աȷ�ϣ�1ͬ�⣬0��ͬ��

    public int getSeekid(){ return this.Seekid; }
    public void setSeekid(int SID){ this.Seekid=SID; }

    public String getWtbdata(){ return this.Wtbdata; }
    public void  setWtbdata(String WD){ this.Wtbdata=WD; }

    public int getWprice(){ return this.Wprice; }
    public void setWprice(int WP){ this.Wprice=WP; }

    public int getUserid(){ return this.Userid; }
    public void setUserid(int UID){ this.Userid=UID; }

    public int getAdiministor_agree(){ return this.Adiministor_agree; }
    public void setAdiministor_agree(int AA){ this.Adiministor_agree=AA; }
}
