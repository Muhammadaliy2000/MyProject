package uz.pdp.myproject.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class BaseResponse {

    ApiResponse SUCCESS = new ApiResponse("SUCCESS", 100);
    ApiResponse UNSUCCESS = new ApiResponse("UNSUCCESS", -100);
    ApiResponse NOT_FOUND = new ApiResponse("NOT FOUND", -10);
    ApiResponse ALREADY_EXISTS = new ApiResponse("ALREADY EXISTS", -20);


}
