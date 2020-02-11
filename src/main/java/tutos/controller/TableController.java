package tutos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tutos.nosql.TableDTO;
import tutos.service.TableService;

@RestController
@RequestMapping("/table")
public class TableController {
    private TableService tableService;

    @Autowired
    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TableDTO findById(@PathVariable("id") String id){
        return tableService.findById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public TableDTO.All findAll(){
        return tableService.findAll();
    }
}
