package Entity;
import java.util.Date;
/**
 * Created by ASUS on 2020/9/6.
 */
public class Message {
    private int Messageid;        // 消息id
    private int Buyerid;          // 消息内容
    private int Sellerid;         // 发送者的id
    private Date DATE;             // 发送时间

    public int getMessageid() {
        return this.Messageid;
    }
    public void setMessageid(int Mid) {
        this.Messageid = Mid;
    }

    public int getBuyerid() {
        return this.Buyerid;
    }
    public void setBuyerid(int BID) {
        this.Buyerid = BID;
    }

    public int getSellerid() {
        return this.Sellerid;
    }
    public void setSellerid(int SID) {
        this.Sellerid = SID;
    }

    public Date getDATE(){ return this.DATE; }
    public void setDATE(Date date){ this.DATE=date; }
}
