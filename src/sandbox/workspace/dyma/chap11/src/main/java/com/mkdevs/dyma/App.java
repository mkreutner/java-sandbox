package com.mkdevs.dyma;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 * Chapter 11 - Dates and Times 
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Chapter 11 - Dates and Times");

        // Using Date and Calendar classes
        Date past = new Date(1757942556615L);
        Date now = new Date();
        System.out.println("Past date and time: " + past.getTime());
        System.out.println("Current date and time: " + now.getTime());

        var calendar = Calendar.getInstance();
        System.out.println("Current year: " + calendar.getTime());

        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Updated date and time: " + calendar.getTime());

        // Using Date and Time API
        var localDate = java.time.LocalDate.now();
        var localTime = java.time.LocalTime.now();
        var localDateTime = java.time.LocalDateTime.now();
        System.out.println("Current local date: " + localDate);
        System.out.println("Current local time: " + localTime);
        System.out.println("Current local date and time: " + localDateTime);

        var epoch = Instant.EPOCH;
        var instant = Instant.now();
        System.out.println("Epoch date and time: " + epoch.getEpochSecond());
        System.out.println("Current date and time: " + instant.getEpochSecond());

        var zoneParis = java.time.ZoneId.of("Europe/Paris");
        var zoneOffset = java.time.ZoneOffset.ofHours(2);
        var offsetTime = java.time.OffsetTime.of(localTime, zoneOffset);
        System.out.println("Current date and time with offset: " + offsetTime + " " + offsetTime.getOffset());

        for (var zoneId : java.time.ZoneId.getAvailableZoneIds().stream().sorted(new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        }).toList()) {
            if (zoneId.contains("Europe") || zoneId.contains("Africa")) {
                System.out.println("Found zone ID: " + zoneId);
            }
        }

        var localDate2 = java.time.LocalDate.of(2022, java.time.Month.JANUARY, 25);
        java.time.chrono.JapaneseDate japaneseDate = java.time.chrono.JapaneseDate.from(localDate2);
        System.out.println("Japanese date: " + japaneseDate);
        java.time.chrono.HijrahDate hijrahDate = java.time.chrono.HijrahDate.from(localDate2);
        System.out.println("Hijrah date: " + hijrahDate);
        java.time.chrono.MinguoDate minguoDate = java.time.chrono.MinguoDate.from(localDate2);
        System.out.println("Minguo date: " + minguoDate);
        java.time.chrono.ThaiBuddhistDate thaiBuddhistDate = java.time.chrono.ThaiBuddhistDate.from(localDate2);
        System.out.println("Thai Buddhist date: " + thaiBuddhistDate);

        // Duration and Period
        var localDate3 = java.time.LocalDate.of(2020, java.time.Month.JANUARY, 1);
        var localDate4 = java.time.LocalDate.of(2022, java.time.Month.MARCH, 15);
        var period = java.time.Period.between(localDate3, localDate4);
        System.out.println("Period between " + localDate3 + " and " + localDate4 + ": " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
        var localTime2 = java.time.LocalTime.of(10, 30, 0);
        var localTime3 = java.time.LocalTime.of(12, 45, 30);
        var duration = java.time.Duration.between(localTime2, localTime3);
        System.out.println("Duration between " + localTime2 + " and " + localTime3 + ": " + duration.toHours() + " hours, " + duration.toMinutesPart() + " minutes, " + duration.toSecondsPart() + " seconds"); 
    
        // Formatting and Parsing
        var formatter = java.time.format.DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
        var formattedDateTime = localDateTime.format(formatter);
        System.out.println("Formatted local date and time: " + formattedDateTime);
        var parsedDateTime = java.time.LocalDateTime.parse(formattedDateTime, formatter);
        System.out.println("Parsed local date and time: " + parsedDateTime);
        
    }
}
