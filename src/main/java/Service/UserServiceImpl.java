package Service;

import DAO.UserMapper;
import Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper){
        this.userMapper=userMapper;
    }
    //保存一个新的用户
    public int save(User user){
        return userMapper.save(user);
    }
    //通过ID删除一个用户
    public int delete(int id){
        return userMapper.delete(id);
    }
    //通过ID更改用户信息
    public int change(int id){
        return userMapper.change(id);
    }
    //通过ID查找用户
    public User findByID(int id){
        return userMapper.findByID(id);
    }
    //通过账号查找用户
    public User findByAccount(String Account){
        return userMapper.findByAccount(Account);
    }
    //查找所有用户
    public List<User> findAll(){
        return userMapper.findAll();
    }
}
