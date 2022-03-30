package uz.pdp.myproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.myproject.entity.MeasurmentEntity;
import uz.pdp.myproject.response.ApiResponse;
import uz.pdp.myproject.service.MeasurmentService;

@RequiredArgsConstructor
@RequestMapping("/api/measurement")
@RestController
public class MeasurementController {


    private final MeasurmentService measurmentService;

    @PostMapping
    public ApiResponse addMeasurement(@RequestBody MeasurmentEntity measurmentEntity) {
        return measurmentService.addMeasurement(measurmentEntity);
    }
}
