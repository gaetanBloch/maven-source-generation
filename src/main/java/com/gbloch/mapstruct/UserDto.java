package com.gbloch.mapstruct;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1339790156530026941L;

    private String firstName;
    private String lastName;
    private String email;
}
