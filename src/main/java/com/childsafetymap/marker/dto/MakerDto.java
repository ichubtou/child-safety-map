package com.childsafetymap.marker.dto;

import java.time.LocalDateTime;

public class MakerDto {

    public static class Post {

        private boolean isSafe;
        private String tagKind;
        private String tagName;
        private String description;
        private double longitude;
        private double latitude;

    }

    public static class Patch {

        private boolean isSafe;
        private String tagKind;
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

    }

    public static class MarkersResponse {

        private Long markerId;
        private String isSafe;

    }
}
