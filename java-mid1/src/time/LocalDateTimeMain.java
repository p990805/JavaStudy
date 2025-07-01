package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2019,5,27,13,0,30);
        System.out.println("현재 날짜 시간  = " + nowDt);
        System.out.println("지정 날짜 시간 = " + ofDt);

        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산 불변
        LocalDateTime ofDtPlus  = ofDt.plusDays(100);
        System.out.println("지정 날짜 +100일 = " + ofDtPlus);
        LocalDateTime ofDtPlus10Year = ofDt.plusYears(10);
        System.out.println("지정 날짜시간 +10년 = " + ofDtPlus10Year);

        //비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가?? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가?? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? " + nowDt.isEqual(ofDt));

    }
}
