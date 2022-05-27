package id.nubicode.projek1.features.motel.service;

import id.nubicode.projek1.features.motel.model.MotelReqDto;
import id.nubicode.projek1.features.motel.model.MotelRespDto;
import id.nubicode.projek1.features.motel.repo.MotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotelService {
    @Autowired
    MotelRepo motelRepo;

    public List<MotelReqDto> findAll(){
        return motelRepo.findAll();
    }
    public ResponseEntity<MotelRespDto<MotelReqDto>> save(MotelReqDto body){

     MotelReqDto motelReqDto = new MotelReqDto();

     motelReqDto.setMotelName(body.getMotelName());
     motelReqDto.setCity(body.getCity());
     motelReqDto.setPrice(body.getPrice());

    MotelRespDto motelRespDto = new MotelRespDto();
    motelRespDto.setMessage("Berhasil");
    motelRespDto.setStatus(true);
    motelRespDto.setPayload(motelRepo.save(body));

    return ResponseEntity.status(HttpStatus.CREATED).body(motelRespDto);
    }
}
