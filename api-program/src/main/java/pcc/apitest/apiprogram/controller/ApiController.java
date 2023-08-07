package pcc.apitest.apiprogram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pcc.apitest.apiprogram.entity.ApiEntity;
import pcc.apitest.apiprogram.model.ApiModel;
import pcc.apitest.apiprogram.response.ResponseApi;
import pcc.apitest.apiprogram.response.ResponseData;
import pcc.apitest.apiprogram.service.ApiService;



@RestController
@RequestMapping("/apiController")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/gentoken")
    public ResponseEntity<?>generateToken(@RequestBody ApiModel apiModel) {
        try {
            ApiEntity apiEntity = apiService.insert(apiModel);
            return ResponseEntity.ok(createSuccessResponse(apiEntity.getUserId(),apiEntity.getTokenId()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(createErrorResponse(apiModel));
        }
    }

    private Object createSuccessResponse(String userId, String tokenId) {
        return new ResponseApi("I07000", "ทำรายการเรียบร้อย", new ResponseData(userId, tokenId));
    }

    private Object createErrorResponse(ApiModel apiModel) {
        return new ResponseApi("E000001", "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้",
                new ResponseData(apiModel.getUserId(), ""));
    }
}