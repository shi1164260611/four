package com.qf.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.mapper.SuperMapper;
import com.qf.service.SuperService;


/**
 * SuperService 实现类（ 泛型：M 是  mapper(dao) 对象，T 是实体 ）
 * @author xuzhixiang
 * @date 2018年9月4日10:38:18
 * @param <T>
 */

public class SuperServiceImpl<M extends SuperMapper<T>, T> extends ServiceImpl<M, T>  implements SuperService<T> {

}
