package com.exception.qms.web.vo.home;

import com.exception.qms.web.vo.common.TagResponseVO;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author jiangbing(江冰)
 * @date 2017/12/26
 * @time 上午11:12
 * @discription
 **/
@Data
public class QuestionDetailResponseVO implements Serializable {
    private Long id;

    private LocalDateTime createTime;

    private Long createUserId;

    private Integer voteUp;

    private Integer voteDown;

    private String titleCn;

    /**
     * meta seo 字段
     */
    private String seoDescription;
    private String seoKeywords;

    private String questionDescHtml;

    private Integer viewNum;

    private List<TagResponseVO> tags;

    private Integer answersCount;

    private List<AnswerResponseVO> answers;

}
