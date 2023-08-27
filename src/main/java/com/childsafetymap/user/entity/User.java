package com.childsafetymap.user.entity;

import com.childsafetymap.guardianwards.entity.GuardianWards;
import com.childsafetymap.marker.entity.Marker;
import com.childsafetymap.report.entity.Report;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String profileImageUrl = "";

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles = new ArrayList<>();

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserStatus status = UserStatus.USER_ACTIVE;

    private LocalDateTime banTime;

    private int reportedCount;

    private int todayReportCount;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Marker> markers = new ArrayList<>();

    @OneToMany(mappedBy = "parents", cascade = CascadeType.ALL)
    private List<GuardianWards> parents = new ArrayList<>();

    @OneToMany(mappedBy = "child", cascade = CascadeType.ALL)
    private List<GuardianWards> child = new ArrayList<>();

    @OneToMany(mappedBy = "report", cascade = CascadeType.ALL)
    private List<Report> reports = new ArrayList<>();

    public enum UserStatus {
        USER_ACTIVE("활동중"),
        USER_BANNED("정지회원");

        @Getter
        private String status;

        UserStatus(String status) {
            this.status = status;
        }
    }
}
