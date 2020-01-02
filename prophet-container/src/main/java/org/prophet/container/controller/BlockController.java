package org.prophet.container.controller;

import org.prophet.container.bean.BlockLoss;
import org.prophet.container.services.BlockLossService;
import org.prophet.container.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/block")
public class BlockController {

  @Autowired
  BlockLossService blockLossService;

  @RequestMapping("loss")
  public JsonResult<List> getBlockLossList() {

    List<BlockLoss> blockLossList;
    blockLossList = blockLossService.getListByDate("2019-12-27", 2);
    return new JsonResult<>(blockLossList);
  }
}
