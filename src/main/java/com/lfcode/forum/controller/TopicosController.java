package com.lfcode.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RestMapping("/topicos")
public class TopicosController {



}
