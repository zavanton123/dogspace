package ru.zavanton.dogspace.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import ru.zavanton.dogspace.domain.Post;

public interface PostRepositoryWithBagRelationships {
    Optional<Post> fetchBagRelationships(Optional<Post> post);

    List<Post> fetchBagRelationships(List<Post> posts);

    Page<Post> fetchBagRelationships(Page<Post> posts);
}
