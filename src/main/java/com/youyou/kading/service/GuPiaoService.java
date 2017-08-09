package com.youyou.kading.service;

import com.youyou.kading.bean.GuPiao;
import com.youyou.kading.utils.HttpClientUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by aw on 2017/8/9.
 */
@Service
public class GuPiaoService {
    private final String baseUrl="http://hq.sinajs.cn/list=";

//    @Scheduled(fixedRate=10000)   //每10秒执行一次
    public List<GuPiao> getOver500(){
//        List<String> codes=new ArrayList<>();
        //sh600737,sh600123,sh600125,sh600127,sh600128,sh600129,sh600130,sh600131,sh600132,sh600326,sz300377,sz000683,sh600516
        String codes="sh600737,sh600123";
        List<GuPiao> detailByCodes = getDetailByCodes(codes);
        return detailByCodes;
    }

    /**
     * 刚通过股票代码获取股票明细
     * @param codes sh600737,sh600123,sh600125,sh600127,sh600128,sh600129,sh600130,sh600131,sh600132,sh600326,sz300377,sz000683,sh600516
     * @return
     */
    public List<GuPiao> getDetailByCodes(String codes){
        return getGuPiao(baseUrl+codes);
    };

    /**
     * 重载 传入list
     * 刚通过股票代码获取股票明细
     * @param codes
     * @return
     */
    public List<GuPiao> getDetailByCodes(List<String> codes){
        StringBuffer codeStr=new StringBuffer();
        for (String code : codes) {
            codeStr.append(code+",");
        }
        return getGuPiao(baseUrl+codeStr.toString());
    };

    /**
     * 通过url获取股票
     * @param url
     * @return
     */
    public List<GuPiao> getGuPiao(String url) {
        String result= HttpClientUtil.httpGetRequest(url);
        String[] lists = StringUtils.split(result.trim(),";");
        List<GuPiao> guPiaos = new ArrayList<>();
        for (String list : lists) {
            //获取股票代码;
            String code = list.substring(list.lastIndexOf("_") + 1, list.lastIndexOf("="));
            //获取每条记录的股票数据如：中粮糖业,9.610,9.730,9.470,9.650,9.470,9.470,9.480,24005408,228666520.000,65038,9.470,185800,9.460,423700,9.450,71400,9.440,44900,9.430,52500,9.480,134228,9.490,134800,9.500,119400,9.510,36400,9.520,2017-08-09,14:46:35,00
            String data = list.substring(list.indexOf("\"", 1)+1,list.lastIndexOf("\""));
            //获取股票数据的属性
            String[] gupiaoStr = data.split(",");
            GuPiao guPiao = new GuPiao();
            guPiao.setCode(code);
            guPiao.setName(gupiaoStr[0]);
            guPiao.setTodayOpenPrice(gupiaoStr[1]);
            guPiao.setYesterdayClosePrice(gupiaoStr[2]);
            guPiao.setNowPrice(gupiaoStr[3]);
            guPiao.setTodayMaxPrice(gupiaoStr[4]);
            guPiao.setTodayMinPrice(gupiaoStr[5]);
            guPiao.setBuyOne(gupiaoStr[6]);
            guPiao.setSaleOne(gupiaoStr[7]);
            guPiao.setAllNum(gupiaoStr[8]);
            guPiao.setAllPrice(gupiaoStr[9]);
            guPiao.setBuyOneNum(gupiaoStr[10]);
            guPiao.setBuyOnePrice(gupiaoStr[11]);
            guPiao.setBuy2Num(gupiaoStr[12]);
            guPiao.setBuy2Price(gupiaoStr[13]);
            guPiao.setBuy3Num(gupiaoStr[14]);
            guPiao.setBuy3Price(gupiaoStr[15]);
            guPiao.setBuy4Num(gupiaoStr[16]);
            guPiao.setBuy4Price(gupiaoStr[17]);
            guPiao.setBuy5Num(gupiaoStr[18]);
            guPiao.setBuy5Price(gupiaoStr[19]);
            guPiao.setSaleOne(gupiaoStr[20]);
            guPiao.setSaleOnePrice(gupiaoStr[21]);
            guPiao.setSale2Num(gupiaoStr[22]);
            guPiao.setSale2Price(gupiaoStr[23]);
            guPiao.setSale3Num(gupiaoStr[24]);
            guPiao.setSale3Price(gupiaoStr[25]);
            guPiao.setSale4Num(gupiaoStr[26]);
            guPiao.setSale4Price(gupiaoStr[27]);
            guPiao.setSale5Num(gupiaoStr[28]);
            guPiao.setSale5Price(gupiaoStr[29]);
            guPiao.setTime(gupiaoStr[30]+" "+gupiaoStr[31]);
            System.out.println(guPiao);
            guPiaos.add(guPiao);
        }
        return guPiaos;
    }


    public String formatDate(Date date) {
        SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String retStrFormatNowDate = sdFormatter.format(date);
        return retStrFormatNowDate;
    }
}
