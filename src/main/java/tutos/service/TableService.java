package tutos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tutos.nosql.Table;
import tutos.nosql.TableDTO;
import tutos.nosql.TableRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class TableService {
    @Autowired
    private TableRepository tableRepository;

    public TableDTO findById(String id) {
        Table table = tableRepository.findById(id).orElse(null);
        TableDTO tableDto = TableDTO.builder()
                .id(table.getId())
                .name(table.getName())
                .species(table.getSpecies())
                .breed(table.getBreed())
                .build();
        return tableDto;
    }

    public TableDTO.All findAll(){
        List<Table> tableList = tableRepository.findAll();
        return convert(tableList);
    }

    public TableDTO.All convert(List<Table> tableList){
        List<TableDTO> tbList = new ArrayList<>();
        for(Table item : tableList){
            TableDTO table =TableDTO.builder()
                    .id(item.getId())
                    .breed(item.getBreed())
                    .name(item.getName())
                    .species(item.getSpecies())
                    .build();

            tbList.add(table);
        }
        return TableDTO.All.builder().all(tbList).build();
    }
//    public TableDTO.All findAll(){ return tableRepository.findAll(); }
}
