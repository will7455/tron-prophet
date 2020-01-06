package org.prophet.dao.services;

import org.prophet.dao.entities.ServiceResponse;
import org.prophet.dao.entities.WitnessStatistics;

import java.util.List;

public interface WitnessStatisticsService {
  ServiceResponse<List<WitnessStatistics>> getAllStatistics();

  ServiceResponse<String> addStatistic(WitnessStatistics statistics);
}
