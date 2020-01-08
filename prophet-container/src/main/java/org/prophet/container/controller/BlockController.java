package org.prophet.container.controller;

import org.prophet.container.bean.BlockLoss;
import org.prophet.container.services.BlockLossService;
import org.prophet.container.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/block")
@Validated
public class BlockController {

  @Autowired
  BlockLossService blockLossService;

  @RequestMapping(value = "loss", method = RequestMethod.GET)
  public JsonResult<List> getBlockLossList(String date, int limit) {

    List<BlockLoss> blockLossList;
    blockLossList = blockLossService.getListByDate("2019-12-27", 2);
    return new JsonResult<>(blockLossList);
  }

  @RequestMapping(value = "loss", method = RequestMethod.POST)
  public JsonResult addBlockLossComment(@NotNull(message = "日期不能为空") String date, String comment) {
    System.out.println(date + comment);
    return new JsonResult<>();
  }
}
