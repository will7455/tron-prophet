package org.tron.prophet.container.controller;

import org.tron.prophet.container.bean.BlockLoss;
import org.tron.prophet.container.service.BlockLossService;
import org.tron.prophet.container.bean.ApiResponse;
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
public class BlockLossController {

  @Autowired
  BlockLossService blockLossService;

  @RequestMapping(value = "loss", method = RequestMethod.GET)
  public ApiResponse<List> getBlockLossList(String date, int limit) {

    List<BlockLoss> blockLossList;
    blockLossList = blockLossService.getListByDate("2019-12-27", 2);
    return new ApiResponse<>(blockLossList);
  }

  @RequestMapping(value = "loss", method = RequestMethod.POST)
  public ApiResponse addBlockLossComment(@NotNull(message = "日期不能为空") String date, String comment) {
    boolean result = blockLossService.addComment(date, comment);
    if (!result) {
      return new ApiResponse<>(500, "添加评论失败，请重试！");
    } else {
      return new ApiResponse<>();
    }
  }
}
