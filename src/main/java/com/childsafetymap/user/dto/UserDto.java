package com.childsafetymap.user.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class UserDto {

    @Getter
    public static class Post {

        @NotNull
        @Pattern(regexp = "[0-9a-zA-Z]+(.[_a-z0-9-]+)*@(?:\\\\w+\\\\.)+\\\\w+$", message = "유효한 이메일 주소가 아닙니다.")
        private String email;

        @NotNull
        @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$", message = "비밀번호는 영문과 특수문자, 숫자를 포함하여 8자 이상, 20자 이하여야 합니다.")
        private String password;

        @NotNull
        @Pattern(regexp = "^[가-힣]{2,4}$", message = "유효한 이름이 아닙니다.")
        private String name;

        @NotNull
        @Pattern(regexp = "^[\\w\\Wㄱ-ㅎㅏ-ㅣ가-힣]{2,20}$", message = "닉네임은 특수문자를 제외한 2자 이상, 8자 이하여야 합니다.")
        private String nickName;


        private boolean isParents;

    }

    public static class Update {

        @NotNull
        @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$", message = "비밀번호는 영문과 특수문자, 숫자를 포함하여 8자 이상, 20자 이하여야 합니다.")
        private String previousPassword;

        @NotNull
        @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$", message = "비밀번호는 영문과 특수문자, 숫자를 포함하여 8자 이상, 20자 이하여야 합니다.")
        private String password;
        private String checkPassword;

    }

    @Setter
    public static class Response {

        private Long userId;
        private String name;
        private String nickname;
        private String profileImageUrl;
        private boolean isParents;

    }

}
