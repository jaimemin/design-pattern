package com.tistory.jaimemin.designpattern.builder.after;

import java.time.LocalDate;

import com.tistory.jaimemin.designpattern.builder.before.TourPlan;

/**
 * 장점
 * 만들기 복잡한 객체를 순차적으로 만드는 방법을 제공 (생성자의 경우 순서라는 개념이 딱히 없음, 한 번에 다 넘겨줘야 함)
 * director를 통해 복잡한 객체를 만드는 구체적인 과정을 숨길 수 있음
 * 동일한 프로세스를 통해 각기 다르게 구성된 객체를 만들 수 있음
 * 불완전한 객체를 사용하지 못하도록 방지 가능 (build(), 여기서는 getPlan()을 호출해야지만 객체가 만들어짐)
 *
 * 단점
 * 원하는 객체를 만드려면 빌더부터 그리고 디렉터까지 만들어야 함 (관리 포인트가 늘어남)
 * 클래스가 많아짐에 따라 구조가 복잡해짐 (트레이드 오프)
 */
public interface TourPlanBuilder {

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();

}
