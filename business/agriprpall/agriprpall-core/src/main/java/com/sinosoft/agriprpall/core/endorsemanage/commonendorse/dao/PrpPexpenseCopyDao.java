package com.sinosoft.agriprpall.core.endorsemanage.commonendorse.dao;

import com.sinosoft.agriprpall.core.endorsemanage.commonendorse.entity.PrpPexpense;
import com.sinosoft.agriprpall.core.endorsemanage.commonendorse.entity.PrpPexpenseCopy;
import com.sinosoft.agriprpall.core.endorsemanage.commonendorse.entity.PrpPexpenseCopyKey;
import com.sinosoft.agriprpall.core.endorsemanage.commonendorse.entity.PrpPexpenseKey;
import com.sinosoft.framework.core.dao.JpaBaseDao;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PrpPexpenseCopyDao extends JpaBaseDao<PrpPexpenseCopy,PrpPexpenseCopyKey> {

}
