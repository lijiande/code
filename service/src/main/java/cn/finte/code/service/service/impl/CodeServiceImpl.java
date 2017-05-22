package cn.finte.code.service.service.impl;

import cn.finte.code.entity.data.Code;
import cn.finte.code.service.mapper.CodeMapper;
import cn.finte.code.service.service.CodeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by lijian on 2017/5/10.
 */
@Transactional
@Service("codeService")
public class CodeServiceImpl extends ServiceImpl<CodeMapper,Code> implements CodeService {

    @Override
    public Code encoder(Code code) {
        return code;
    }

    @Override
    public Code init(Code code) {
        code.setCreateTime(new Date());
        code.setModifyTime(new Date());
        return code;
    }
}
