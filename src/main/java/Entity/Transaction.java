package Entity;

import java.util.Date;

/**
 * Created by ASUS on 2020/9/6.
 */
public class Transaction {
    private int Transactionid;       //���׺�
    private int Buyerid;              //��ID
    private int Sellerid;             //����ID
    private int Goodsid;              //��ƷID
    private Date DATE;                 //����ʱ��
    private int Buyer_agree;          //��ͬ�⹺��,1Ϊͬ��,0Ϊ��ͬ��
    private int Seller_agree;         //����ͬ������,1Ϊͬ�⣬0Ϊ��ͬ��
    private int Adiministor_agree;    //����Աͬ��ñʽ���

    public int getTransactionid(){ return this.Transactionid; }
    public void setTransactionid(int TID){ this.Transactionid=TID; }

    public int getBuyerid(){ return this.Buyerid; }
    public void setBuyerid(int BID){ this.Buyerid=BID; }

    public int getSellerid(){ return  this.Sellerid; }
    public void setSellerid(int SID){ this.Sellerid=SID; }

    public int getGoodsid(){ return this.Goodsid; }
    public void setGoodsid(int GID){ this.Goodsid=GID; }

    public Date getDATE(){ return this.DATE; }
    public void setDATE(Date date){ this.DATE=date; }

    public int getBuyer_agree(){ return this.Buyer_agree; }
    public void setBuyer_agree(int BA){ this.Buyer_agree=BA; }

    public int getSeller_agree(){ return this.Seller_agree; }
    public void setSeller_agree(int SA){ this.Seller_agree=SA; }

    public int getAdiministor_agree(){ return this.Adiministor_agree; }
    public void setAdiministor_agree(int AA){ this.Adiministor_agree=AA; }
}
