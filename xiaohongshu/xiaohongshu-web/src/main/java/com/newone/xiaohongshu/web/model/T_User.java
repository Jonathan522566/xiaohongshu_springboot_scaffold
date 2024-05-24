package com.newone.xiaohongshu.web.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("t_user")
public class T_User {
    @TableId(type = IdType.AUTO)
    private Long userId;
    private String username;
    private String password;
    private Character gender;
    private LocalDateTime birthday;
    private String phone;
    private String avatar;
    private String background;
    private String summary;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private boolean isDeleted;
}

















