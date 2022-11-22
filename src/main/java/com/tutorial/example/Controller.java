package com.tutorial.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @Autowired
    private AlbumService service;

    @GetMapping("/albums")
    public String albums() {
        return service.getAlbumList();
    }
}
