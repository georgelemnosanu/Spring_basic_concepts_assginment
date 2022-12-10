package com.siit.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class CatalogueController {
    private final CatalogueService catalogueService;

    public CatalogueController(CatalogueService catalogueService) {
        this.catalogueService = catalogueService;
    }

    @GetMapping("/students")
    public String getAllStudents() throws FileNotFoundException {

        return catalogueService.createStudentCatalogue();
    }

}
