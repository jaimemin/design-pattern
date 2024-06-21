package com.tistory.jaimemin.designpattern.builder.java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

    public static void main(String[] args) {
        // 기본 URI 설정
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
            .scheme("https")
            .host("www.example.com")
            .path("/search")
            .queryParam("q", "springframework")
            .queryParam("sort", "desc")
            .fragment("section1")
            .build();

        // URI 문자열 출력
        String uri = uriComponents.toUriString();
        System.out.println(uri);  // 출력: https://www.example.com/search?q=spring+framework&sort=desc#section1

        // URI 템플릿 사용
        UriComponents uriTemplate = UriComponentsBuilder.newInstance()
            .scheme("https")
            .host("www.example.com")
            .path("/users/{userId}/posts")
            .queryParam("page", "1")
            .buildAndExpand("123");

        // URI 템플릿 문자열 출력
        String uriWithTemplate = uriTemplate.toUriString();
        System.out.println(uriWithTemplate);
    }
}
