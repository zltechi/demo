package com.lohtech.user.controller;

import com.lohtech.common.api.CommonResult;
import com.lohtech.model.user.entity.UmsAdmin;
import com.lohtech.user.dto.UmsAdminParam;
import com.lohtech.user.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
@Api(tags = "后台用户管理")
@RequestMapping("/admin")
public class UmsAdminController {

    @Autowired
    private UmsAdminService umsAdminService;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<UmsAdmin> register(@RequestBody UmsAdminParam param, BindingResult result) {
        UmsAdmin admin = umsAdminService.register(param);
        if (admin == null) {
            return CommonResult.failed("用户已注册");
        } else {
            return CommonResult.success(admin);
        }
    }

}
