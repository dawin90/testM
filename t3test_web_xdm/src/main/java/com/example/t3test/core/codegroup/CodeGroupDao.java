package com.example.t3test.core.codegroup;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface CodeGroupDao {
    List<CodeGroup> selectList();
    int insert(CodeGroup dto);
    int update(CodeGroup dto);
    CodeGroup selectOne(CodeGroupVo vo);
}
