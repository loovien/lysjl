package com.lianying.shangjialian.common.utils;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import static org.junit.Assert.*;

/**
 * Created by luowen on 2017/2/15.
 */
public class HttpClientUtilsTest {
    @Test
    public void get() throws Exception {

        Map<String, Object> param = new HashMap<String, Object>();

        param.put("name", "luowen");
        param.put("age", 23);

        String result = HttpClientUtils.get("http://www.baidu.com", param);
        System.out.println(result);

    }

    @Test
    public void post() throws IOException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("name", "luowen");
        param.put("age", 23);

        String result = HttpClientUtils.post("http://localhost/test.php", param);
        System.out.println(result);

    }

}