package com.nacl.bingtang.controller;

import com.nacl.bingtang.bean.UpDown;
import com.nacl.bingtang.mapper.UpDownMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 赵益江
 * @version 1.0
 * @date 2020/4/1 0001 19:55
 */
@Controller
public class HelloController {
    SimpleDateFormat format=null;

    @Autowired
    UpDownMapper upDownMapper;
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/up")
    @ResponseBody
    public String up(String note){
        Date date = new Date();
        String today  = new SimpleDateFormat("yyyy-MM-dd").format(date);
        if(upDownMapper.getUpDownByDate(today)!=null){
            return "今天已签到";
        }
        //HH:mm:ss  24小时格式
        //hhO:mm:ss  12小时格式
        String up = new SimpleDateFormat("HH:mm:ss").format(date);
        UpDown upDown = new UpDown();
        upDown.setUp(up);
        upDown.setUid(001L);
        upDown.setDate(today);
        upDown.setNote(note);
        upDownMapper.up(upDown);
        return "up-签到成功";
    }
    @GetMapping("/down")
    @ResponseBody
    public String down(String note){
        Date date = new Date();
        String today  = new SimpleDateFormat("yyyy-MM-dd").format(date);
        String down = new SimpleDateFormat("HH:mm:ss").format(date);
        UpDown upDown = new UpDown();
        upDown.setDown(down);
        upDown.setUid(001L);
        upDown.setNote(note);
        upDown.setDate(today);
        UpDown oldupdown = upDownMapper.getUpDownByDate(today);
        if(oldupdown != null){
            if(note!=""&&note!=null){
                upDown.setNote(note);
            }else {
                upDown.setNote(oldupdown.getNote());
            }

            if(upDownMapper.down(upDown) > 0){
                return "down-success";
            }
        }
        return "今天未签到";
    }
}
