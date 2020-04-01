package com.nacl.bingtang.mapper;

import com.nacl.bingtang.bean.UpDown;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author 赵益江
 * @version 1.0
 * @date 2020/4/1 0001 20:24
 */
public interface UpDownMapper {
    int up(UpDown upDown);
    UpDown getUpDownByDate(String date);
    int down(UpDown upDown);
}
