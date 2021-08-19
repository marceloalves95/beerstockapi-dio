package br.com.beerstockapidio.entity;

import br.com.beerstockapidio.enums.BeerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author RubioAlves
 * Created 19/08/2021 at 10:21
 */

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private int max;

    @Column(nullable = false)
    private int quantity;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BeerType type;

}
