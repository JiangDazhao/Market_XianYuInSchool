package DAO;

import Entity.Sell;

public interface Sell_MessageMapper {
    //保存一个上架的商品
    public int save(Sell sell);
    //删除一个上架的商品
    public int delete(Sell sell);
}
