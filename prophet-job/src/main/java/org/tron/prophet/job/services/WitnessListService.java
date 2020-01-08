package org.tron.prophet.job.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tron.prophet.job.bean.WitnessList;

@FeignClient(url = "http://127.0.0.1:8080", name = "witnessList")
public interface WitnessListService {
  @RequestMapping(value = "/wallet/listwitnesses", method = RequestMethod.GET)
  public WitnessList getWitnessList();
}
