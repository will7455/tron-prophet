package org.tron.prophet.container.services;

import org.tron.prophet.container.bean.BlockLoss;
import org.tron.prophet.container.bean.WitnessBlockLoss;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlockLossService {
  public List<BlockLoss> getListByDate(String date, int limit) {
    List<WitnessBlockLoss> witnessBlockLossList = new ArrayList<>();
    witnessBlockLossList.add(new WitnessBlockLoss("qqqqqq", "http://abc.com", 3));
    witnessBlockLossList.add(new WitnessBlockLoss("wwwwww", "http://aaa.com", 2));
    List<BlockLoss> list = new ArrayList<>();
    BlockLoss date1 = new BlockLoss("2019-12-27", 5, "未知原因", witnessBlockLossList);
    BlockLoss date2 = new BlockLoss("2019-12-28", 5, "未知原因", new ArrayList<>());
    list.add(date1);
    list.add(date2);

    return list;
  }

  public boolean addComment(String date, String comment) {
    System.out.println(date + comment);
    return true;
  }
}
