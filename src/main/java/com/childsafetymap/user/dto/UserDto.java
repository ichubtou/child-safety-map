package com.childsafetymap.user.dto;

public class UserDto {

    public static class Post {

        private String email;
        private String password;
        private boolean isParents;

    }

    public static class Update {

        private String previousPassword;
        private String password;
        private String checkPassword;

    }

    public static class Response {

        private Long userId;
        private String name;
        private String nickname;
        private String profileImageUrl;
        private boolean isParents;

    }

}
