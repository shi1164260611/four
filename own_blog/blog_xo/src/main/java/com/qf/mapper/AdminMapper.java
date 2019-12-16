package com.qf.mapper;

import com.moxi.mogublog.xo.entity.Admin;
import com.moxi.mougblog.base.mapper.SuperMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 管理员表 Mapper 接口
 * </p>
 *
 * @author xuzhixiang
 * @since 2018-09-04
 */
public interface AdminMapper extends SuperMapper<Admin> {

    /**
     * 通过uid获取管理员
     * @return
     */
    public Admin getAdminByUid(@Param("uid") String uid);
}
