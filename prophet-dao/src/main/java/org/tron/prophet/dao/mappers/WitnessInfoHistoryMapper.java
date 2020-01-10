package org.tron.prophet.dao.mappers;

import org.tron.prophet.dao.entities.WitnessInfoHistory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface WitnessInfoHistoryMapper {
  List<WitnessInfoHistory> getAllStatistics();

  void addStatistic(WitnessInfoHistory statistics);
}
