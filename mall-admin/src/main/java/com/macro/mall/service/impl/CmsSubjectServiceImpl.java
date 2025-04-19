package com.macro.mall.service.impl;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.macro.mall.mapper.CmsSubjectMapper;
import com.macro.mall.model.CmsSubject;
import com.macro.mall.model.CmsSubjectExample;
import com.macro.mall.service.CmsSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品专题管理Service实现类
 * Created by macro on 2018/6/1.
 */
@Service
public class CmsSubjectServiceImpl implements CmsSubjectService {
    @Autowired
    private CmsSubjectMapper subjectMapper;

    @Override
    public List<CmsSubject> listAll(Long adminId) {
        CmsSubjectExample example = new CmsSubjectExample();
        example.createCriteria().andAdminIdEqualTo(adminId);
        return subjectMapper.selectByExample(example);
    }

    @Override
    public List<CmsSubject> list(Long adminId,String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CmsSubjectExample example = new CmsSubjectExample();
        CmsSubjectExample.Criteria criteria = example.createCriteria();
        criteria.andAdminIdEqualTo(adminId);
        if (!StrUtil.isEmpty(keyword)) {
            criteria.andTitleLike("%" + keyword + "%");
        }
        return subjectMapper.selectByExample(example);
    }
}
