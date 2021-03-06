package com.sinosoft.agriprpall.core.endorsemanage.commonendorse.dao;

import com.sinosoft.agriprpall.core.endorsemanage.commonendorse.entity.PrpCPitemKind;
import com.sinosoft.agriprpall.core.endorsemanage.commonendorse.entity.PrpCPitemKindAgri;
import com.sinosoft.agriprpall.core.endorsemanage.commonendorse.entity.PrpCPitemKindAgriKey;
import com.sinosoft.framework.core.dao.JpaBaseDao;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-10-24 03:06:48.016 
 * 农业附加险信息表Dao数据操作对象
 */
@Repository
public interface PrpCPitemKindAgriDao extends JpaBaseDao<PrpCPitemKindAgri,PrpCPitemKindAgriKey> {
    @Modifying
    @Transactional
    @Query(value = "delete from PrpCPitemKindAgri p where p.policyNo=?1")
    public void deleteAllByCondition(String policyNo);

    @Query(value = "select p from PrpCPitemKindAgri p where p.policyNo=:policyNo")
    public List<PrpCPitemKindAgri> findPrpCPItemKindAgriByPolicyNo(@Param("policyNo") String policyNo);
}