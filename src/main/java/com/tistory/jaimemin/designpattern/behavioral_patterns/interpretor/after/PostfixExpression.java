package com.tistory.jaimemin.designpattern.behavioral_patterns.interpretor.after;

import java.util.Map;

public interface PostfixExpression {

	int interpret(Map<Character, Integer> context);

}
