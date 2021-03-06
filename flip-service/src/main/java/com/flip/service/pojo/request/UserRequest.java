package com.flip.service.pojo.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * @author Charles on 01/07/2021
 */
@Getter
@Setter
@ToString
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRequest implements Serializable {

    private String title;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")
    private String email;

    private String mobile;

    @NotBlank(message = "Password is required")
    private String password;

    private List<Long> roleIds;
    private boolean verified = false;
    private boolean deactivated = false;

    public UserRequest() {}

    public UserRequest(String title, String firstName, String lastName, String email, String mobile, String password, List<Long> roleIds, boolean verified) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.roleIds = roleIds;
        this.verified = verified;
    }
}