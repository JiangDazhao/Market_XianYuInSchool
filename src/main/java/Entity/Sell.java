package Entity;

import java.util.Date;

/**
 * Created by ASUS on 2020/9/6.
 */
public class Sell {
    private int Goodsid;           // չʾ�������Ʒid
    private String Goodsname;      // ��Ʒ��
    private int Price;             //�۸�
    private int Sellerid;          // ����id
    private String Pictureurl;     // ��ƷͼƬurl
    private String Data;            // ��Ʒ��Ϣ

    public void setGoodsid(int GID){
        this.Goodsid=GID;
    }
    public int setGoodsid(){
        return this.Goodsid;
    }

    public void setGoodsname(String GName){
        this.Goodsname= GName;
    }
    public String getGoodsname(){
        return this.Goodsname;
    }

    public void setPrice(int price){this.Price=price;}
    public int getPrice(){
        return this.Price;
    }

    public void setSellerid(int SID){
        this.Sellerid=SID;
    }
    public int getSellerid(){
        return this.Sellerid;
    }

    public void setPictureurl(String PURL){
        this.Pictureurl=PURL;
    }
    public String getPictureurl(){
        return this.Pictureurl;
    }

    public void setData(String data){
        this.Data=data;
    }
    public String getData(){
        return this.Data;
    }
}
