package Entity;
import java.util.Date;
/**
 * Created by ASUS on 2020/9/6.
 */
public class Message {
    private int Messageid;        // ��Ϣid
    private int Buyerid;          // ��Ϣ����
    private int Sellerid;         // �����ߵ�id
    private Date DATE;             // ����ʱ��

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
