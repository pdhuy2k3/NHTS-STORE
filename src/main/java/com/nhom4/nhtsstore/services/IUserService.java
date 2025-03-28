package com.nhom4.nhtsstore.services;

import com.nhom4.nhtsstore.viewmodel.user.UserCreatVm;
import com.nhom4.nhtsstore.viewmodel.user.UserRecordVm;
import com.nhom4.nhtsstore.viewmodel.user.UserSessionVm;
import com.nhom4.nhtsstore.viewmodel.user.UserUpdateVm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;

public interface IUserService {
    // login
    boolean authenticate(String username, String password);
    UserSessionVm findByUsername(String username);
    
    UserRecordVm createUser(UserCreatVm userCreatVm);
    UserRecordVm updateUser(UserUpdateVm userUpdateVm);
    void deleteUser(int userId);

    // find user record page
    Page<UserRecordVm> findUsersPage(Pageable pageable);
    // find user record by id
    UserRecordVm findUserRecordById(int userId);
    // Filter user
    Page<UserRecordVm> filterUser(String keyword, Pageable pageable);

}
