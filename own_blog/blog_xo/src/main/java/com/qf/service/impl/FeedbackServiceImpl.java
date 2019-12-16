package com.qf.service.impl;

import org.springframework.stereotype.Service;

import com.moxi.mogublog.xo.entity.Feedback;
import com.moxi.mogublog.xo.mapper.FeedbackMapper;
import com.moxi.mogublog.xo.service.FeedbackService;
import com.moxi.mougblog.base.serviceImpl.SuperServiceImpl;

/**
 * <p>
 * 反馈表 服务实现类
 * </p>
 *
 * @author xuzhixiang
 * @since 2018-09-08
 */
@Service
public class FeedbackServiceImpl extends SuperServiceImpl<FeedbackMapper, Feedback> implements FeedbackService {

}
