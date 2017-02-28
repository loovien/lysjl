package com.lianying.shangjialian.service.industry;

import com.lianying.shangjialian.model.dataobject.industry.IndustryDO;
import com.lianying.shangjialian.model.dto.industry.IndustryRO;
import com.lianying.shangjialian.model.query.BaseQuery;

import java.util.List;

/**
 * Created by luowen on 2017/2/22.
 */
public interface IndustryService {

    <S extends BaseQuery> List<IndustryRO> queryIndustry(S baseQuery);

    Integer insert(IndustryDO industryDO);

    IndustryRO queryById(Integer id);

    void update(IndustryDO industryDO);

    void deleteById(Integer id);
}
