package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository){
        super();
        this.brandRepository=brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
