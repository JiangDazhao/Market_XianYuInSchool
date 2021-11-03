package Service;

import Entity.User;
import java.util.List;

public interface UserService {
    //保存一个新的用户
    int save(User user);
    //通过ID删除一个用户
    int delete(int id);
    //通过ID更改用户信息
    int change(int id);
    //通过ID查找用户
    User findByID(int id);
    //通过账号查找用户
    User findByAccount(String Account);
    //查找所有用户
    List<User> findAll();
}
