package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandControllers {

    private BrandService brandService;

    @Autowired
    public BrandControllers(BrandService brandService){
        super();
        this.brandService=brandService;
    }

    @GetMapping("/getAll")
    public List<Brand> getAll() {
        return brandService.getAll();
    }

}
