package com.qf.vo;

import com.qf.enums.EStatus;
import com.qf.validator.annotion.IdValid;
import com.qf.validator.annotion.NotBlank;
import com.qf.validator.group.Delete;
import com.qf.validator.group.Insert;
import com.qf.validator.group.Update;
import lombok.Data;

/**
 * BaseVO   view object 表现层 基类对象
 *
 * @author: 陌溪
 * @create: 2019-12-03-22:38
 */
@Data
public class BaseVO<T> extends PageInfo<T> {

    /**
     * 唯一UID
     */
    @IdValid(groups = {Update.class, Delete.class})
    private String uid;

    private Integer status;
}
