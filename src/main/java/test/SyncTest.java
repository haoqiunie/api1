package test;


import com.mht.Application;
import com.mht.entity.*;
import com.mht.mapper.GoodsSubjectMapper;
import com.mht.mapper.TempBrandMapper;
import com.mht.mapper.UserSeller1Mapper;
import com.mht.mapper.UserSellerMapper;
import com.mht.wrapper.UWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class SyncTest {


    @Autowired
    private UserSeller1Mapper userSellerMapper;


    @Autowired
    private GoodsSubjectMapper goodsSubjectMapper;

    @Autowired
    private TempBrandMapper tempBrandMapper;






    @Test
    public void test1(){
        List<Integer> list = tempBrandMapper.getList();
        System.out.println(list);
        List<UserSeller1> userSeller1s = userSellerMapper.selectList(null);

        for (Integer integer : list) {
            TempBrand tempBrand = tempBrandMapper.getT(integer).get(0);
            for (UserSeller1 seller : userSeller1s) {
                if(tempBrand.getId().equals(seller.getId())){


                    seller.setNickname(tempBrand.getName());

                    userSellerMapper.updateById(seller);
                }
            }
        }




    }



    @Test
    public void test(){

        List<GoodsSubject> list = goodsSubjectMapper.getSu();
        System.out.println(list.size());
        List<UserSeller1> userSellers = userSellerMapper.selectList(null);
        System.out.println(userSellers.size());
        Integer num = 0;
            for (UserSeller1 userSeller : userSellers) {
                for (GoodsSubject goodsSubject : list) {
                    if (userSeller.getId().equals(goodsSubject.getSellerId())){
                        Integer a = goodsSubject.getAtLeastNum();
                       /* UserSeller1 u = new UserSeller1();
                        u.setId(userSeller.getId());
                        u.setBatchNum(a);*/
                        userSeller.setBatchNum(a);
                        userSellerMapper.updateById(userSeller);
                      num++;
                    }
                }
            }

        System.out.println(num);


    }


}
