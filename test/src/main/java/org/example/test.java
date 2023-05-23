package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class test {


    public static void main(String[] args) throws IOException {


        URL url = new URL( " http://10.83.21.71:8000/api/oauth/token");
        HttpURLConnection httpURLConnection = null;
        httpURLConnection = (HttpURLConnection) url.openConnection();

        httpURLConnection.setRequestProperty("Authorization", "Basic YW86YW90ZXN0");
        httpURLConnection.addRequestProperty("Content-Type","application/json;charset=UTF-8");
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(3000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(true);

        String params = "{\"password\":\"123456\",\"userName\":\"qiaoqian\",\"userType\":\"LDAP\",\"grant_type\":\"password\"}";
        httpURLConnection.connect();
//发送请求
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(params.getBytes());
        outputStream.flush();
        outputStream.close();
// 获取response.code
        int code = httpURLConnection.getResponseCode();
        String client_wangzhisheng;
        /*if (code==200){
            BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String result = reader.readLines();
            def slurper = new JsonSlurper().parseText(result)
// 从response中获取
            def token_type  = slurper.data.token_type[0]
            def access_token  = slurper.data.access_token[0]
            //return token_type + ' ' + access_token
            client_wangzhisheng = token_type + ' ' + access_token;
        }else{
            def token_type  = "Bearer"
            def access_token  =  ""
            //return token_type + ' ' + access_token
            client_wangzhisheng = token_type + ' ' + access_token;
        }*/
    }
}
