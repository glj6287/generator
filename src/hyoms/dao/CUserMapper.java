package hyoms.dao;

import hyoms.model.CUser;

public interface CUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CUser record);

    int insertSelective(CUser record);

    CUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CUser record);

    int updateByPrimaryKey(CUser record);
}