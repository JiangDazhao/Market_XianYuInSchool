package DAO;

import Entity.Buy;

public interface Buy_MessageMapper {
    //保存一个上架的商品
    int save(Buy buy);
    //删除一个上架的商品
    int delete(Buy buy);
    //更改一个商品的信息
    int change(Buy buy);
    //通过ID查找一个商品
    Buy findByID(int id);
}
