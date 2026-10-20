package ie.atu.cicd1.catalog.cicd1orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ie.atu.cicd1.catalog.cicd1orderservice.dto.ProductResponse;

@FeignClient(name = "catalog-service", url = "${catalog.service.url}")
public interface CatalogClient {
    @GetMapping("/products/{id}")
    ProductResponse getProductById(@PathVariable("id") Long id);
}
