package com.childsafetymap.marker.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

public class MakerDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Post {

        @NotNull
        private boolean isSafe;

        @NotNull
        private String tagKind;

        @Pattern(regexp = "^{2,10}$", message = "태그 이름은 2자 이상 10자 이하여야 합니다.")
        @NotNull
        private String tagName;

        @Pattern(regexp = "^{2,10}$", message = "마커 설명은 2자 이상 200자 이하여야 합니다.")
        @NotNull
        private String description;

        @NotNull
        private double longitude;

        @NotNull
        private double latitude;

    }

    public static class Patch {

        @NotNull
        private boolean isSafe;

        @NotNull
        private String tagKind;

        @Pattern(regexp = "^{2,10}$", message = "태그 이름은 2자 이상 10자 이하여야 합니다.")
        @NotNull
        private String tagName;


        private String description;

    }

    public static class MarkerResponse {

        private Long markerId;
        private String writerNickname;
        private Boolean isSafe;
        private String tagKind;
        private String tagName;
        private String description;
        private LocalDateTime createdAt;
        private boolean report;
        private int reportedCount;
        private boolean myMarker;
        private boolean checkAdmin;

    }

    public static class MarkersResponse {

        private Long markerId;
        private String isSafe;

    }
}
