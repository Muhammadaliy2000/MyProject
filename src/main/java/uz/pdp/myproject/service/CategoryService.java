package uz.pdp.myproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.pdp.myproject.entity.MeasurmentEntity;
import uz.pdp.myproject.repository.MeasurmentRepository;
import uz.pdp.myproject.response.ApiResponse;
import uz.pdp.myproject.response.BaseResponse;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryService categoryService;

    private final BaseResponse baseResponse;

    public ResponseEntity<?> addMeasurement(MeasurmentEntity measurmentEntity) {


        ApiResponse Success = baseResponse.getSUCCESS();
        return ResponseEntity.ok(Success);
    }
}
