package org.tron.prophet.job.business.blockloss;

import org.tron.prophet.dao.dao.witnessinfohistory.WitnessInfoHistoryDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tron.prophet.dao.dao.entities.WitnessInfoHistory;
import org.tron.prophet.job.business.blockloss.bo.Witness;
import org.tron.prophet.job.business.blockloss.bo.WitnessList;
import org.tron.prophet.job.service.listwitness.ListWitnessService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BlockLossService {

  @Autowired
  private ListWitnessService listWitnessService;

  @Autowired
  private WitnessInfoHistoryDao witnessInfoHistoryDao;

  private Logger logger = LoggerFactory.getLogger(BlockLossService.class);

  public boolean getBlockLossDaily() {

    List<WitnessInfoHistory> witnessInfoHistoryList = witnessInfoHistoryDao.getAllHistories();
    WitnessList witnessList = listWitnessService.getWitnessList();
    //logger.info(witnessList.toString());

    long missCount = 0;
    for (Witness witness : witnessList.getWitnesses()){
      missCount += witness.getTotalMissed();
    }

    Date now = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

    logger.info(ft.format(now) + " miss count : " + missCount);

    return true;
  }
}
