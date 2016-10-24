package rzeszow.gitaliano.service;

import rzeszow.gitaliano.entity.Size;

import java.util.List;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface SizeService {
    Size add(Size size);
    void delete(long id);
    Size update(Size size);
    List<Size> getAll();
}
