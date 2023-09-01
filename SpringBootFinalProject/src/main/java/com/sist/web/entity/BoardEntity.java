package com.sist.web.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "board")
@Getter
@Setter
@DynamicUpdate
public class BoardEntity {
    @Id
    private int no;
    private String name, subject, content;
    @Column(insertable = true, updatable = false) // 추가(insert), 수정(X)
    private String pwd;
    private int hit;
    @Column(insertable = true, updatable = false) // 추가(insert), 수정(X)
    private String regdate;

    @PrePersist
    public void regdate() {
        this.regdate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
