package mango.mango.service;

import java.util.List;

import mango.mango.model.OrdersPayVO;

public interface OrdersPayService {   
   // 리스트
   List<OrdersPayVO> selectAllOrdersPayList(OrdersPayVO opVO) throws Exception;
   // 등록
   int insertOrdersPay(OrdersPayVO opVO) throws Exception;
   Integer selectAllOrdersPayCount(OrdersPayVO opVO) throws Exception;
   int updateDeliveryState(OrdersPayVO opVO) throws Exception;   
   int updateTracking(OrdersPayVO opVO) throws Exception;
}