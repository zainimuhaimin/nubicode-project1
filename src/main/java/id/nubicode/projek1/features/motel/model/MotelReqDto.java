package id.nubicode.projek1.features.motel.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "Motel_Data")
@Entity
public class MotelReqDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "motel_id")
    private Long Id;

    @Column(name = "motel_name")
    private String motelName;

    @Column(name = "city")
    private String city;

    @Column(name = "price")
    private Double price;
}
