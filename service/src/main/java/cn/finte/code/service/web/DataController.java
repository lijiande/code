package cn.finte.code.service.web;

import cn.finte.code.core.model.Result;
import cn.finte.code.entity.data.Code;
import cn.finte.code.service.mapper.CodeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private CodeMapper codeMapper;

    @RequestMapping(value = "/saveData",method = RequestMethod.POST)
    public Result saveCode(@RequestBody Code code){
        return null;
    }
}
