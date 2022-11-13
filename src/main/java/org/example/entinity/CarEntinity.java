package org.example.entinity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "car_table")
public class CarEntinity {

    @Id
    @Column(name = "id_car")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "color_id")
    private Integer colorId;
}
