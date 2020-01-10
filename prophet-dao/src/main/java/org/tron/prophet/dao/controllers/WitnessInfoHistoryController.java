package org.tron.prophet.dao.controllers;

import org.tron.prophet.dao.entities.ServiceResponse;
import org.tron.prophet.dao.entities.WitnessInfoHistory;
import org.tron.prophet.dao.services.WitnessInfoHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/statistics")
public class WitnessInfoHistoryController {
  @Autowired
  private WitnessInfoHistoryService witnessStatisticsService;

  @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
  public ServiceResponse<List<WitnessInfoHistory>> getAllStatistics() {
    return witnessStatisticsService.getAllStatistics();
  }

  /**
   * add raw witness statistics
   * @param statistics
   * @return
   */
  @RequestMapping(value="/add",method=RequestMethod.POST,produces = {"application/json;charset=UTF-8"}, consumes = {"application/json"})
  public ServiceResponse<String> addStatistic(@RequestBody WitnessInfoHistory statistics) {
    return witnessStatisticsService.addStatistic(statistics);
  }
}
