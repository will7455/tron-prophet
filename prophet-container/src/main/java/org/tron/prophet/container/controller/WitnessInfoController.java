package org.tron.prophet.container.controller;

import org.tron.prophet.container.util.JsonResult;
import org.tron.prophet.dao.business.WitnessInfoHistoryBusiness;
import org.tron.prophet.dao.entities.WitnessInfoHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/witness")
public class WitnessInfoController {

  @Autowired
  private WitnessInfoHistoryBusiness witnessStatisticsBusiness;

  @RequestMapping("/list")
  public JsonResult<List> getList() {

    List<WitnessInfoHistory> list = witnessStatisticsBusiness.getAllStatistics();

    return new JsonResult<>(list);
  }
}
