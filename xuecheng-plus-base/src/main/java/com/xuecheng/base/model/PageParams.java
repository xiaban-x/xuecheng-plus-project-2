package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PageParams {

    //当前页码默认值
    public static final long DEFAULT_PAGE_CURRENT = 1L;
    //每页记录数默认值
    public static final long DEFAULT_PAGE_SIZE = 10L;

        @ApiModelProperty("当前页码")
        private Long pageNo = DEFAULT_PAGE_CURRENT;

        @ApiModelProperty("每页记录数默认值")
        private Long pageSize = DEFAULT_PAGE_SIZE;

        public class QueryCourseParamsDto {

            //审核状态
            @ApiModelProperty("审核状态")
            private String auditStatus;
            //课程名称
            @ApiModelProperty("课程名称")
            private String courseName;

        }



}
