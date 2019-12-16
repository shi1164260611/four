package com.qf.service.impl;

import org.springframework.stereotype.Service;

import com.moxi.mogublog.xo.entity.Link;
import com.moxi.mogublog.xo.mapper.LinkMapper;
import com.moxi.mogublog.xo.service.LinkService;
import com.moxi.mougblog.base.serviceImpl.SuperServiceImpl;

/**
 * <p>
 * 友链表 服务实现类
 * </p>
 *
 * @author xuzhixiang
 * @since 2018-09-08
 */
@Service
public class LinkServiceImpl extends SuperServiceImpl<LinkMapper, Link> implements LinkService {

}
