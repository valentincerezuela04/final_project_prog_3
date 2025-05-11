import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "reviews")
@Check(constraints = "rating >= 0.5 AND rating <= 5.0")
/// Constraint para el rating
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long review_id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @Column(name = "rating",nullable = true,precision = 2,scale = 1,columnDefinition = "DECIMAL(2,1) DEFAULT 5.0")
    /// scale indica el numero de decimales
    /// precision indica que el maximo de digitos en total es 2
    /// Si no se agrega un rating, el default es 5.0
    private Double rating;

    @Column(name = "description",nullable = true)
    private String description;

    @CreationTimestamp /// Automaticamente asigna fecha y hora actuales cuando se guarda la entidad en la db.Precaucion, si no guardo la entidad, el valor del campo estara vacio
    @Column(nullable = false, updatable = false) /// Me aseguro que el campo no se pueda actualizar una vez creado
    private LocalDateTime date;

}
