package com.macro.mall.service;

import com.macro.mall.model.CmsSubject;

import java.util.List;

/**
 * 商品专题管理Service
 * Created by macro on 2018/6/1.
 */
public interface CmsSubjectService {
    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll(Long adminId);

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(Long adminId,String keyword, Integer pageNum, Integer pageSize);
}
