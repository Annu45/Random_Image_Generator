package com.example.demo.controller;

import com.example.demo.model.DogResponse;
import com.example.demo.service.DogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DogController {

    @Autowired
    private DogService dogService;

    @Operation(summary = "Get a random dog image", description = "Fetches a random dog image from the Dog API and displays it in an HTML page.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully fetched and displayed the dog image"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping("/dog")
    public String getDogImage(Model model) {
        DogResponse response = dogService.getRandomDogImage();
        model.addAttribute("imageUrl", response.getMessage());
        return "dog";  // Renders dog.html
    }
}
