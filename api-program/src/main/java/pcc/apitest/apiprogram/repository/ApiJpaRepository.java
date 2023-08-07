package pcc.apitest.apiprogram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pcc.apitest.apiprogram.entity.ApiEntity;

@Repository
public interface ApiJpaRepository extends JpaRepository<ApiEntity, Long> {
}
