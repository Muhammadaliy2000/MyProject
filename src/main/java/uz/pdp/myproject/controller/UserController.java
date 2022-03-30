package uz.pdp.myproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.myproject.dto.UserDto;
import uz.pdp.myproject.entity.UserEntity;
import uz.pdp.myproject.service.UserService;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public ApiResponse login(@RequestBody UserDto userDto) {
        return userService.login(userDto);
    }
 @PostMapping("/register")
    public ApiResponse register(@RequestBody UserEntity user) {
        return userService.register(user);
    }

}
