package com.sist.web.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIEGENRE")
@Getter
@Setter
public class MovieEntity {
    @Id
    private int imdb_Id;
    private String Imdb_Link;
    private String IMDB_Score;
    private String title, genre, poster;
}
