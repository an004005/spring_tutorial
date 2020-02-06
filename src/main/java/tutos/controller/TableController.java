package tutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.
import tutos.nosql.TableDTO;
import tutos.nosql.TableRepository;

import java.util.List;

@RestController
@RequestMapping("/table")
public class TableController {
    @Autowired
    private TableRepository repository;

    @RequestMapping("id", method = RequestMethod.GET)
    public List<TableDTO.One>


}
