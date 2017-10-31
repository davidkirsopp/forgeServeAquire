package com.swoopdata.forgeserve.aquire.repository.search;

import com.swoopdata.forgeserve.aquire.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
