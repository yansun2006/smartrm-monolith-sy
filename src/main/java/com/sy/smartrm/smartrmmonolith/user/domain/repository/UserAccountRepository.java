package com.sy.smartrm.smartrmmonolith.user.domain.repository;

import com.sy.smartrm.smartrmmonolith.user.domain.UserAccount;

/**
 * @author: yoda
 * @description:
 */
public interface UserAccountRepository {

  UserAccount getByOpenId(String openId);

  void add(UserAccount account);

  void update(UserAccount account);

}
