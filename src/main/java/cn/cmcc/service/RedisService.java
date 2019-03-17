package cn.cmcc.service;

import cn.cmcc.bean.MapVo;
import cn.cmcc.bean.MinuteVO;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Huige
 * Email: 824203453@qq.com
 * DATE: 2019/2/21
 * Desc:
 */
public interface RedisService {
    ArrayList<MapVo> getRedisDataByDay(String day);

    MinuteVO getRedisDataByDayMinute(String day, String s);
}
