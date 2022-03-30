package uz.pdp.myproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.myproject.dto.UserDto;
import uz.pdp.myproject.entity.UserEntity;
import uz.pdp.myproject.repository.UserRepository;
import uz.pdp.myproject.response.ApiResponse;
import uz.pdp.myproject.response.BaseResponse;

@Service
@RequiredArgsConstructor
public class UserService {
    UserRepository userRepository;
    private final BaseResponse baseResponse;

    public ApiResponse login(UserDto userDto) {
        return baseResponse.getSUCCESS();
    }

    public ApiResponse register(UserEntity user) {
        return baseResponse.getSUCCESS();
    }
}
