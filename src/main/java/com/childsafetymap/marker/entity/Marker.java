package com.childsafetymap.marker.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Marker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String imageUrl;

    @Column(nullable = false)
    private float longitude;

    @Column(nullable = false)
    private float latitude;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

}