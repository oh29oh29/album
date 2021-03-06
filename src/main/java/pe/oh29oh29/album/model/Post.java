package pe.oh29oh29.album.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class Post {

    @Id
    private String id;

    @Column
    private String categoryId;

    @Column
    private String description;

    @Column
    private String uploadDate;

    @Column
    private String realDate;

    @Column
    private String imageUrl;
}
