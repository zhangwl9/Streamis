package com.webank.wedatasphere.streamis.jobmanager.manager.entity.vo;

import java.util.Date;

/**
 * @author limeng
 */
public class StreamTaskListVO {
    private Long taskId;
    private Long jobVersionId;
    private String jobName;
    private String creator;
    private String version;
    private Integer status;
    private String startTime;
    private String endTime;
    private String runTime;
    private String stopCause;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getJobVersionId() {
        return jobVersionId;
    }

    public void setJobVersionId(Long jobVersionId) {
        this.jobVersionId = jobVersionId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public String getStopCause() {
        return stopCause;
    }

    public void setStopCause(String stopCause) {
        this.stopCause = stopCause;
    }
}
