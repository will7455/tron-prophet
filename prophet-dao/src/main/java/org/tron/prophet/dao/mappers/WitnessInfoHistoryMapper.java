package org.tron.prophet.dao.mappers;

import org.springframework.stereotype.Repository;
import org.tron.prophet.dao.dao.entities.WitnessInfoHistory;

import java.util.List;

@Repository
public interface WitnessInfoHistoryMapper {
  List<WitnessInfoHistory> getAllHistories();

  void addHistory(WitnessInfoHistory history);
}
