package test;

import com.alibaba.fastjson.JSONObject;
import com.mht.util.RedisUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @description: 测试类
 * @author: 张逸峰
 * @create: 2019-08-05 17:47
 **/
public class Test {

    public static void main(String[] args) {
        String str = "[{\"goodsSpecificationId\":251319,\"quantity\":1}]";

        List<Map<String, Object>> list = JSONObject.parseObject(str,List.class);

        Map<String, Object> map = list.get(0);

        for (Map.Entry<String, Object> entry: map.entrySet()) {
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }

        Map<String, Object> orderRefund = new HashMap<>();
        orderRefund.put("user_id",1059);
        orderRefund.put("order_id","");
        orderRefund.put("refund_amount",0.0);

        orderRefund.put("refund_reason","");
        orderRefund.put("goods_state",null);
        orderRefund.put("refund_status",null);
        orderRefund.put("refund_explain",null);
        orderRefund.put("refund_goods",new ArrayList<>());
        orderRefund.put("exchange_goods",new ArrayList<>());


    }


    private void a(){
        RedisUtil.decr("" ,0L);
        RedisUtil.del("");
        RedisUtil.expire("",0);
        RedisUtil.get("");
        RedisUtil.getExpire("");

    }



    }

