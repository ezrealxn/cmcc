package cn.cmcc.dao.impl;

import cn.cmcc.dao.RedisDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Huige
 * Email: 824203453@qq.com
 * DATE: 2019/2/21
 * Desc:
 */
@Repository
//@Component
public class RedisDAOImpl implements RedisDAO {

    /* 注入redis的工具类*/
    @Autowired
    StringRedisTemplate redis;
    @Override
    public Map<Object, Object> getRedisDataByDay(String day) {

        Map<Object, Object> entries = redis.opsForHash().entries(day);
        return entries;
    }

    @Override
    public Object getRedisDataByDayMinute(String day, String s) {
        return redis.opsForHash().get(day,s);
    }
}
