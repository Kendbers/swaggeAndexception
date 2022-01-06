package com.example.demo.rest.rsp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "hostRsp", description = "hostinfo")
public class hostRsp implements Serializable {
    private static final long serialVersionUID = 5522692608162259216L;
    @ApiModelProperty(value = "name")
    private String name;
    @ApiModelProperty(value ="rack")
    private String rack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRack() {
        return rack;
    }

    public void setRack(String rack) {
        this.rack = rack;
    }
}
