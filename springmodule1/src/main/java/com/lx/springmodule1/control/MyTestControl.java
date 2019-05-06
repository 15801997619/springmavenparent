package com.lx.springmodule1.control;

import com.lx.springmodule2.util.DateUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:MyTestControl
 * @Description: TODO
 * @Author: xu.liu
 * @Date:2019/5/6 16:32
 * @Version:V1.0
 **/
@RestController
public class MyTestControl {

    @RequestMapping(value = "hi")
    public String sayTime(){

        return "hi, now the time is "+DateUtil.getCurrentTime24();
    }
}