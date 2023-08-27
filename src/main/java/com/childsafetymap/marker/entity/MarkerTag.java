package com.childsafetymap.marker.entity;

import com.childsafetymap.tag.entity.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MarkerTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long markerTagId;

    @ManyToOne
    @JoinColumn(name = "marker_id")
    private Marker marker;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;

}
