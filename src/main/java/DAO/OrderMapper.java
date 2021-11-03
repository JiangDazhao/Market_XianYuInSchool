package DAO;

import Entity.Order;

public interface OrderMapper {
    //保存一个订单
    public int save(Order order);
    //删除一个订单
    public int delete(Order order);
}
