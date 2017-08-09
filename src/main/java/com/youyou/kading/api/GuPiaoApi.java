package com.youyou.kading.api;

import com.youyou.kading.service.GuPiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aw on 2017/8/9.
 */
@Controller
@RequestMapping(value = "/api/0")
public class GuPiaoApi {
    @Autowired
    GuPiaoService guPiaoService;

    @RequestMapping(value="get", method= RequestMethod.GET)
    @ResponseBody
    public void getLocalKqi() throws Exception {
        Map<String, Object> map = new HashMap<>();
        guPiaoService.getOver500();
    }
}
