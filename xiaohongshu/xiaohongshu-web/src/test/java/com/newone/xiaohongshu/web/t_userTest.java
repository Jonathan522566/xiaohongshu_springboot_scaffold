package com.newone.xiaohongshu.web;

import com.newone.xiaohongshu.web.mapper.T_UserMapper;
import com.newone.xiaohongshu.web.model.T_User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@SpringBootTest
public class t_userTest {
    @Autowired
    private T_UserMapper tUserMapper;

    /**
     * 插入测试
     */
     @Test
    void TestInsert(){
         T_User tUser=T_User.builder()
                 .username("121")
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
         tUserMapper.insert(tUser);
     }

}
