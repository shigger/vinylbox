package com.higginss.vinylbox.controller;

import org.springframework.web.bind.annotation.*;

/**
 * <u>VinylBox RESTful Web Service Layer</u>
 *
 * <u>Design Notes</u>
 * <p>
 * For consideration: it might be beneficial to create individual nano-services for each CRUD type operation (but these
 * decisions depend on the use-cases and the minimal viable product suitable for the business use-case etc).
 * <p>
 * If the use-cases were to 'grow' and become more complex recommend introducing some form of delegation/mediator
 * pattern to handle/encapsulate the business logic and handle communications with the DAO (business object).
 *
 * @author higginss
 */
@RestController
@RequestMapping("/api/v1")
public class VinylBoxController {
    /**
     * Upload an article to the database: example uri = http://localhost:8080/api/v1/article/ with posted data =
     * {"author":"Stephen Higgins", "headline":"MongoDB Rocks!", "content":"This is an experiment in lightweight
     * micro-service work.", "topics":["technology","news"]} thus creating a new article all the time.
     *
     * @param id the article to upload containing content and a list of topics (treated as embedded documents).
     * @return the article just uploaded containing the unique identifier assigned to it.
     */
    @GetMapping(value = "/vinyl/{id}")
    public String getVinyl(@PathVariable String id) {
        System.out.println("vinyl received to process = " + id);
        return id + "- processed";
    }
}
