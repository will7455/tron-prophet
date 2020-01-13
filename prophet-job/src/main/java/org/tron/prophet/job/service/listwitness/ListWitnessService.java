package org.tron.prophet.job.service.listwitness;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tron.prophet.job.business.blockloss.bo.WitnessList;

@FeignClient(url = "https://testhttpapi.tronex.io", name = "witnessList")
public interface ListWitnessService {
  @RequestMapping(value = "/wallet/listwitnesses", method = RequestMethod.GET)
  public WitnessList getWitnessList();

}
