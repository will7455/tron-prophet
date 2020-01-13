package org.tron.prophet.container.controller;

import org.tron.prophet.container.bean.ApiResponse;
import org.tron.prophet.dao.dao.witnessinfohistory.WitnessInfoHistoryDao;
import org.tron.prophet.dao.dao.entities.WitnessInfoHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/witness")
public class WitnessInfoController {

  @Autowired
  private WitnessInfoHistoryDao witnessStatisticsBusiness;

  @RequestMapping("/list")
  public ApiResponse<List> getList() {

    List<WitnessInfoHistory> list = witnessStatisticsBusiness.getAllHistories();

    return new ApiResponse<>(list);
  }
}
