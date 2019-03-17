package cn.cmcc.bean;

/**
 * Created by Huige
 * Email: 824203453@qq.com
 * DATE: 2019/2/21
 * Desc:
 */
public class MapVo {
    private String name;
    private int value;

    public MapVo(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public MapVo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
