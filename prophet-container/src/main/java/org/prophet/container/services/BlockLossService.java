package org.prophet.container.services;

import org.prophet.container.bean.BlockLoss;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlockLossService {
  public List<BlockLoss> getListByDate(String date, int limit) {
    List<BlockLoss> list = new ArrayList<>();
    BlockLoss date1 = new BlockLoss("2019-12-27", 5, "未知原因");
    BlockLoss date2 = new BlockLoss("2019-12-28", 5, "未知原因");
    list.add(date1);
    list.add(date2);

    return list;
  }
}
