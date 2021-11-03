package Entity;

import org.omg.CORBA.PUBLIC_MEMBER;
import sun.security.jgss.spi.GSSNameSpi;

import java.util.Date;

/**
 * Created by ASUS on 2020/9/6.
 */
public class Buy {
    private int Goodsid;           // 展示想买的商品id
    private String Goodsname;      // 商品名
    private int Price;             //价格
    private int Buyerid;           // 买方id
    private String Pictureurl;     // 商品图片url
    private String Data;            // 商品信息

    public void setGoodsid(int GID){
        this.Goodsid=GID;
    }
    public int getGoodsid(){
        return this.Goodsid;
    }

    public void setGoodsname(String GName){
        this.Goodsname= GName;
    }
    public String getGoodsname(){
        return this.Goodsname;
    }

    public void setPrice(int price){
        this.Price=price;
    }
    public int getPrice(){return this.Price;}

    public void setBuyerid(int BID){
        this.Buyerid=BID;
    }
    public int getBuyerid(){
        return this.Buyerid;
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
