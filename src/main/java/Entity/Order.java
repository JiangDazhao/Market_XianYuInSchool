package Entity;

/**
 * Created by ASUS on 2020/9/14.
 */
public class Order {
    private int Userid;    //用户ID
    private int Goodsid;   //商品ID
    private int Orderid;   //订单栏ID

    public int getUserid(){ return this.Userid; }
    public void setUserid(int UID){ this.Userid=UID; }

    public int getGoodsid(){ return this.Goodsid; }
    public void setGoodsid(int GID){ this.Goodsid=GID; }

    public int getOrderid(){ return this.Orderid; }
    public void setOrderid(int OID){ this.Orderid=OID; }
}
