package cn.finte.code.service.web;

import cn.finte.code.core.config.Constants;
import cn.finte.code.core.model.Result;
import cn.finte.code.entity.data.Code;
import cn.finte.code.service.config.BaseController;
import cn.finte.code.service.model.condition.CodeCondition;
import cn.finte.code.service.service.CodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by lijian on 2017/5/10.
 */
@RestController
@RequestMapping("/api/dataController")
@Api(value = "数据操作",description = "数据操作")
public class DataController extends BaseController{

    private final Logger log = LoggerFactory.getLogger(DataController.class);


    @Inject
    private CodeService codeService;

    @RequestMapping(value = "/saveData",method = RequestMethod.POST)
    @ApiOperation(value = "保存数据",notes = "保存数据")
    public Result saveCode(@Validated @RequestBody CodeCondition condition, @RequestHeader(value = Constants.HEADER) String token){
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

    @RequestMapping(value = "/findByPage",method = RequestMethod.GET)
    @ApiOperation(value = "分页查询",notes = "分页查询")
    public Result findByPage(@RequestHeader(value = "x-token") String token) {
        return null;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @ApiOperation(value = "删除操作",notes = "删除操作")
    public Result delete(@RequestParam String id, @RequestHeader(value = Constants.HEADER) String token) {
        try {
            Boolean result = codeService.deleteById(id);
            if(result){
                return new Result(Result.ReturnValue.SUCCESS,"");
            }
            return new Result(Result.ReturnValue.FAILURE, Constants.ERROR,"保存失败");
        }catch (Exception e){
            log.error(e.getMessage(),e);
            return new Result(Result.ReturnValue.FAILURE, Constants.ERROR);
        }
    }

    @RequestMapping(value = "/sync",method = RequestMethod.POST)
    @ApiOperation(value = "app数据同步",notes = "app数据同步")
    public Result sync(@RequestBody List<Code> codeList){
        return null;
    }
}
