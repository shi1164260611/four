package com.qf.service.impl;

import org.springframework.stereotype.Service;

import com.moxi.mogublog.xo.entity.Visitor;
import com.moxi.mogublog.xo.mapper.VisitorMapper;
import com.moxi.mogublog.xo.service.VisitorService;
import com.moxi.mougblog.base.serviceImpl.SuperServiceImpl;

/**
 * <p>
 * 博主表 服务实现类
 * </p>
 *
 * @author xuzhixiang
 * @since 2018-09-08
 */
@Service
public class VisitorServiceImpl extends SuperServiceImpl<VisitorMapper, Visitor> implements VisitorService {

}
