package org.tron.prophet.job.business.blockloss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configuration
@EnableScheduling
public class BlockLossJob {

  @Autowired
  private BlockLossService blockLossService;
  private Logger logger = LoggerFactory.getLogger(BlockLossJob.class);

  @Scheduled(cron = "0 * * * * *")
  public void getBlockLoss() {
    blockLossService.getBlockLossDaily();
  }
}
