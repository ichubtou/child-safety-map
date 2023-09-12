package com.childsafetymap.guardianwards.entity;

import com.childsafetymap.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class GuardianWards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guardianwardsId;

    @Column(columnDefinition = "tinyint")
    private boolean checkParentChild;

    @ManyToOne
    @JoinColumn(name = "parents_id")
    private User parents;

    @ManyToOne
    @JoinColumn(name = "child_id")
    private User child;

}
