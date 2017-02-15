package com.lianying.shangjialian.common.utils;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by luowen on 2017/2/15.
 */
public final class HttpClientUtils {

    private HttpClientUtils() {
    }

    /**
     * httpClient Get Method
     *
     * @param url
     * @param parameters
     * @return
     * @throws IOException
     */
    public static String get(String url, Map<String, Object> parameters) throws IOException {

        StringBuilder sb = new StringBuilder(url);
        if(parameters != null && parameters.size() > 0) {
            Set<Map.Entry<String, Object>> entrySet = parameters.entrySet();
            for (Map.Entry<String, Object> item : entrySet) {
                    sb.append("?").append(URLEncoder.encode(item.getKey(), "utf-8"))
                    .append("=").append(URLEncoder.encode(String.valueOf(item.getValue()), "utf-8"))
                    .append("&");
            }
        }
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(sb.substring(0, sb.length() - 1).toString());

        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        return  EntityUtils.toString(entity);
    }

    /**
     * HttpClient Post　method implement
     *
     * @param url
     * @param params
     * @return
     * @throws IOException
     */
    public static String post(String url, Map<String, Object> params) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost(url);
        List<NameValuePair> postEntity = new ArrayList<NameValuePair>();
        if(params != null && params.size() > 0) {
            for (Map.Entry<String, Object> param : params.entrySet()) {
                postEntity.add(new BasicNameValuePair(param.getKey(), String.valueOf(param.getValue())));
            }
        }
        httpPost.setEntity(new UrlEncodedFormEntity(postEntity));
        HttpEntity entity = httpClient.execute(httpPost).getEntity();
        return EntityUtils.toString(entity);
    }
}
