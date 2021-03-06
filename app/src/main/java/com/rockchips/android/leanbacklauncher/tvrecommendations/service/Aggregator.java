package com.rockchips.android.leanbacklauncher.tvrecommendations.service;

import java.util.Date;

public interface Aggregator<T> {
    void add(Date date, T t);

    double getAggregatedScore();

    void reset();
}
