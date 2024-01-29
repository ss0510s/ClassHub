package com.f17coders.classhub.module.domain.study.dto.response;

import com.f17coders.classhub.module.domain.tag.Dto.response.TagListRes;
import com.f17coders.classhub.module.domain.tag.Dto.response.TagRes;
import com.f17coders.classhub.module.domain.tag.Tag;
import lombok.Builder;

import java.util.List;

@Builder
public record StudyListDetailRes(
    int studyId,
    String title,
    long currentMembers,
    int capacity,

    int studyReaderId,
    String description,
    boolean isPublic,
    TagRes tag

) {

}
