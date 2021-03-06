package com.exception.qms.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author jiangbing(江冰)
 * @date 2017/12/16
 * @time 下午9:19
 * @discription
 **/
@Data
public class Question {
    private Long id;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Long createUserId;

    private Integer voteUp;

    private Integer voteDown;

    private String titleCn;

    private Integer viewNum;

    private Integer type;

    private Boolean isDeleted;
}