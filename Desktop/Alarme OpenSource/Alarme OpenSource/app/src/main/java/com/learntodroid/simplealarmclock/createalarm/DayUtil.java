package com.learntodroid.simplealarmclock.createalarm;

import java.util.Calendar;

public final class DayUtil {
    public static final String toDay(int day) throws Exception {
        switch (day) {
            case Calendar.SUNDAY:
                return "Domingo";
            case Calendar.MONDAY:
                return "Segunda";
            case Calendar.TUESDAY:
                return "Terça";
            case Calendar.WEDNESDAY:
                return "Quarta";
            case Calendar.THURSDAY:
                return "Quinta";
            case Calendar.FRIDAY:
                return "Sexta";
            case Calendar.SATURDAY:
                return "Sabado";
        }
        throw new Exception("Não foi possível localizar o dia");
    }
}
