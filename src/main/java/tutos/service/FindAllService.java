package tutos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tutos.nosql.Table;
import tutos.nosql.TableDTO;
import tutos.nosql.TableRepository;

import java.util.List;

@Component
public class FindAllService {
    @Autowired
    private TableRepository tableRepository;

    public Table findById(String id) { return tableRepository.findById(id).orElse(null); }

    public List<Table> findAll(){ return tableRepository.findAll(); }
//    public TableDTO.All findAll(){ return tableRepository.findAll(); }
}
