package cn.cmcc.service.impl;

import cn.cmcc.bean.MapVo;
import cn.cmcc.bean.MinuteVO;
import cn.cmcc.dao.RedisDAO;
import cn.cmcc.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * Created by Huige
 * Email: 824203453@qq.com
 * DATE: 2019/2/21
 * Desc:
 */
@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    RedisDAO redisDAO;

    @Override
    public ArrayList<MapVo> getRedisDataByDay(String day) {

        ArrayList<MapVo> mapLst = new ArrayList<>();
//        return null;
        Map<Object, Object> ent = redisDAO.getRedisDataByDay(day);

        Set<Map.Entry<Object, Object>> entries = ent.entrySet();

        for (Map.Entry<Object, Object> kv : entries) {
            // 省份  次数
            MapVo mvo = new MapVo(kv.getKey().toString(), Integer.parseInt(kv.getValue().toString()));
            mapLst.add(mvo);
        }

        return mapLst;
    }

    @Override
    public MinuteVO getRedisDataByDayMinute(String day, String hourAndMinute) {
        Object cnts = redisDAO.getRedisDataByDayMinute(day, "s-" + hourAndMinute);
        Object money = redisDAO.getRedisDataByDayMinute(day, "m-" + hourAndMinute);

        // 封装成分钟的数据 然后返回
        return new MinuteVO(cnts == null?0:Integer.parseInt(cnts.toString()), money == null ? 0.0:  Double.parseDouble(money.toString()));
    }
}
