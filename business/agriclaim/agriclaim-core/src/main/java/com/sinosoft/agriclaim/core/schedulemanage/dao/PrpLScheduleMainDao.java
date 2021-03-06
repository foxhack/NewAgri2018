package com.sinosoft.agriclaim.core.schedulemanage.dao;

import com.sinosoft.agriclaim.core.schedulemanage.entity.PrpLScheduleMain;
import com.sinosoft.agriclaim.core.schedulemanage.entity.PrpLScheduleMainKey;
import com.sinosoft.framework.core.dao.JpaBaseDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-08 05:45:58.930 
 * 调度任务主表Dao数据操作对象
 */
@Repository
public interface PrpLScheduleMainDao extends JpaBaseDao<PrpLScheduleMain,PrpLScheduleMainKey> {
}