package com.example.spingboot_aws;
@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "Hello, AWS!";
    }
}