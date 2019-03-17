package cn.cmcc.bean;

/**
 * Created by Huige
 * Email: 824203453@qq.com
 * DATE: 2019/2/21
 * Desc:
 */
public class MinuteVO {
    private int cnts;
    private double money;

    public MinuteVO(int cnts, double money) {
        this.cnts = cnts;
        this.money = money;
    }

    public MinuteVO() {
    }

    public int getCnts() {
        return cnts;
    }

    public void setCnts(int cnts) {
        this.cnts = cnts;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
