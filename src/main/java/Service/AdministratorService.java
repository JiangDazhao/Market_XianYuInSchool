package Service;

import Entity.Administrator;

import java.util.List;
public interface AdministratorService {
    //新建一个管理员
    int save(Administrator admin);
    //根据ID删除一个管理员
    int delete(int id);
    //通过账号查找管理员
    Administrator findByAccount(String Account);
    //查找所有管理员
    List<Administrator> findAll();
}
