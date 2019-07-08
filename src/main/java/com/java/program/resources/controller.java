package com.java.program.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller/")
@Api(value=" controller", description=" This is  controller")
public class controller {
    @ApiOperation(value="This Method return ALL ")
    @RequestMapping("/ALL")
    public int ALL() {
    int a = 120;
    int b = 10;
    int c= 40;
    return a+b*c;
}
}

