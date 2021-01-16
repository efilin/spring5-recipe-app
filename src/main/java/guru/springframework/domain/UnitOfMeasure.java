package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by efilin on 13.01.2021.
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
