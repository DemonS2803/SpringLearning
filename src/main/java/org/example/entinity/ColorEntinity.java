package org.example.entinity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "colr_table")
public class ColorEntinity {

    @Id
    @Column(name = "id_color")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @Column(name = "color_name")
    private String colorName;

    @Column(name = "color_price")
    private Integer colorPrice;

}

