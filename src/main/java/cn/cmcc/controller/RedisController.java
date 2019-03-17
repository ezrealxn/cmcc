package cn.cmcc.controller;

import cn.cmcc.bean.MinuteVO;
import cn.cmcc.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

/**
 * Created by Huige
 * Email: 824203453@qq.com
 * DATE: 2019/2/21
 * Desc:
 */
@RestController
public class RedisController {

    @Autowired
    RedisService redisService;

    @RequestMapping("/map/{day}")
    public Object getRedisDataByDay(@PathVariable String day) {
        return redisService.getRedisDataByDay(day);
    }

    @RequestMapping("/minute/{day}")
    public MinuteVO getRedisDataByDayMinute(@PathVariable String day){

        Calendar cal = Calendar.getInstance();
        // 7 --》  07  小时
        String hour = cal.get(Calendar.HOUR_OF_DAY) >= 10 ? cal.get(Calendar.HOUR_OF_DAY)+"": "0"+cal.get(Calendar.HOUR_OF_DAY);
        String minute = cal.get(Calendar.MINUTE) >= 10 ? cal.get(Calendar.MINUTE)+"": "0"+cal.get(Calendar.MINUTE);

        return redisService.getRedisDataByDayMinute(day,hour+minute);
    }
}
