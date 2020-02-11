package tutos.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutos.nosql.TableDTO;
import tutos.rsql.ApiRepository;
import tutos.rsql.ApiTable;
import tutos.rsql.ApiTableDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiTableService {
    private final ApiRepository apiRepository;

    @Autowired
    public ApiTableService(ApiRepository apiRepository){
        this.apiRepository = apiRepository;
    }

    public ApiTableDTO findByUserNo(Integer userNo){
        ApiTable apiTable = apiRepository.findByUserNo(userNo).orElse(new ApiTable());

        return ApiTableDTO.builder()
                .userNo(apiTable.getUserNo())
                .userId(apiTable.getUserId())
                .userTel(apiTable.getUserTel())
                .build();
    }

//    public ApiTableDTO.All convert(List<ApiTable> tableList){
//        List<ApiTableDTO> tbList = new ArrayList<>();
//        for(ApiTable item : tableList){
//            ApiTableDTO apiTable = ApiTableDTO.builder()
//                    .userId(item.getUserId())
//                    .userNo(item.getUserNo())
//                    .userTel(item.getUserTel())
//                    .build();
//
//            tbList.add(apiTable);
//        }
//        return ApiTableDTO.All.builder().all(tbList).build();
//    }
}
