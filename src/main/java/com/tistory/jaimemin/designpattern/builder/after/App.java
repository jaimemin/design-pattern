package com.tistory.jaimemin.designpattern.builder.after;

import java.time.LocalDate;

import com.tistory.jaimemin.designpattern.builder.before.TourPlan;

public class App {

    public static void main(String[] args) {
        // TourPlanBuilder builder = new DefaultTourBuilder();
        // builder.title("칸쿤 여행")
        //     .nightsAndDays(2, 3)
        //     .startDate(LocalDate.of(2024, 6, 21))
        //     .whereToStay("리조트")
        //     .addPlan(0, "체크인하고 짐 풀기")
        //     .addPlan(0, "저녁 식사")
        //     .getPlan();

        // TourPlan longBeachTrip = builder.title("롱비치")
        //     .startDate(LocalDate.of(2024, 7, 21))
        //     .getPlan();

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}
