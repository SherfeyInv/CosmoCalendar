package com.applikeysolutions.cosmocalendar.settings.lists;

import com.applikeysolutions.cosmocalendar.settings.lists.connected_days.ConnectedDays;
import com.applikeysolutions.cosmocalendar.settings.lists.connected_days.ConnectedDaysManager;

import java.util.Set;

public interface CalendarListsInterface {

    Set<Long> getDisabledDays();

    ConnectedDaysManager getConnectedDaysManager();

    Set<Long> getWeekendDays();

    DaysCriteria getDaysCriteria();

    void setDisabledDays(Set<Long> disabledDays);

    void setWeekendDays(Set<Long> weekendDays);

    void setDaysCriteria(DaysCriteria criteria);

    void addConnectedDays(ConnectedDays connectedDays);
}
