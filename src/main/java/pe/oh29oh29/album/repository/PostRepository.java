package pe.oh29oh29.album.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import pe.oh29oh29.album.model.Post;

@NoRepositoryBean
public interface PostRepository extends JpaRepository<Post, String> {
}
