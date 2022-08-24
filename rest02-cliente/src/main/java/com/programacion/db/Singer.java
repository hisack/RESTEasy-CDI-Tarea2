package com.programacion.db;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Singer {
    @Getter @Setter private Integer id;
    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;
    @Getter @Setter private Date birthDate;

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
