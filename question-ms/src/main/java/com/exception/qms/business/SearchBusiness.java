package com.exception.qms.business;

import com.exception.qms.common.BaseResponse;
import com.exception.qms.common.PageQueryResponse;
import com.exception.qms.web.dto.question.response.SearchAboutQuestionResponseDTO;
import com.exception.qms.web.vo.common.QuestionSearchResponseVO;

import java.util.List;

/**
 * @author jiangbing(江冰)
 * @date 2017/12/16
 * @time 下午9:19
 * @discription
 **/
public interface SearchBusiness {

    BaseResponse updateAllQuestionIndex();

    PageQueryResponse<QuestionSearchResponseVO> searchQuestion(Integer pageIndex, Integer pageSize, String key, String tab);

    BaseResponse<List<SearchAboutQuestionResponseDTO>> searchAboutQuestion(String s, Long title);
}
