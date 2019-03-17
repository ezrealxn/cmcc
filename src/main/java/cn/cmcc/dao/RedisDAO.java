package cn.cmcc.dao;

import java.util.Map;

/**
 * Created by Huige
 * Email: 824203453@qq.com
 * DATE: 2019/2/21
 * Desc:
 */
public interface RedisDAO {
    // 省份和成功数量
    Map<Object, Object> getRedisDataByDay(String day);

    Object getRedisDataByDayMinute(String day, String s);
}
