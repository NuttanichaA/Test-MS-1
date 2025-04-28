package testbe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testbe.enttity.Tb1;
import testbe.repo.Tb1Repo;

import java.util.List;

@Service
public class Tb1Service {
    @Autowired
    private Tb1Repo repo;

    public List<Tb1> getAllData(){
        return repo.findAll();
    }
}
