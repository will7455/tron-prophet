package org.tron.prophet.job.services;

import org.tron.prophet.dao.business.WitnessInfoHistoryBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tron.prophet.dao.entities.WitnessInfoHistory;
import org.tron.prophet.job.bo.Witness;
import org.tron.prophet.job.bo.WitnessList;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BlockLossService {

  @Autowired
  private WitnessListService witnessListService;

  @Autowired
  private WitnessInfoHistoryBusiness witnessInfoHistoryBusiness;

  private Logger logger = LoggerFactory.getLogger(BlockLossService.class);

  public boolean getBlockLossDaily() {

    List<WitnessInfoHistory> witnessInfoHistoryList = witnessInfoHistoryBusiness.getAllStatistics();
    WitnessList witnessList = witnessListService.getWitnessList();
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
