package io.metersphere.base.mapper.ext;

import io.metersphere.api.dto.datacount.response.TaskInfoResult;
import io.metersphere.api.dto.definition.ApiSwaggerUrlDTO;
import io.metersphere.controller.request.QueryScheduleRequest;
import io.metersphere.dto.ScheduleDao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExtScheduleMapper {
    List<ScheduleDao> list(@Param("request") QueryScheduleRequest request);

    long countTaskByProjectId(String workspaceId);

    long countTaskByProjectIdAndCreateTimeRange(@Param("projectId")String projectId, @Param("startTime") long startTime, @Param("endTime") long endTime);

    List<TaskInfoResult> findRunningTaskInfoByProjectID(String workspaceID);

    void insert(@Param("apiSwaggerUrlDTO") ApiSwaggerUrlDTO apiSwaggerUrlDTO);

    ApiSwaggerUrlDTO  select(String id);

}