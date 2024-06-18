package com.tistory.jaimemin.designpattern.abstract_factory.after;

/**
 * 제품군을 제공하는 역할을 팩토리로 위임했고 일종의 단일 책임 원칙을 지켰다고 볼 수 있지만
 * 또 다른 시점으로는 팩토리에서 여러 제품을 만들었으므로 단일 책임 원칙을 어겼다고 볼 수도 있음
 */
public interface ShipPartsFactory {

	Anchor createAnchor();

	Wheel createWheel();

}
