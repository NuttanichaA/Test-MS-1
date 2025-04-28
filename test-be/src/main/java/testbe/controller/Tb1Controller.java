package testbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testbe.enttity.Tb1;
import testbe.service.Tb1Service;

import java.util.List;

@RestController
@RequestMapping("/api/Tb1")
public class Tb1Controller {
    @Autowired
    private Tb1Service service;

    @GetMapping("/all")
    public ResponseEntity<List<Tb1>> getAllData(){
        return ResponseEntity.ok(service.getAllData());
    }
}
