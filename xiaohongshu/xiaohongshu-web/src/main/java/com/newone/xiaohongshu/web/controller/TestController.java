package com.newone.xiaohongshu.web.controller;

import com.newone.xiaohongshu.common.aspect.ApiOperationLog;
import com.newone.xiaohongshu.common.domain.dos.UserDO;
import com.newone.xiaohongshu.common.domain.mapper.UserDOMapper;
import com.newone.xiaohongshu.common.enums.ResponseCodeEnum;
import com.newone.xiaohongshu.common.exception.BizException;
import com.newone.xiaohongshu.common.utils.JsonUtil;
import com.newone.xiaohongshu.common.utils.Response;
import com.newone.xiaohongshu.web.mapper.T_UserMapper;
import com.newone.xiaohongshu.web.model.T_User;
import com.newone.xiaohongshu.web.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Collectors;

@RestController
@Slf4j
@Api("test")
public class TestController {
    @Autowired
    private T_UserMapper userMapper;

    @PostMapping("/user/test")
    @ApiOperationLog(description = "测试接口")
    @ApiOperation(value = "测试接口")
    public void test(@RequestBody @Validated UserDO user) {
        T_User tUser=T_User.builder()
                .username("11")
                .password("11")
                .gender('1')
                .birthday(LocalDateTime.now())
                .phone("11111111")
                .avatar("aaaaa")
                .background("aaaaaa")
                .summary("暂时无任何简介")
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .isDeleted(true)
                .build();
        userMapper.insert(tUser);

    }
}
