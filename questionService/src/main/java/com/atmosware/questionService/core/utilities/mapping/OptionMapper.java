package com.atmosware.questionService.core.utilities.mapping;

import com.atmosware.questionService.business.dtos.requests.option.CreateOptionRequest;
import com.atmosware.questionService.business.dtos.requests.option.UpdateOptionRequest;
import com.atmosware.questionService.business.dtos.responses.option.GetAllOptionsResponse;
import com.atmosware.questionService.business.dtos.responses.option.GetOptionByIdResponse;
import com.atmosware.questionService.entities.Option;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OptionMapper {
    OptionMapper INSTANCE = Mappers.getMapper(OptionMapper.class);

    Option createOptionRequestToOption(CreateOptionRequest createOptionRequest);
    Option updateOptionRequestToOption(UpdateOptionRequest updateOptionRequest);
    GetAllOptionsResponse optionToGetAllOptionResponse(Option option);
    GetOptionByIdResponse optionToGetOptionByIdResponse(Option option);
}
