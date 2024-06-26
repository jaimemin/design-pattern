package com.tistory.jaimemin.designpattern.structural_patterns.facade.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailMessage {

	private String from;

	private String to;
    
	private String cc;

	private String bcc;

	private String subject;

	private String text;
}
