package rzeszow.gitaliano.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import rzeszow.gitaliano.dao.SizeRepository;
import rzeszow.gitaliano.entity.Size;
import rzeszow.gitaliano.service.SizeService;

import java.util.List;

/**
 * Created by kobeb on 14.01.2017.
 */
public class SizeServiceImplementation implements SizeService {

    @Autowired
    SizeRepository sizeRepository;

    public Size add(Size size) {
        return sizeRepository.saveAndFlush(size);
    }

    public void delete(long id) {
        sizeRepository.delete(id);
    }

    public Size update(Size size) {
        return sizeRepository.saveAndFlush(size);
    }

    public List<Size> getAll() {
        return sizeRepository.findAll()
                ;
    }
}
