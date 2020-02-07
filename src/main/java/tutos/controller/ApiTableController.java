package tutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tutos.rsql.ApiRepository;
import tutos.rsql.ApiTableDTO;
import tutos.service.ApiTableService;

@RestController
@RequestMapping("/api")
public class ApiTableController {
    @Autowired
    private ApiTableService apiTableService;

    @RequestMapping(value = "/{userNo}", method = RequestMethod.GET)
    public ApiTableDTO findByuserNo(@PathVariable("userNo") Integer userNo){
        return apiTableService.findByUserNo(userNo);
    }


}
