package com.programacion.db;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@JsonFormat
@ToString
public class Album {
    @Getter @Setter private Integer id;
    @Getter @Setter private Integer singer_id;
    @Getter @Setter private String title;
    @Getter @Setter private Date release_date;
}
