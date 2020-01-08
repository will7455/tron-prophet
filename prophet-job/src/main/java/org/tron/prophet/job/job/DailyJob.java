package org.tron.prophet.job.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.tron.prophet.job.bean.Witness;
import org.tron.prophet.job.bean.WitnessList;
import org.tron.prophet.job.services.WitnessListService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Configuration
@EnableScheduling
public class DailyJob {

  @Autowired
  private WitnessListService witnessListService;

  private Logger logger = LoggerFactory.getLogger(DailyJob.class);

  @Scheduled(cron = "0 * * * * *")
  public void getBlockLoss() {
    WitnessList witnessList = witnessListService.getWitnessList();
    logger.info(witnessList.toString());

    long missCount = 0;
    for (Witness witness : witnessList.getWitnesses()){
      missCount += witness.getTotalMissed();
    }

    Date now = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

    logger.info(ft.format(now) + " miss count : " + missCount);
  }
}
