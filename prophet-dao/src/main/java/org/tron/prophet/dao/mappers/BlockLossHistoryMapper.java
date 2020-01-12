package org.tron.prophet.dao.mappers;

import org.springframework.stereotype.Repository;
import org.tron.prophet.dao.dao.entities.BlockLossHistory;

import java.util.List;

@Repository
public interface BlockLossHistoryMapper {
  List<BlockLossHistory> getAllHistories();
}
