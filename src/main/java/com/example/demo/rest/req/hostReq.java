package com.example.demo.rest.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "hostReq",description = "host")
public class hostReq implements Serializable {
    private static final long serialVersionUID = 5745084711364798648L;
    @ApiModelProperty(value = "hostName", example = "host1")
    private String hostName;
   @ApiModelProperty(value = "ip")
    private String ip ;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}