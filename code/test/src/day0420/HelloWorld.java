package day0420;

import java.net.URI;

public class HelloWorld {
    public static void main(String[] args) {
        String push="https://www.baidu.com/";
        URI uri = URI.create(push);
        String str=uri.toString();
        System.out.println(str);


    }

}
