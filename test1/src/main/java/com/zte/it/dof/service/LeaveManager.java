package com.zte.it.dof.service;

import com.zte.it.dof.dao.LeaveDao;
import com.zte.it.dof.entity.Leave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LeaveManager {

    @Autowired
    LeaveDao leaveDao;

    /**
     * 保存实体
     */
    public void save(Leave entity) {
        leaveDao.save(entity);
    }

    public void delete(Long id) {
        leaveDao.delete(id);
    }

    @Transactional(readOnly = true)
    public Leave get(Long id) {
        return leaveDao.get(id);
    }

}
