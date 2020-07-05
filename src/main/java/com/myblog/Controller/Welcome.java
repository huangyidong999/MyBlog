package com.myblog.Controller;

import com.myblog.mapper.CategoryMapper;
import com.myblog.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Lucifer on 2018/6/20.
 */
@Controller
public class Welcome {

    @Autowired
    public CategoryMapper categoryMapper;

    @RequestMapping("/")
    public String listCategory(Model model){
        List<Category> cs = categoryMapper.findAll();
        model.addAttribute("cs",cs);
        return "welcome";
    }
}
