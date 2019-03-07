package com.applikeysolutions.cosmocalendar.adapter.viewholder;

import android.os.Build;
import android.view.View;
import android.widget.TextView;

import com.applikeysolutions.customizablecalendar.R;
import com.applikeysolutions.cosmocalendar.model.Day;
import com.applikeysolutions.cosmocalendar.view.CalendarView;

public class OtherDayHolder extends BaseDayHolder {

    public OtherDayHolder(View itemView, CalendarView calendarView) {
        super(itemView, calendarView);
        tvDay = (TextView) itemView.findViewById(R.id.tv_day_number);
    }

    public void bind(Day day) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            tvDay.setTextAppearance(calendarView.getDayTextAppearance());
        }

        tvDay.setText(String.valueOf(day.getDayNumber()));
        tvDay.setTextColor(calendarView.getOtherDayTextColor());
    }
}
