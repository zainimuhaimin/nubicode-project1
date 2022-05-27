package id.nubicode.projek1.features.motel.rest;

import id.nubicode.projek1.features.motel.model.MotelReqDto;
import id.nubicode.projek1.features.motel.model.MotelRespDto;
import id.nubicode.projek1.features.motel.service.MotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MotelRest {

    @Autowired
    MotelService motelService;

    @PostMapping("/motel")
    ResponseEntity<MotelRespDto<MotelReqDto>> post(@RequestBody MotelReqDto body){
        return motelService.save(body);
    }

    @GetMapping("/motel")
    List<MotelReqDto> findAll(){
        return motelService.findAll();
    }

}
