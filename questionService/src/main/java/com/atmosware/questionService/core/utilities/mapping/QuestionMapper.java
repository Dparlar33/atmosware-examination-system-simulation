package com.atmosware.questionService.core.utilities.mapping;

import com.atmosware.questionService.business.dtos.requests.question.CreateQuestionRequest;
import com.atmosware.questionService.business.dtos.requests.question.UpdateQuestionRequest;
import com.atmosware.questionService.business.dtos.responses.question.GetAllQuestionsResponse;
import com.atmosware.questionService.business.dtos.responses.question.GetQuestionAndOptionResponse;
import com.atmosware.questionService.business.dtos.responses.question.GetQuestionByIdResponse;
import com.atmosware.questionService.entities.Question;
import org.mapstruct.Mapper;

@Mapper(config = MapStructureService.class)
public interface QuestionMapper {

    UpdateQuestionRequest questionToUpdateQuestionRequest(GetQuestionByIdResponse getQuestionByIdResponse);
    Question createQuestionRequestToQuestion(CreateQuestionRequest createQuestionRequest);
    Question updateQuestionRequestToQuestion(UpdateQuestionRequest updateQuestionRequest);
    GetAllQuestionsResponse questionToGetAllQuestionsResponse(Question question);
    GetQuestionByIdResponse questionToGetQuestionByIdResponse(Question question);
    GetQuestionAndOptionResponse questionToGetQuestionAndOptionResponse(Question question);
}
