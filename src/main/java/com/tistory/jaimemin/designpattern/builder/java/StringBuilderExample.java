package com.tistory.jaimemin.designpattern.builder.java;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder // 일련의 과정이 비슷함
            .append("builder")
            .append(" pattern")
            .toString();
        System.out.println(result);
    }
}
