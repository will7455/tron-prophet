package org.tron.prophet.dao.dao.blocklosshistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tron.prophet.dao.dao.entities.BlockLossHistory;
import org.tron.prophet.dao.mappers.BlockLossHistoryMapper;

import java.util.List;

@Component
public class BlockLossHistoryDao {
  @Autowired
  private BlockLossHistoryMapper blockLossHistoryMapper;

  public List<BlockLossHistory> getAllHistories() {
    return blockLossHistoryMapper.getAllHistories();
  }
}
