package tutos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tutos.nosql.TableDTO;
import tutos.rsql.ApiRepository;
import tutos.rsql.ApiTable;
import tutos.rsql.ApiTableDTO;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApiTableService {
    @Autowired
    private ApiRepository apiRepository;

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
