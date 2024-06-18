package com.tistory.jaimemin.designpattern.factorymethod.after;

/**
 * Q. 새로운 팩토리가 생길 때마다 클라이언트 코드는 바뀌지 않느냐?
 * A. 클라이언트 코드는 구체적인 팩토리를 알아야하기 때문에 클라이언트 코드는 바뀔 수 밖에 없음
 * 하지만 우리가 집중해야할 부분은 product와 creator를 확장할 때 기존 제품과 기존 팩토리가 변경되지 않는다는 점을 주목해야 함
 *
 * Q. 팩토리 메서드 패턴을 적용했을 때 장단점
 * 장점
 * 확장이 열려있고 변경에 닫혀있는 OCP 원칙을 적용해서 기존 코드를 건드리지 않고 새로운 인스턴스를 다른 방법으로 확장 가능
 * -> Product와 Creator 간의 결합을 느슨하게 가져갔기 때문 (loosly coupling)
 *
 * 단점
 * 역할을 나누다보니 클래스가 늘어나는 단점을 피할 수 없음
 *
 * Q. SOLID 원칙의 OCP 원칙에 대해 설명해주세요.
 * A. 변경이 닫혀있다는 것은 기존 코드를 변경하지 않으면서 새로운 기능을 얼마나 확장할 수 있게끔 구조를 만드는 객체지향 원칙
 * -> 팩토리 메서드 패턴에서 이러한 원칙을 적용했음
 */
public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		client.print(new WhiteshipFactory(), "whiteship", "keesun@mail.com");
		client.print(new BlackshipFactory(), "blackship", "keesun@mail.com");
	}

	/**
	 * 클라이언트 코드를 인터페이스 타입으로 작성되어 있다면 코드 변경을 최소화 할 수 있음
	 */
	private void print(ShipFactory shipFactory, String name, String email) {
		System.out.println(shipFactory.orderShip(name, email));
	}
}
