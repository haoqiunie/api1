package test;


import com.alibaba.fastjson.JSON;
import com.mht.Application;
import com.mht.config.OSSConfig;
import com.mht.entity.GoodsShoppingCart;
import com.mht.mapper.GoodsShoppingCartMapper;
import com.mht.service.IGoodsShoppingCartService;
import com.mht.service.IUserOrderService;
import com.mht.util.AliyunOSSUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.List;

/**
 * @description: 订单测试类
 * @author: 张逸峰
 * @create: 2019-07-26 14:50
 **/
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class UserOrderTest {


    @Autowired
    private IGoodsShoppingCartService goodsShoppingCartService;

    @Autowired
    private GoodsShoppingCartMapper goodsShoppingCartMapper;

    @Autowired
    private IUserOrderService userOrderService;

    @Test
    public void testAdd(){

        String str = "[{\"id\":250119,\"quantity\":1}]";

        //Integer save = goodsShoppingCartService.save(str, new User());

        Integer totalNum = goodsShoppingCartService.getTotalNum(1059);
        System.out.println(totalNum);


    }


    @Test
    public void testC() throws Exception{

        List<GoodsShoppingCart> list = goodsShoppingCartService.getList(1059);
        System.out.println(JSON.toJSONString(list));


    }


    @Test
    public void testB() {

        /*String allFileHost = OSSConfig.OSS_FILE_HOST;
        System.out.println(allFileHost);*/

        File file = new File("C:\\Users\\EDZ\\Desktop\\1554620959676.jpg");

        String upload = AliyunOSSUtil.upload(file);

    }

    @Test
    public void testQ() {


    }






}
