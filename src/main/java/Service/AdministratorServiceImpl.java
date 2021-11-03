package Service;

import DAO.AdministratorMapper;
import Entity.Administrator;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdministratorServiceImpl implements AdministratorService {
    AdministratorMapper administratorMapper;
    public void setAdministratorMapper(AdministratorMapper administratorMapper){
        this.administratorMapper=administratorMapper;
    }
    //新建一个管理员
    public int save(Administrator admin){
        return administratorMapper.save(admin);
    }
    //根据ID删除一个管理员
    public int delete(int id){
        return administratorMapper.delete(id);
    }
    //通过账号查找管理员
    public Administrator findByAccount(String Account){
        return administratorMapper.findByAccount(Account);
    }
    //查找所有管理员
    public List<Administrator> findAll(){
        return administratorMapper.findAll();
    }
}
