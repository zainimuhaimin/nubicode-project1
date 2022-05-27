package id.nubicode.projek1.features.motel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MotelRespDto<T> implements Serializable {
    private Boolean status;
    private String message;
    private T payload;
}
