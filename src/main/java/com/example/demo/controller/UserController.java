package com.example.demo.controller;




import com.example.demo.exception.AppException;
import com.example.demo.exception.ErrorCodeConstants;
import com.example.demo.rest.req.hostReq;
import com.example.demo.rest.rsp.hostRsp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


/**
 * @description: 控制层代码如下
 * @author: xz
 */
@Api(value = "API - UserController", description = "用户模块接口详情")
@RestController
@RequestMapping("/testUser")
public class UserController {

    /***
     *  @ApiParam 如果方法接受的是具体参数，此注解需要加到方法中的参数上
     */
    @RequestMapping(value = "/aa", method = RequestMethod.GET)
    @ApiOperation(value = "根据用户名称查询服务")
    public void aa(@RequestParam(name = "name") String name) {
        System.out.println("queryUser=====");
    }

    @RequestMapping(value = "/bb", method = RequestMethod.GET)
    @ApiOperation(value = "mingchen")
    public hostRsp bb(@RequestParam(name = "name") String name, @RequestParam(name = "rack") String rack) {
        hostRsp hostRsp = new hostRsp();
        hostRsp.setName(name);
        hostRsp.setRack(rack);
        return hostRsp;
    }

    @PostMapping(value = "/cc")
    @ApiOperation(value = "host")
    public hostRsp cc(@RequestBody hostReq hostReq) {
        hostRsp hostRsp = new hostRsp();
        hostRsp.setName(hostReq.getHostName());
        return hostRsp;
    }

    @PostMapping(value = "/dd")
    @ApiOperation(value = "ffffffff")
    public void dd(){
        int a=1;
        if (a==1){
            throw new AppException(ErrorCodeConstants.ADD_HOST_ERROR,"失败");
        }
        System.out.println(a);
    }

}
