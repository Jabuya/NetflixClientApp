package com.cat2client.clientapp.Feign;

import com.cat2client.clientapp.FeignConfig;
import com.cat2client.clientapp.Models.ProductionCompany;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "productioncompany",url = "https://mock-netflix-api.herokuapp.com", configuration = FeignConfig.class)
public interface ProductionCompanyFeign {
    @RequestMapping(method = RequestMethod.POST, value = "companies")
    ProductionCompany newProductionCompany(@RequestBody ProductionCompany productionCompany);

    @RequestMapping(method = RequestMethod.PATCH, value = "companies/{id}")
   ProductionCompany update_company(@PathVariable(name = "id") int id, @RequestBody ProductionCompany productionCompany);

   @RequestMapping(method = RequestMethod.DELETE, value = "companies/{id}")
   ProductionCompany delete_company(@PathVariable(name="id")int id);
}
