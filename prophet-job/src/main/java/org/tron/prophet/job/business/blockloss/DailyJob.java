package org.tron.prophet.job.business.blockloss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.tron.prophet.job.services.BlockLossService;

@Component
@Configuration
@EnableScheduling
public class DailyJob {

  @Autowired
  private BlockLossService blockLossService;
  private Logger logger = LoggerFactory.getLogger(DailyJob.class);

  @Scheduled(cron = "0 * * * * *")
  public void getBlockLoss() {
    blockLossService.getBlockLossDaily();
  }
}
