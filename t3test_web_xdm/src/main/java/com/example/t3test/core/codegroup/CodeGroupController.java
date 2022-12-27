package com.example.t3test.core.codegroup;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class CodeGroupController {
    private final CodeGroupService codeGroupService;
    @RequestMapping(value = "/list")
    public String CodeGroupList(Model model) throws Exception{
            model.addAttribute("list", codeGroupService.selectList());
        return "infra/codegroup/codeGroupList";
    }
    @RequestMapping(value= "/insert")
    public String CodeGroupInst(CodeGroup dto) throws  Exception {
            codeGroupService.insert(dto);
        return "redirect:/list";
    }
    @RequestMapping(value= "/update")
    public String CodeGroupUpdt(CodeGroup dto) throws  Exception {
            codeGroupService.update(dto);
        return "redirect:/list";
    }
    @RequestMapping(value= "/form")
    public String CodeGroupForm(CodeGroupVo vo) throws  Exception {;
        return "infra/codegroup/codeGroupForm";
    }
    @RequestMapping(value= "/view")
    public String CodeGroupView(Model model, CodeGroupVo vo) throws  Exception {

        System.out.println(vo.getCodeGroupSeq());
        model.addAttribute("item", codeGroupService.selectOne(vo));

        return "infra/codegroup/codeGroupForm";
    }
}