package pcc.apitest.apiprogram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import pcc.apitest.apiprogram.entity.ApiEntity;
import pcc.apitest.apiprogram.model.ApiModel;
import javax.transaction.Transactional;
import java.util.Date;@Validated
@Service
@Transactional
public class ApiService {

    @Autowired
    private JpaRepository jpaRepository;

    public ApiEntity insert(ApiModel apiModel) {
        ApiEntity entity = getData(apiModel);
        return (ApiEntity) jpaRepository.save(entity);
    }

    public ApiEntity getData(ApiModel apiModel) {
        ApiEntity entities = new ApiEntity();
        entities.setSsoType(apiModel.getSsoType());
        entities.setSystemId(apiModel.getSystemId());
        entities.setSystemName(apiModel.getSystemName());
        entities.setSystemTransactions(apiModel.getSystemTransactions());
        entities.setSystemPrivileges(apiModel.getSystemPrivileges());
        entities.setSystemUserGroup(apiModel.getSystemUserGroup());
        entities.setSystemLocationGroup(apiModel.getSystemLocationGroup());
        entities.setUserId(apiModel.getUserId());
        entities.setUserFullName(apiModel.getUserFullName());
        entities.setUserRdOfficeCode(apiModel.getUserRdOfficeCode());
        entities.setUserOfficeCode(apiModel.getUserOfficeCode());
        entities.setClientLocation(apiModel.getClientLocation());
        entities.setLocationMachineNumber(apiModel.getLocationMachineNumber());
        entities.setTokenId(apiModel.getTokenId());
        entities.setRequestDate(new Date());
        return entities;
    }
}
