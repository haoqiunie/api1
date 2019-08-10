package com.mht.service.impl;

import com.mht.entity.Hotel;
import com.mht.mapper.HotelMapper;
import com.mht.service.IHotelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 酒店 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-29
 */
@Service
public class HotelServiceImpl extends ServiceImpl<HotelMapper, Hotel> implements IHotelService {

}
