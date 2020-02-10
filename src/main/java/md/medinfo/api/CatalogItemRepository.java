package md.medinfo.api;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Table;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "prices", path = "prices")
public interface CatalogItemRepository extends CrudRepository<CatalogItem, Long> {
    List<CatalogItem> findByCodulMedicamentului(@Param("codulMedicamentului") String codulMedicamentului);


}