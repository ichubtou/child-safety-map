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
    @Enumerated(EnumType.STRING)
    private TagKind kind;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TagCategory tagCategory;

    @OneToMany(mappedBy = "tag", cascade = CascadeType.ALL)
    private List<Marker> markers = new ArrayList<>();

    public enum TagKind {
        SAFE("안전"),
        DANGER("위험");

        @Getter
        public String isSafe;

        TagKind(String isSafe) {
            this.isSafe = isSafe;
        }
    }

    public enum TagCategory {
        POLICE_STATION("경찰서"),
        CONSTRUCTION_SITE("공사장");

        @Getter
        public String category;

        TagCategory(String category) {
            this.category = category;
        }
    }
}
