package uz.pdp.myproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.myproject.dto.MeasurmentDto;
import uz.pdp.myproject.entity.MeasurmentEntity;
import uz.pdp.myproject.repository.MeasurmentRepository;
import uz.pdp.myproject.response.ApiResponse;
import uz.pdp.myproject.response.BaseResponse;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MeasurmentService {

    private final MeasurmentRepository measurmentRepository;

    private final BaseResponse baseResponse;

    public ApiResponse addMeasurement(MeasurmentEntity measurmentEntity) {
        if (measurmentRepository.existsByName(measurmentEntity.getName())) {
            ApiResponse EXISTS = baseResponse.getALREADY_EXISTS();
            return baseResponse.getALREADY_EXISTS();
        }
        measurmentRepository.save(measurmentEntity);
        ApiResponse Success = baseResponse.getSUCCESS();
        return Success;
    }

    public ApiResponse getMeasurments() {
        List<MeasurmentEntity> all = measurmentRepository.findAll();
        ApiResponse success = baseResponse.getSUCCESS();
        success.setData(all);
        return success;
    }

    public ApiResponse updateMeasurment(MeasurmentDto measurmentdto, Long id) {
        Optional<MeasurmentEntity> byId = measurmentRepository.findById(id);
        if (byId.isEmpty()) return baseResponse.getNOT_FOUND();
        MeasurmentEntity measurmentEntity = byId.get();
        measurmentEntity.setName(measurmentdto.getName());
        measurmentEntity.setActive(measurmentdto.isActive());
        measurmentRepository.save(measurmentEntity);
        return baseResponse.getSUCCESS();
    }
}
