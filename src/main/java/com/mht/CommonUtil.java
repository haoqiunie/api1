package com.mht;

import java.lang.reflect.Method;
import java.util.Collection;

/**
 * @description: 公共工具类
 * @author: 张逸峰
 * @create: 2019-07-30 16:39
 **/
public class CommonUtil {

    public static String setListToString(Collection collection, String fieldName) {
        StringBuffer sb = new StringBuffer();
        for (Object o : collection) {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            try {
                Method method = o.getClass().getMethod(getter,new Class[] {});
                Object invoke = method.invoke(o, new Object[]{});
                sb.append(invoke).append(",");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
