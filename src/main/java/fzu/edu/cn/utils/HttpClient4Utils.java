package fzu.edu.cn.utils;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public  class  HttpClient4Utils  {

    public static Object Get(String url, HashMap<String,Object> map){
        String res = null;
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        CloseableHttpResponse response = null;
        if(map!=null){ // Get请求携带参数
            // 参数
            StringBuffer params = new StringBuffer();
            for (String key : map.keySet())
                params.append(key + "=" + map.get(key)+"&");
            // 创建Get请求
            HttpGet httpGet = new HttpGet(url + "?" + params);
            System.out.println(url + "?" + params);
            try {
                // 配置信息
                RequestConfig requestConfig = RequestConfig.custom()
                        // 设置连接超时时间(单位毫秒)
                        .setConnectTimeout(5000)
                        // 设置请求超时时间(单位毫秒)
                        .setConnectionRequestTimeout(5000)
                        // socket读写超时时间(单位毫秒)
                        .setSocketTimeout(5000)
                        // 设置是否允许重定向(默认为true)
                        .setRedirectsEnabled(true).build();

                // 将上面的配置信息 运用到这个Get请求里
                httpGet.setConfig(requestConfig);

                // 由客户端执行(发送)Get请求
                response = httpClient.execute(httpGet);

                // 从响应模型中获取响应实体
                HttpEntity responseEntity = response.getEntity();
                if (responseEntity != null) {
                    res = EntityUtils.toString(responseEntity);
                    System.out.println("响应状态为:" + response.getStatusLine());
                    System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                    System.out.println("响应内容为:" + res);
                    System.out.println("响应类型为:" + responseEntity.getContentType().getValue());

                }
            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    // 释放资源
                    if (httpClient != null) {
                        httpClient.close();
                    }
                    if (response != null) {
                        response.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        else{
            // 创建Get请求
            HttpGet httpGet = new HttpGet(url);
            try {
                // 由客户端执行(发送)Get请求
                response = httpClient.execute(httpGet);
                // 从响应模型中获取响应实体
                HttpEntity responseEntity = response.getEntity();

                if (responseEntity != null) {
                    res = EntityUtils.toString(responseEntity);
                    System.out.println("响应状态为:" + response.getStatusLine());
                    System.out.println("响应类型为:" + responseEntity.getContentType().getValue());
                    System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                    System.out.println("响应内容为:" + res);

                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    // 释放资源
                    if (httpClient != null) {
                        httpClient.close();
                    }
                    if (response != null) {
                        response.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }


    public static Object Post(String url, HashMap<String,Object> map){
        String res = null;
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 响应模型
        CloseableHttpResponse response = null;

        if(map==null){ //无参POST
            try {
                // 创建Post请求
                HttpPost httpPost = new HttpPost(url);
                // 由客户端执行(发送)Post请求
                response = httpClient.execute(httpPost);
                // 从响应模型中获取响应实体
                HttpEntity responseEntity = response.getEntity();
                if (responseEntity != null) {
                    res = EntityUtils.toString(responseEntity);
                    System.out.println("响应状态为:" + response.getStatusLine());
                    System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                    System.out.println("响应内容为:" + res);
                }
            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    // 释放资源
                    if (httpClient != null) {
                        httpClient.close();
                    }
                    if (response != null) {
                        response.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        else{
            // 参数
            StringBuffer params = new StringBuffer();
            for (String key : map.keySet())
                params.append(key + "=" + map.get(key)+"&");
            if(params.charAt(params.length()-1)=='&'){
                params.deleteCharAt(params.length()-1);
            }
            // 创建Post请求
            HttpPost httpPost = new HttpPost(url + "?" + params);

            // 设置ContentType(注:如果只是传普通参数的话,ContentType不一定非要用application/json)
            httpPost.setHeader("Content-Type", "application/json;charset=utf8");
            try {
                // 由客户端执行(发送)Post请求
                response = httpClient.execute(httpPost);
                // 从响应模型中获取响应实体
                HttpEntity responseEntity = response.getEntity();


                if (responseEntity != null) {
                    res = EntityUtils.toString(responseEntity);
                    System.out.println("响应状态为:" + response.getStatusLine());
                    System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                    System.out.println("响应内容为:" + res);
                }
            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    // 释放资源
                    if (httpClient != null) {
                        httpClient.close();
                    }
                    if (response != null) {
                        response.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }



    public static void main(String[] args) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("majorcode","123");
        String res = (String) HttpClient4Utils.Post("http://localhost:8888/class/getClass",map);
        System.out.println(res);
    }
}
