package com.lianying.shangjialian.service.industry;

import com.lianying.shangjialian.model.dto.industry.IndustryRO;
import com.lianying.shangjialian.model.query.BaseQuery;

import java.util.List;

/**
 * Created by luowen on 2017/2/22.
 */
public interface IndustryService {

    List<IndustryRO> queryIndustry(BaseQuery baseQuery);
}
