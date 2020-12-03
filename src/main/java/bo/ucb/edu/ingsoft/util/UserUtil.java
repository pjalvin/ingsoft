package bo.ucb.edu.ingsoft.util;

import bo.ucb.edu.ingsoft.dto.UserInformation;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtil {
    public UserInformation informationUser(){

        Authentication a= SecurityContextHolder.getContext().getAuthentication();
        UserInformation userInformation=(UserInformation) a.getCredentials();
        return userInformation;
    }
    public Integer getIdUser(){

        Authentication a= SecurityContextHolder.getContext().getAuthentication();
        UserInformation userInformation=(UserInformation) a.getCredentials();
        return userInformation.getIdUser();
    }
    public Integer getIdSeller(){

        Authentication a= SecurityContextHolder.getContext().getAuthentication();
        UserInformation userInformation=(UserInformation) a.getCredentials();
        return userInformation.getIdSeller();
    }
}
