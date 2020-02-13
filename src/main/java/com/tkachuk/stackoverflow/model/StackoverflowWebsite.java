package com.tkachuk.stackoverflow.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "stackoverflow_website")
public class StackoverflowWebsite {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "website")
    private String website;
    @Column(name = "iconimageurl")
    private String iconImageUrl;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
}
