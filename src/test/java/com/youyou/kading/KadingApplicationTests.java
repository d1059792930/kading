package com.youyou.kading;

import com.youyou.kading.utils.HttpClientUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KadingApplicationTests {

	@Test
	public void contextLoads() {
		String s=HttpClientUtil.httpGetRequest("http://hq.sinajs.cn/list=sh600737,sh600123,sh600125,sh600127,sh600128,sh600129,sh600130,sh600131,sh600132,sh600326,sz300377,sz000683,sh600516");
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
