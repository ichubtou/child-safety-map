package com.childsafetymap.tag.entity;

import com.childsafetymap.marker.entity.Marker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long tagId;

    @Column(nullable = false)
    private boolean isSafe;

    private TagCategory kind;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "tag", cascade = CascadeType.ALL)
    private List<Marker> markers = new ArrayList<>();

    public enum TagCategory {
        POLICE_STATION,
        CONSTRUCTION_SITE,
        ETC;
    }
}
