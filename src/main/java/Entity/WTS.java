package Entity;

/**
 * Created by ASUS on 2020/9/14.
 */
public class WTS {
    private int Sellid;                 //����ID
    private String Wtsdata;             //������Ϣ
    private int Wprice;                 //Ԥ�ڼ۸�
    private int Userid;                 //�����û�ID
    private int Adiministor_agree;     //����Աȷ�ϣ�1ͬ�⣬0��ͬ��

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
