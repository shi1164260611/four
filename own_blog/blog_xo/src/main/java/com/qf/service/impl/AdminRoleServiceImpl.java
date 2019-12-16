package com.qf.service.impl;

import org.springframework.stereotype.Service;

import com.moxi.mogublog.xo.entity.AdminRole;
import com.moxi.mogublog.xo.mapper.AdminRoleMapper;
import com.moxi.mogublog.xo.service.AdminRoleService;
import com.moxi.mougblog.base.serviceImpl.SuperServiceImpl;


/**
 * <p>
 * 管理员角色关系表 服务实现类
 * </p>
 *
 * @author limbo
 * @since 2018-09-30
 */
@Service
public class AdminRoleServiceImpl extends SuperServiceImpl<AdminRoleMapper, AdminRole> implements AdminRoleService {

}
