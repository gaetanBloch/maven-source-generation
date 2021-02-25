package com.gbloch.mapstruct;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1320765264990055924L;

    private String firstName;
    private String lastName;
    private String email;
}
