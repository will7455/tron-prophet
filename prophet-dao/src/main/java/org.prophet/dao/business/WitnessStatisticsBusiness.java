package org.prophet.dao.business;

import org.prophet.dao.entities.WitnessStatistics;

import java.util.List;

public interface WitnessStatisticsBusiness {
  List<WitnessStatistics> getAllStatistics();

  void addStatistic(WitnessStatistics statistics);
}
