package cn.finte.code.service.web;

import cn.finte.code.core.config.Constants;
import cn.finte.code.core.model.Result;
import cn.finte.code.entity.data.Code;
import cn.finte.code.service.model.condition.CodeCondition;
import cn.finte.code.service.service.CodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by lijian on 2017/5/10.
 */
@RestController
@RequestMapping("/api/dataController")
public class DataController {

    private final Logger log = LoggerFactory.getLogger(DataController.class);


    @Inject
    private CodeService codeService;

    @RequestMapping(value = "/saveData",method = RequestMethod.POST)
    public Result saveCode(@Validated @RequestBody CodeCondition condition){
        try {
            Code code = new Code();
            BeanUtils.copyProperties(condition,code);
            code = codeService.init(code);
            code = codeService.encoder(code);
            Boolean result = codeService.insert(code);
            if(result){
                return new Result(Result.ReturnValue.SUCCESS,"");
            }
            return new Result(Result.ReturnValue.FAILURE, Constants.ERROR,"保存失败");
        }catch (Exception e) {
            log.error(e.getMessage(),e);
            return new Result(Result.ReturnValue.FAILURE, Constants.ERROR);
        }
    }
}
