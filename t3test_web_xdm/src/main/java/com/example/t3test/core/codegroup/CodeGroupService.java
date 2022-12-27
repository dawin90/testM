package com.example.t3test.core.codegroup;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CodeGroupService {
    private final CodeGroupDao codeGroupDao;
    public List<CodeGroup> selectList() {
        return codeGroupDao.selectList();
    }
    public int insert(CodeGroup dto) {
        return codeGroupDao.insert(dto);
    }
    public int update(CodeGroup dto) {
        return codeGroupDao.update(dto);
    }
    public CodeGroup selectOne(CodeGroupVo vo) {
        return codeGroupDao.selectOne(vo);
    }

}
