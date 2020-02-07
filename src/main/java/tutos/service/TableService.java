package tutos.service;

import com.zeronsoftn.zeroback.SolutionLog;
import com.zeronsoftn.zeroback.SolutionLogger;
import com.zeronsoftn.zeromon.server.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tutos.nosql.Table;
import tutos.nosql.TableDTO;
import tutos.nosql.TableRepository;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
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

        HashMap<String, Object> data = new HashMap<>();
        data.put("data1", tableDto);

        log.debug("/table/id");
        SolutionLog.builder()
                .withRemoteAddress("localhost")
                .withRemoteUserAgent("LoggerTest")
                .withAction("findById")
                .withUser(SolutionLog.User.builder()
                    .userId("Test By AJ")
                    .userName("Test By AJ")
                    .autzName("Test By AJ")
                    .companyId("Test By AJ")
                    .departmentName("Test By AJ")
                    .build())
                .withMessage("findById is processing")
                .withData(data)
                .warn();

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
