package com.youyou.kading.bean;

/**
 * Created by aw on 2017/8/9.
 * 股票实体类
 */
public class GuPiao {
    private String name;//股票名字
    private String code;//股票代码
    private String time;//时间
    private String todayOpenPrice;//今日开盘价
    private String yesterdayClosePrice;//昨日收盘价
    private String nowPrice;//当前价格
    private String todayMaxPrice;//今日最高价
    private String todayMinPrice;//今日最低价
    private String buyOne;//竞买价，即“买一”报价
    private String saleOne;//竞卖价，即“卖一”报价
    private String allNum;//成交量 --成交的股票数，由于股票交易以一百股为基本单位，所以在使用时，通常把该值除以一百；
    private String allPrice;//成金额 --成交金额，单位为“元”，为了一目了然，通常以“万元”为成交金额的单位，所以通常把该值除以一万；
    //买一到买5的数量和价格
    private String buyOneNum;//“买一”申请4695股，即47手；
    private String buyOnePrice;
    private String buy2Num;
    private String buy2Price;
    private String buy3Num;
    private String buy3Price;
    private String buy4Num;
    private String buy4Price;
    private String buy5Num;
    private String buy5Price;
    //卖一到卖5的数量和价格
    private String saleOneNum;
    private String saleOnePrice;
    private String sale2Num;
    private String sale2Price;
    private String sale3Num;
    private String sale3Price;
    private String sale4Num;
    private String sale4Price;
    private String sale5Num;
    private String sale5Price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTodayOpenPrice() {
        return todayOpenPrice;
    }

    public void setTodayOpenPrice(String todayOpenPrice) {
        this.todayOpenPrice = todayOpenPrice;
    }

    public String getYesterdayClosePrice() {
        return yesterdayClosePrice;
    }

    public void setYesterdayClosePrice(String yesterdayClosePrice) {
        this.yesterdayClosePrice = yesterdayClosePrice;
    }

    public String getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(String nowPrice) {
        this.nowPrice = nowPrice;
    }

    public String getTodayMaxPrice() {
        return todayMaxPrice;
    }

    public void setTodayMaxPrice(String todayMaxPrice) {
        this.todayMaxPrice = todayMaxPrice;
    }

    public String getTodayMinPrice() {
        return todayMinPrice;
    }

    public void setTodayMinPrice(String todayMinPrice) {
        this.todayMinPrice = todayMinPrice;
    }

    public String getBuyOne() {
        return buyOne;
    }

    public void setBuyOne(String buyOne) {
        this.buyOne = buyOne;
    }

    public String getSaleOne() {
        return saleOne;
    }

    public void setSaleOne(String saleOne) {
        this.saleOne = saleOne;
    }

    public String getAllNum() {
        return allNum;
    }

    public void setAllNum(String allNum) {
        this.allNum = allNum;
    }

    public String getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(String allPrice) {
        this.allPrice = allPrice;
    }

    public String getBuyOneNum() {
        return buyOneNum;
    }

    public void setBuyOneNum(String buyOneNum) {
        this.buyOneNum = buyOneNum;
    }

    public String getBuyOnePrice() {
        return buyOnePrice;
    }

    public void setBuyOnePrice(String buyOnePrice) {
        this.buyOnePrice = buyOnePrice;
    }

    public String getBuy2Num() {
        return buy2Num;
    }

    public void setBuy2Num(String buy2Num) {
        this.buy2Num = buy2Num;
    }

    public String getBuy2Price() {
        return buy2Price;
    }

    public void setBuy2Price(String buy2Price) {
        this.buy2Price = buy2Price;
    }

    public String getBuy3Num() {
        return buy3Num;
    }

    public void setBuy3Num(String buy3Num) {
        this.buy3Num = buy3Num;
    }

    public String getBuy3Price() {
        return buy3Price;
    }

    public void setBuy3Price(String buy3Price) {
        this.buy3Price = buy3Price;
    }

    public String getBuy4Num() {
        return buy4Num;
    }

    public void setBuy4Num(String buy4Num) {
        this.buy4Num = buy4Num;
    }

    public String getBuy4Price() {
        return buy4Price;
    }

    public void setBuy4Price(String buy4Price) {
        this.buy4Price = buy4Price;
    }

    public String getBuy5Num() {
        return buy5Num;
    }

    public void setBuy5Num(String buy5Num) {
        this.buy5Num = buy5Num;
    }

    public String getBuy5Price() {
        return buy5Price;
    }

    public void setBuy5Price(String buy5Price) {
        this.buy5Price = buy5Price;
    }

    public String getSaleOneNum() {
        return saleOneNum;
    }

    public void setSaleOneNum(String saleOneNum) {
        this.saleOneNum = saleOneNum;
    }

    public String getSaleOnePrice() {
        return saleOnePrice;
    }

    public void setSaleOnePrice(String saleOnePrice) {
        this.saleOnePrice = saleOnePrice;
    }

    public String getSale2Num() {
        return sale2Num;
    }

    public void setSale2Num(String sale2Num) {
        this.sale2Num = sale2Num;
    }

    public String getSale2Price() {
        return sale2Price;
    }

    public void setSale2Price(String sale2Price) {
        this.sale2Price = sale2Price;
    }

    public String getSale3Num() {
        return sale3Num;
    }

    public void setSale3Num(String sale3Num) {
        this.sale3Num = sale3Num;
    }

    public String getSale3Price() {
        return sale3Price;
    }

    public void setSale3Price(String sale3Price) {
        this.sale3Price = sale3Price;
    }

    public String getSale4Num() {
        return sale4Num;
    }

    public void setSale4Num(String sale4Num) {
        this.sale4Num = sale4Num;
    }

    public String getSale4Price() {
        return sale4Price;
    }

    public void setSale4Price(String sale4Price) {
        this.sale4Price = sale4Price;
    }

    public String getSale5Num() {
        return sale5Num;
    }

    public void setSale5Num(String sale5Num) {
        this.sale5Num = sale5Num;
    }

    public String getSale5Price() {
        return sale5Price;
    }

    public void setSale5Price(String sale5Price) {
        this.sale5Price = sale5Price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "GuPiao{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", time='" + time + '\'' +
                ", todayOpenPrice='" + todayOpenPrice + '\'' +
                ", yesterdayClosePrice='" + yesterdayClosePrice + '\'' +
                ", nowPrice='" + nowPrice + '\'' +
                ", todayMaxPrice='" + todayMaxPrice + '\'' +
                ", todayMinPrice='" + todayMinPrice + '\'' +
                ", buyOne='" + buyOne + '\'' +
                ", saleOne='" + saleOne + '\'' +
                ", allNum='" + allNum + '\'' +
                ", allPrice='" + allPrice + '\'' +
                ", buyOneNum='" + buyOneNum + '\'' +
                ", buyOnePrice='" + buyOnePrice + '\'' +
                ", buy2Num='" + buy2Num + '\'' +
                ", buy2Price='" + buy2Price + '\'' +
                ", buy3Num='" + buy3Num + '\'' +
                ", buy3Price='" + buy3Price + '\'' +
                ", buy4Num='" + buy4Num + '\'' +
                ", buy4Price='" + buy4Price + '\'' +
                ", buy5Num='" + buy5Num + '\'' +
                ", buy5Price='" + buy5Price + '\'' +
                ", saleOneNum='" + saleOneNum + '\'' +
                ", saleOnePrice='" + saleOnePrice + '\'' +
                ", sale2Num='" + sale2Num + '\'' +
                ", sale2Price='" + sale2Price + '\'' +
                ", sale3Num='" + sale3Num + '\'' +
                ", sale3Price='" + sale3Price + '\'' +
                ", sale4Num='" + sale4Num + '\'' +
                ", sale4Price='" + sale4Price + '\'' +
                ", sale5Num='" + sale5Num + '\'' +
                ", sale5Price='" + sale5Price + '\'' +
                '}';
    }
}
