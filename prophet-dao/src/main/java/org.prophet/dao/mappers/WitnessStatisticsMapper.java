package org.prophet.dao.mappers;

import org.prophet.dao.entities.WitnessStatistics;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface WitnessStatisticsMapper {
  List<WitnessStatistics> getAllStatistics();

  void addStatistic(WitnessStatistics statistics);
}
