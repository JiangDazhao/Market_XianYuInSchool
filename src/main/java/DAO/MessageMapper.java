package DAO;

import java.util.List;
import Entity.Message;


public interface MessageMapper {
    //保存一条消息
    public int save(Message message);
    //删除一条消息
    public int delete(int id);
    // 查询参数用户收到的消息列表
    public List<Message> listByReceiveUname(String receiveUname);
    //根据短信息id查一条短信息
    public Message findMessage(int id);
}
