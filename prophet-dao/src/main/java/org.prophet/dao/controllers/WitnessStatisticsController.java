package org.prophet.dao.controllers;

import org.prophet.dao.entities.ServiceResponse;
import org.prophet.dao.entities.WitnessStatistics;
import org.prophet.dao.services.WitnessStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/statistics")
public class WitnessStatisticsController {
  @Autowired
  private WitnessStatisticsService witnessStatisticsService;

  @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
  public ServiceResponse<List<WitnessStatistics>> getAllStatistics() {
    return witnessStatisticsService.getAllStatistics();
  }

  /**
   * add raw witness statistics
   * @param statistics
   * @return
   */
  @RequestMapping(value="/add",method=RequestMethod.POST,produces = {"application/json;charset=UTF-8"}, consumes = {"application/json"})
  public ServiceResponse<String> addStatistic(@RequestBody WitnessStatistics statistics) {
    return witnessStatisticsService.addStatistic(statistics);
  }
}
