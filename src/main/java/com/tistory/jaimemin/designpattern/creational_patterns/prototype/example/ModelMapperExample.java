package com.tistory.jaimemin.designpattern.creational_patterns.prototype.example;

import org.modelmapper.ModelMapper;

public class ModelMapperExample {

	public static void main(String[] args) {
		ModelMapper modelMapper = new ModelMapper();
		UserEntity userEntity = new UserEntity();
		userEntity.setId(1L);
		userEntity.setUsername("jaimemin");
		userEntity.setEmail("example@example.com");

		UserDto userDTO = modelMapper.map(userEntity, UserDto.class);
		System.out.println(userDTO);
	}
}
