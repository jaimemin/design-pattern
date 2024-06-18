package com.tistory.jaimemin.designpattern.abstract_factory.java;

import org.springframework.beans.factory.FactoryBean;

import com.tistory.jaimemin.designpattern.factorymethod.after.Ship;
import com.tistory.jaimemin.designpattern.factorymethod.after.Whiteship;

/**
 * FactoryBean은 스프링에서 제공하는 인터페이스
 * Bean Object를 만들 때 만드는 과정이 단순히 생성자를 통해 만들 수 없고 좀 복잡할 경우 FactoryBean의 구현체를 만들어서 빈으로 등록
 * -> FactoryBean에서 만들어주는 Object가 빈으로 등록 (getObject 참고)
 */
public class ShipFactory implements FactoryBean<Ship> {

	@Override
	public Ship getObject() throws Exception {
		Ship ship = new Whiteship();
		ship.setName("whiteship");
		
		return ship;
	}

	@Override
	public Class<?> getObjectType() {
		return Ship.class;
	}
}
