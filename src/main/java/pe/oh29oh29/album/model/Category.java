package pe.oh29oh29.album.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class Category {

    @Id
    private String id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String durationFrom;

    @Column
    private String durationTo;
}
