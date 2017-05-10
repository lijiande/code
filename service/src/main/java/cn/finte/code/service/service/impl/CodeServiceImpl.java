package cn.finte.code.service.service.impl;

import cn.finte.code.entity.data.Code;
import cn.finte.code.service.mapper.CodeMapper;
import cn.finte.code.service.service.CodeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Created by lijian on 2017/5/10.
 */
@Service("codeService")
public class CodeServiceImpl extends ServiceImpl<CodeMapper,Code> implements CodeService {
}
