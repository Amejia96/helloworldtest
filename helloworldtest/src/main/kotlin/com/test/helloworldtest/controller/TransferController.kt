package com.test.helloworldtest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/helloworld")

class TransferController {

    /*
    @PostMapping("/new")
    fun newTransfer() {
        System.out.println("Saved")
    }*/

    @GetMapping("")
    fun getAllTransfers(): String{
        return "Hello World"
    }
}