package com.topBalance.wishTree.service;

import com.topBalance.wishTree.dto.User;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface UserService {
    // 전체목록 조회
   List<Map<String, Object>> getAllUsers();

    // 정보수정
    void updateUser(User user);

    // 회원가입
    void insertUser(User user);

    // 비밀번호찾기 (아이디,핸드폰번호)
    String findByPassword(String userId, String userPhone);

    // 아이디찾기 (이름, 핸드폰번호, 생년월일)
    String findById(String userName, String userPhone, Date userBirthdate);

    // 로그인
    User login(String userId, String userPassword);

    // 유저아이디로 전체정보 불러오기 - 유저 정보 불러오기시 필요
    User findUserById(String userId);

    // 회원가입시 중복 정보 확인용
    boolean checkUsers(String userId);
}
