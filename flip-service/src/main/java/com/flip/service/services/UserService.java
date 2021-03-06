package com.flip.service.services;

import com.flip.data.entity.AppUser;
import com.flip.service.pojo.request.UserRequest;
import com.flip.service.pojo.response.BaseResponse;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * @author Charles on 23/06/2021
 */
public interface UserService extends UserDetailsService {

    AppUser findUserById(Long id);

    UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException;

    List<AppUser> getAllActiveUsers(int page, int size);

    BaseResponse saveAppUser(UserRequest userRequest);

    BaseResponse updateUser(Long id, UserRequest userRequest);

    BaseResponse initiateUserVerification(Long userId);

    BaseResponse verifyUser(Long userId, String code);

    BaseResponse deactivateUser(Long id);
}
